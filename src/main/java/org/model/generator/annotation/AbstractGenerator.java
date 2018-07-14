package org.model.generator.annotation;

import com.mifmif.common.regex.Generex;
import org.model.generator.IGenerator;
import org.model.generator.Metadata;

public abstract class AbstractGenerator<T> implements IGenerator<T> {

    private Metadata metaData;

    public AbstractGenerator(Metadata metaData) {
        this(metaData, "");
    }

    public AbstractGenerator(Metadata metaData, String defaultPattern) {
        this.metaData = metaData;
        this.metaData.setDefaultPattern(defaultPattern);
    }

    public abstract T generateAnnotatedValue(String rawValue);

    public Metadata getMetaData() {
        return metaData;
    }

    @Override
    public T generateNonAnnotatedValue() {
        return generateAnnotatedValue(generateRawValue(metaData.getDefaultPattern()));
    }

    @Override
    public T generateAnnotatedValue() {
        return generateAnnotatedValue(generateRawValue(metaData.getPattern()));
    }

    private String generateRawValue(final String pattern) {
        Generex generex = new Generex(pattern);
        return generex.random();
    }
}