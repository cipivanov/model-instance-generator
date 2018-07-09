package org.model.generator.type.impl;

import org.model.generator.Metadata;
import org.model.generator.annotation.AbstractGenerator;

public class LongGenerator extends AbstractGenerator<Long> {

    public LongGenerator(Metadata metaData) {
        super(metaData, "[0-9]\\.[0-9]");
    }

    @Override
    public Long generateAnnotatedValue(String rawValue) {
        return Long.valueOf(rawValue);
    }
}