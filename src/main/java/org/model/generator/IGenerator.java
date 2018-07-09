package org.model.generator;

public interface IGenerator<T> {

    default T generateValue(boolean metadataPresent) {
        return metadataPresent ? generateAnnotatedValue() : generateNonAnnotatedValue();
    }

    T generateAnnotatedValue();

    T generateNonAnnotatedValue();
}