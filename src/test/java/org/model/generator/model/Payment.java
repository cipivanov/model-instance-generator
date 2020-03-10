package org.model.generator.model;

import org.model.generator.annotation.AutoValue;

public class Payment {

    @AutoValue(pattern = "[0-9]{9}")
    private String id;

    @AutoValue(pattern = "[0-9]{5,6}\\.[0-9]{2}")
    private String amount;

    @AutoValue(pattern = "[A-Z]{5}")
    private String sender;

    @AutoValue(pattern = "(BO|BA)")
    private String receiver;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    @Override
    public String toString() {
        return "Payment {" +
                "\n id=" + id +
                ", \n amount=" + amount +
                ", \n sender='" + sender + '\'' +
                ", \n receiver='" + receiver + '\'' +
                " \n}";
    }
}