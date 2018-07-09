package org.model.generator.type.impl;

import org.model.generator.Metadata;
import org.model.generator.annotation.AbstractGenerator;

public class StringGenerator extends AbstractGenerator<String> {

    public StringGenerator(Metadata metaData) {
        super(metaData, "[A-Z]{3}");
    }

    @Override
    public String generateAnnotatedValue(String rawValue) {
        return rawValue;
    }
}