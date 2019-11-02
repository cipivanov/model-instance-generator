package org.model.generator.type.impl;

import org.junit.Test;
import org.model.generator.Metadata;
import org.model.generator.annotation.AnnotationMetadata;
import org.model.generator.annotation.AutoValue;

import java.lang.reflect.Field;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

public class DoubleGeneratorTest {

    @Test
    public void shouldGenerateDoubleValue() {
        Metadata metadata = new AnnotationMetadata(getField("doubleField").get());
        DoubleGenerator doubleGenerator = new DoubleGenerator(metadata);
        assertThat(doubleGenerator.generateAnnotatedValue()).isInstanceOf(Double.class);
    }

    private Optional<Field> getField(String fieldName) {
        try {
            return Optional.of(Class.class.getDeclaredField(fieldName));
        } catch (NoSuchFieldException exception) {
            return Optional.empty();
        }
    }

    private class Class {

        @AutoValue(pattern = "[1-9]\\.[0-9]{2}")
        private Double doubleField;
    }
}