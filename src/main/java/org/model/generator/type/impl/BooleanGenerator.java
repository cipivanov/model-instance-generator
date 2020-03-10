package org.model.generator.type.impl;

import org.model.generator.Metadata;
import org.model.generator.annotation.AbstractGenerator;

public class BooleanGenerator extends AbstractGenerator<Boolean> {

    public BooleanGenerator(Metadata metaData) {
        super(metaData, "false");
    }

    @Override
    public Boolean generateAnnotatedValue(String rawValue) {
        return Boolean.valueOf(rawValue);
    }
}
