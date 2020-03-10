package org.model.generator.type.impl;

import org.model.generator.Metadata;
import org.model.generator.annotation.AbstractGenerator;

public class IntegerGenerator extends AbstractGenerator<Integer> {

    public IntegerGenerator(Metadata metaData) {
        super(metaData, "[0-9]");
    }

    @Override
    public Integer generateAnnotatedValue(String rawValue) {
        return Integer.valueOf(rawValue);
    }
}