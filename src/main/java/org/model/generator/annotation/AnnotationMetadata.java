package org.model.generator.annotation;

import org.model.generator.Metadata;

import java.lang.reflect.Field;

public class AnnotationMetadata extends Metadata {

    public AnnotationMetadata(Field field) {
        super(field.getType(),
                field.isAnnotationPresent(AutoValue.class) ? field.getAnnotation(AutoValue.class).pattern() : "empty"); //TODO
    }
}