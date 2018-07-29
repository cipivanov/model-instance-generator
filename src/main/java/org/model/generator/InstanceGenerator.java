package org.model.generator;

import org.model.generator.annotation.AutoValue;
import org.model.generator.exception.GenerationException;
import org.model.generator.type.TypeGeneratorProvider;

import java.lang.reflect.Field;
import java.util.stream.Stream;

public class InstanceGenerator {

    private InstanceGenerator() {
    }

    public static <T> T of(final Class<T> modelClass) {
        T modelInstance = getInstance(modelClass);
        Field[] fields = modelInstance.getClass().getDeclaredFields();
        Stream.of(fields)
                .filter(field -> !field.isSynthetic())
                .forEach(field -> setInstanceFieldValue(modelInstance, field));
        return modelInstance;
    }

    private static <T> T getInstance(Class<T> modelClass) {
        try {
            return modelClass.getConstructor().newInstance();
        } catch (Exception exception) {
            throw new GenerationException(exception); //FIXME
        }
    }

    private static <T> void setInstanceFieldValue(T modelInstance, Field field) {
        try {
            field.setAccessible(true);
            field.set(modelInstance, generateValue(field));
            field.setAccessible(false);
        } catch (IllegalAccessException exception) {
            throw new GenerationException(exception); //FIXME
        }

    }

    private static Object generateValue(Field field) {
        Boolean metadataPresent = field.isAnnotationPresent(AutoValue.class);
        return TypeGeneratorProvider.getGeneratorFor(field).generateValue(metadataPresent);
    }
}