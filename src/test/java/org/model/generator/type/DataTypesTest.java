package org.model.generator.type;

import org.junit.Test;
import org.model.generator.model.Payment;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

public class DataTypesTest {

    @Test
    public void shouldReturnLongDataType() {
        assertThat(DataTypes.getDataTypeEnum(Long.class)).isEqualTo(DataTypes.LONG);
    }

    @Test
    public void shouldReturnStringDataType() {
        assertThat(DataTypes.getDataTypeEnum(String.class)).isEqualTo(DataTypes.STRING);
    }

    @Test
    public void shouldReturnDoubleDataType() {
        assertThat(DataTypes.getDataTypeEnum(Double.class)).isEqualTo(DataTypes.DOUBLE);
    }

    @Test
    public void shouldReturnIntegerDataType() {
        assertThat(DataTypes.getDataTypeEnum(Integer.class)).isEqualTo(DataTypes.INTEGER);
    }

    @Test
    public void shouldReturnBooleanDataType() {
        assertThat(DataTypes.getDataTypeEnum(Boolean.class)).isEqualTo(DataTypes.BOOLEAN);
    }

    @Test
    public void shouldReturnUserDefinedDataType() {
        assertThat(DataTypes.getDataTypeEnum(Payment.class)).isEqualTo(DataTypes.USER_DEFINED);
    }

    @Test
    public void shouldReturnLocalDateDataType() {
        assertThat(DataTypes.getDataTypeEnum(LocalDate.class)).isEqualTo(DataTypes.LOCAL_DATE);
    }
}
