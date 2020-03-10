package org.model.generator.type.impl;

import org.model.generator.InstanceGenerator;
import org.model.generator.Metadata;
import org.model.generator.annotation.AbstractGenerator;

public class UserDefinedGenerator extends AbstractGenerator {

    public UserDefinedGenerator(Metadata metaData) {
        super(metaData);
    }

    @Override
    public Object generateAnnotatedValue() {
        throw new RuntimeException("User defined fields should not be annotated"); //FIXME: Will be thrown for primitives
    }

    @Override
    public Object generateAnnotatedValue(String rawValue) {
        // should never get called
        return null;
    }

    @Override
    @SuppressWarnings("unckecked")
    public Object generateNonAnnotatedValue() {
        return InstanceGenerator.of(getMetaData().getType());
    }
}