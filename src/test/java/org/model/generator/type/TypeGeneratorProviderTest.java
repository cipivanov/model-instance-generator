package org.model.generator.type;

import org.junit.Test;
import org.model.generator.IGenerator;
import org.model.generator.type.impl.*;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

public class TypeGeneratorProviderTest {

    @Test
    public void shouldProvideLongTypeGenerator() {
        IGenerator generator = TypeGeneratorProvider.getGeneratorFor(getFieldType("longField").get());
        assertThat(generator).isInstanceOf(LongGenerator.class);
    }

    @Test
    public void shouldProvideStringTypeGenerator() {
        IGenerator generator = TypeGeneratorProvider.getGeneratorFor(getFieldType("stringField").get());
        assertThat(generator).isInstanceOf(StringGenerator.class);
    }

    @Test
    public void shouldProvideDoubleTypeGenerator() {
        IGenerator generator = TypeGeneratorProvider.getGeneratorFor(getFieldType("doubleField").get());
        assertThat(generator).isInstanceOf(DoubleGenerator.class);
    }

    @Test
    public void shouldProvideIntegerTypeGenerator() {
        IGenerator generator = TypeGeneratorProvider.getGeneratorFor(getFieldType("integerField").get());
        assertThat(generator).isInstanceOf(IntegerGenerator.class);
    }

    @Test
    public void shouldProvideBooleanTypeGenerator() {
        IGenerator generator = TypeGeneratorProvider.getGeneratorFor(getFieldType("booleanField").get());
        assertThat(generator).isInstanceOf(BooleanGenerator.class);
    }

    @Test
    public void shouldProvideLocalDateTypeGenerator() {
        IGenerator generator = TypeGeneratorProvider.getGeneratorFor(getFieldType("localDateField").get());
        assertThat(generator).isInstanceOf(LocalDateGenerator.class);
    }

    private Optional<Field> getFieldType(String fieldName) {
        try {
            return Optional.of(Fields.class.getDeclaredField(fieldName));
        } catch (NoSuchFieldException exception) {
            return Optional.empty();
        }
    }

    private class Fields {
        private Long longField;
        private String stringField;
        private Double doubleField;
        private Integer integerField;
        private Boolean booleanField;
        private LocalDate localDateField;
    }
}
