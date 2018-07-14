package org.model.generator.type.impl.utils;

public enum DateGeneratorType {

    PAST("past-date"),
    FUTURE("future-date");

    private String regex;

    DateGeneratorType(String regex) {
        this.regex = regex;
    }

    public static DateGeneratorType getEnumByRegex(String regex) {
        for (DateGeneratorType dateGeneratorType : DateGeneratorType.values()) {
            if (dateGeneratorType.regex.equals(regex)) {
                return dateGeneratorType;
            }
        }
        throw new RuntimeException("Enum with the <" + regex + "> regex not found");
    }
}