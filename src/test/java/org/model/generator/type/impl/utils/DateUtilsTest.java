package org.model.generator.type.impl.utils;

import org.junit.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

public class DateUtilsTest {

    @Test
    public void shouldReturnFutureDate() {
        assertThat(DateUtils.getAnyFutureDate()).isAfter(LocalDate.now());
    }

    @Test
    public void shouldReturnPastDate() {
        assertThat(DateUtils.getAnyPastDate()).isBefore(LocalDate.now());
    }
}
