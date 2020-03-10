package org.model.generator.type.impl;

import org.model.generator.Metadata;
import org.model.generator.annotation.AbstractGenerator;
import org.model.generator.type.impl.utils.DateGeneratorType;
import org.model.generator.type.impl.utils.DateUtils;

import java.time.LocalDate;

public class LocalDateGenerator extends AbstractGenerator<LocalDate> {

    public LocalDateGenerator(Metadata metaData) {
        super(metaData);
    }

    @Override
    public LocalDate generateAnnotatedValue() {
        switch (DateGeneratorType.getEnumByRegex(getMetaData().getPattern())) {
            case PAST:
                return DateUtils.getRandomPastDate();
            case FUTURE:
                return DateUtils.getRandomFutureDate();
            default:
                return DateUtils.getCurrentDate();
        }
    }

    @Override
    public LocalDate generateAnnotatedValue(String rawValue) {
        // should never get called
        return null;
    }

    @Override
    public LocalDate generateNonAnnotatedValue() {
        return DateUtils.getCurrentDate();
    }
}
