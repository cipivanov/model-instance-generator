package org.model.generator.type;

public enum DateGenerationType {

    FUTURE("future-date"),
    PAST("past-date");

    private String regex;

    DateGenerationType(String regex) {
        this.regex = regex;
    }

    public static DateGenerationType getEnumByRegex(String regex) {
        for (DateGenerationType dateGenerationType : DateGenerationType.values()) {
            if (dateGenerationType.regex.equals(regex)) {
                return dateGenerationType;
            }
        }
        throw new RuntimeException("Enum with the <" + regex + "> regex not found");
    }
}