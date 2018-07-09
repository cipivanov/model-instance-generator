package org.model.generator;

import org.junit.Test;
import org.model.generator.model.Meeting;
import org.model.generator.model.Payment;
import org.model.generator.model.user.Address;
import org.model.generator.model.user.Block;
import org.model.generator.model.user.User;

public class InstanceGeneratorTest {

    @Test
    public void shouldCreateInstanceOfClassSimpleAnnotation() {
        for (int i = 0; i < 100; i++) {
            Payment payment = InstanceGenerator.of(Payment.class);
            System.out.println(payment);

            assert payment.getId().matches("[0-9]{9}");
            assert payment.getSender().matches("[A-Z]{5}");
            assert payment.getReceiver().matches("(BO|BA)");
            assert payment.getAmount().matches("[0-9]{5,6}\\.[0-9]{2}");
        }
    }

    @Test
    public void shouldCreateInstanceOfClassNoAnnotation() {
        for (int i = 0; i < 100; i++) {
            Block block = InstanceGenerator.of(Block.class);
            System.out.println(block);

            assert block.getId().matches("[A-Z]{3}");
            assert block.getFloor().toString().matches("[0-9]");
        }
    }

    @Test
    public void shouldCreateInstanceOfClassWithCompositeFields() {
        for (int i = 0; i < 100; i++) {
            Address address = InstanceGenerator.of(Address.class);
            System.out.println(address);

            assert address.getHouse() != null;
            assert address.getHouse().getFloor().matches("[0-9]{2}");
            assert address.getHouse().getNumber().toString().matches("[0-9]{3}");
        }
    }

    @Test
    public void shouldCreateInstanceOfClassWithDateFields() {
        for (int i = 0; i < 100; i++) {
            Meeting meeting = InstanceGenerator.of(Meeting.class);
            System.out.println(meeting);

            assert meeting.getId().matches("[0-9]{3}(.*)");
            assert meeting.getDate().toString().matches("([0-9]{4})-([0-9]{2})-([0-9]{2})");
        }
    }

    @Test
    public void shouldCreateInstanceOfShaormaFieldsObject() {
        for (int i = 0; i < 100; i++) {
            User user = InstanceGenerator.of(User.class);
            System.out.println(user);

            assert user.getBlock() != null;
            assert user.getAddress() != null;
            assert user.getSecondaryAddress() != null;
            assert user.getNonAnnotatedField() != null;
        }
    }
}