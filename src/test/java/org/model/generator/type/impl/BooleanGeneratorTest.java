package org.model.generator.type.impl;

import org.junit.Test;
import org.model.generator.Metadata;
import org.model.generator.annotation.AnnotationMetadata;
import org.model.generator.annotation.AutoValue;

import java.lang.reflect.Field;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

public class BooleanGeneratorTest {

    @Test
    public void shouldGenerateTrueBooleanValue() {
        Metadata metadata = new AnnotationMetadata(getField("trueField").get());
        BooleanGenerator booleanGenerator = new BooleanGenerator(metadata);
        assertThat(booleanGenerator.generateAnnotatedValue()).isTrue();
    }

    @Test
    public void shouldGenerateFalseBooleanValue() {
        Metadata metadata = new AnnotationMetadata(getField("falseField").get());
        BooleanGenerator booleanGenerator = new BooleanGenerator(metadata);
        assertThat(booleanGenerator.generateAnnotatedValue()).isFalse();

    }

    @Test
    public void shouldGenerateAnyBooleanValue() {
        Metadata metadata = new AnnotationMetadata(getField("trueFalseField").get());
        BooleanGenerator booleanGenerator = new BooleanGenerator(metadata);
        assertThat(booleanGenerator.generateAnnotatedValue()).isIn(true, false);
    }

    @Test
    public void shouldGenerateFalseForInvalidBooleanValue() {
        Metadata metadata = new AnnotationMetadata(getField("invalidPatternField").get());
        BooleanGenerator booleanGenerator = new BooleanGenerator(metadata);
        assertThat(booleanGenerator.generateAnnotatedValue()).isFalse();
    }

    private Optional<Field> getField(String fieldName) {
        try {
            return Optional.of(Class.class.getDeclaredField(fieldName));
        } catch (NoSuchFieldException exception) {
            return Optional.empty();
        }
    }

    private class Class {

        @AutoValue(pattern = "true")
        private Boolean trueField;

        @AutoValue(pattern = "false")
        private Boolean falseField;

        @AutoValue(pattern = "(true|false)")
        private Boolean trueFalseField;

        @AutoValue(pattern = "invalid")
        private Boolean invalidPatternField;
    }
}