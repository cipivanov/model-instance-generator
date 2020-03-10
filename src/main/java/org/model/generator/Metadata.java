package org.model.generator;

public abstract class Metadata {

    private Class type;
    private String pattern;
    private String defaultPattern;

    public Metadata(Class type, String pattern) {
        this.type = type;
        this.pattern = pattern;
    }

    public Class getType() {
        return type;
    }

    public void setType(Class type) {
        this.type = type;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public String getDefaultPattern() {
        return defaultPattern;
    }

    public void setDefaultPattern(String defaultPattern) {
        this.defaultPattern = defaultPattern;
    }
}