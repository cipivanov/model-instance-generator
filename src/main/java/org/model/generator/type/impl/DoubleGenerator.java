package org.model.generator.type.impl;

import org.model.generator.Metadata;
import org.model.generator.annotation.AbstractGenerator;

public class DoubleGenerator extends AbstractGenerator<Double> {

    public DoubleGenerator(Metadata metaData) {
        super(metaData, "[0-9]\\.[0-9]");
    }

    @Override
    public Double generateAnnotatedValue(String rawValue) {
        return Double.valueOf(rawValue);
    }
}