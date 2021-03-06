package org.model.generator.type;

import java.time.LocalDate;

public enum DataTypes {

    LONG(Long.class),
    STRING(String.class),
    DOUBLE(Double.class),
    INTEGER(Integer.class),
    BOOLEAN(Boolean.class),
    USER_DEFINED(Object.class),
    LOCAL_DATE(LocalDate.class);

    private Class type;

    DataTypes(Class type) {
        this.type = type;
    }

    public static DataTypes getDataTypeEnum(Class type) {
        for (DataTypes dataType : DataTypes.values()) {
            if (dataType.type.equals(type)) {
                return dataType;
            }
        }
        return USER_DEFINED;
    }
}