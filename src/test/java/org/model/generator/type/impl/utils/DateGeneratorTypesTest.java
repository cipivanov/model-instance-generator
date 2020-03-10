package org.model.generator.type.impl.utils;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DateGeneratorTypesTest {

    @Test
    public void shouldReturnFutureDateGeneratorType() {
        assertThat(DateGeneratorType.getEnumByRegex("future-date")).isEqualTo(DateGeneratorType.FUTURE);
    }

    @Test
    public void shouldReturnPastDateGeneratorType() {
        assertThat(DateGeneratorType.getEnumByRegex("past-date")).isEqualTo(DateGeneratorType.PAST);
    }
}
