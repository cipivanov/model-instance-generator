package org.model.generator.type;

import org.model.generator.IGenerator;
import org.model.generator.Metadata;
import org.model.generator.annotation.AnnotationMetadata;
import org.model.generator.type.impl.*;

import java.lang.reflect.Field;

public abstract class TypeGeneratorProvider {

    public static IGenerator getGeneratorFor(final Field field) {
        Metadata metaData = new AnnotationMetadata(field);
        switch (DataTypes.getDataTypeEnum(field.getType())) {
            case LOCAL_DATE:
                return new LocalDateGenerator(metaData);
            case INTEGER:
                return new IntegerGenerator(metaData);
            case STRING:
                return new StringGenerator(metaData);
            case DOUBLE:
                return new DoubleGenerator(metaData);
            case LONG:
                return new LongGenerator(metaData);
            case BOOLEAN:
                return new BooleanGenerator(metaData);
            default:
                return new UserDefinedGenerator(metaData);
        }
    }
}