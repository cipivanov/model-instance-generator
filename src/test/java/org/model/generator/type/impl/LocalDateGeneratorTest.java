package org.model.generator.type.impl;

import org.junit.Test;
import org.model.generator.Metadata;
import org.model.generator.annotation.AnnotationMetadata;
import org.model.generator.annotation.AutoValue;

import java.lang.reflect.Field;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

public class LocalDateGeneratorTest {

    @Test
    public void shouldGenerateDoubleValue() {
        Metadata metadata = new AnnotationMetadata(getField("integerField").get());
        IntegerGenerator integerGenerator = new IntegerGenerator(metadata);
        assertThat(integerGenerator.generateAnnotatedValue()).isInstanceOf(Integer.class);
    }

    private Optional<Field> getField(String fieldName) {
        try {
            return Optional.of(Class.class.getDeclaredField(fieldName));
        } catch (NoSuchFieldException exception) {
            return Optional.empty();
        }
    }

    private class Class {

        @AutoValue(pattern = "[0-9]{2}")
        private Integer integerField;
    }

}
