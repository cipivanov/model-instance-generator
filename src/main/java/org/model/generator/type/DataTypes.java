package org.model.generator.type;

import java.time.LocalDate;

public enum DataTypes {

    LONG(Long.class),
    STRING(String.class),
    DOUBLE(Double.class),
    INTEGER(Integer.class),
    USER_DEFINED(Object.class),
    LOCAL_DATE(LocalDate.class);

    private Class clazz;

    DataTypes(Class clazz) {
        this.clazz = clazz;
    }

    public static DataTypes getDataTypeEnum(Class clazz) {
        for (DataTypes dataType : DataTypes.values()) {
            if (dataType.clazz.equals(clazz)) {
                return dataType;
            }
        }
        return USER_DEFINED;
    }
}