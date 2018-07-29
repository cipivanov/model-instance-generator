package org.model.generator.annotation;

import org.junit.Test;

import java.lang.reflect.Field;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

public class AnnotationMetadataTest {

    @Test
    public void shouldExtractAnnotatedFieldMetadata() {
        AnnotationMetadata metadata = new AnnotationMetadata(getField("annotatedField").get());
        assertThat(metadata.getPattern()).isEqualTo("[0-9]");
    }

    @Test
    public void shouldExtractNonAnnotatedFieldMetadata() {
        AnnotationMetadata metadata = new AnnotationMetadata(getField("nonAnnotatedField").get());
        assertThat(metadata.getPattern()).isNull();
    }

    private Optional<Field> getField(String fieldName) {
        try {
            return Optional.of(Fields.class.getDeclaredField(fieldName));
        } catch (NoSuchFieldException exception) {
            return Optional.empty();
        }
    }

    private class Fields {
        @AutoValue(pattern = "[0-9]")
        private Integer annotatedField;
        private Integer nonAnnotatedField;
    }
}
