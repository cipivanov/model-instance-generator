package org.model.generator;

import org.junit.Test;
import org.model.generator.model.Meeting;
import org.model.generator.model.Payment;
import org.model.generator.model.user.Address;
import org.model.generator.model.user.Block;
import org.model.generator.model.user.User;

import static org.assertj.core.api.Assertions.assertThat;

public class InstanceGeneratorTest {

    @Test
    public void shouldCreateInstanceOfClassSimpleAnnotation() {
        for (int i = 0; i < 100; i++) {
            Payment payment = InstanceGenerator.of(Payment.class);
            System.out.println(payment);

            assertThat(payment.getId().matches("[0-9]{9}")).isTrue();
            assertThat(payment.getSender().matches("[A-Z]{5}")).isTrue();
            assertThat(payment.getReceiver().matches("(BO|BA)")).isTrue();
            assertThat(payment.getAmount().matches("[0-9]{5,6}\\.[0-9]{2}")).isTrue();
            assertThat(payment.getRepeated().toString().matches("(true)")).isTrue();
        }
    }

    @Test
    public void shouldCreateInstanceOfClassNoAnnotation() {
        for (int i = 0; i < 100; i++) {
            Block block = InstanceGenerator.of(Block.class);
            System.out.println(block);

            assertThat(block.getId().matches("[A-Z]{3}")).isTrue();
            assertThat(block.getFloor().toString().matches("[0-9]")).isTrue();
            assertThat(block.getRenovated().toString().matches("(false)")).isTrue();
        }
    }

    @Test
    public void shouldCreateInstanceOfClassWithCompositeFields() {
        for (int i = 0; i < 100; i++) {
            Address address = InstanceGenerator.of(Address.class);
            System.out.println(address);

            assertThat(address.getHouse()).isNotNull();
            assertThat(address.getHouse().getFloor().matches("[0-9]{2}")).isTrue();
            assertThat(address.getHouse().getNumber().matches("[0-9]{3}")).isTrue();
        }
    }

    @Test
    public void shouldCreateInstanceOfClassWithDateFields() {
        for (int i = 0; i < 100; i++) {
            Meeting meeting = InstanceGenerator.of(Meeting.class);
            System.out.println(meeting);

            assertThat(meeting.getId().matches("[0-9]{3}(.*)")).isTrue();
            assertThat(meeting.getDate().toString().matches("([0-9]{4})-([0-9]{2})-([0-9]{2})")).isTrue();
        }
    }

    @Test
    public void shouldCreateInstanceOfShaormaFieldsObject() {
        for (int i = 0; i < 100; i++) {
            User user = InstanceGenerator.of(User.class);
            System.out.println(user);

            assertThat(user.getBlock()).isNotNull();
            assertThat(user.getAddress()).isNotNull();
            assertThat(user.getSecondaryAddress()).isNotNull();
            assertThat(user.getNonAnnotatedField()).isNotNull();
        }
    }
    //TODO: Negative tests
}
