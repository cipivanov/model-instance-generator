package org.model.generator.model.user;

import org.model.generator.annotation.AutoValue;

public class User {

    @AutoValue(pattern = "UserId")
    private String id;

    @AutoValue(pattern = "[A-Z]{3,5}")
    private String name;

    @AutoValue(pattern = "past-date")
    private String dateOfBirth;

    @AutoValue(pattern = "future-date")
    private String paymentDate;

    @AutoValue(pattern = "current-date")
    private String creationDate;

    @AutoValue(pattern = "[0-9]{3}\\-[0-9]{3}\\-[0-9]{3,5}")
    private String telephoneNumber;

    @AutoValue(pattern = "[0-9]{5,6}\\.[0-9]{2}")
    private String salary;

    @AutoValue(pattern = "[a-z]{3,8}\\@[a-z]{3,5}\\.(com|ro|md)")
    private String email;

    @AutoValue(pattern = "Username[A-Z]{2,5}")
    private String username;

    private Address address;

    private Address secondaryAddress;

    private String nonAnnotatedField;

    private Block block;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getNonAnnotatedField() {
        return nonAnnotatedField;
    }

    public void setNonAnnotatedField(String nonAnnotatedField) {
        this.nonAnnotatedField = nonAnnotatedField;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getSecondaryAddress() {
        return secondaryAddress;
    }

    public void setSecondaryAddress(Address secondaryAddress) {
        this.secondaryAddress = secondaryAddress;
    }

    public Block getBlock() {
        return block;
    }

    public void setBlock(Block block) {
        this.block = block;
    }

    @Override
    public String toString() {
        return "User{" +
                "\n id='" + id + '\'' +
                ",\n name='" + name + '\'' +
                ",\n dateOfBirth='" + dateOfBirth + '\'' +
                ",\n paymentDate='" + paymentDate + '\'' +
                ",\n creationDate='" + creationDate + '\'' +
                ",\n telephoneNumber='" + telephoneNumber + '\'' +
                ",\n salary='" + salary + '\'' +
                ",\n email='" + email + '\'' +
                ",\n username='" + username + '\'' +
                ",\n address=" + address +
                ",\n secondaryAddress=" + secondaryAddress +
                ",\n nonAnnotatedField='" + nonAnnotatedField + '\'' +
                ",\n block=" + block +
                "\n }";
    }
}