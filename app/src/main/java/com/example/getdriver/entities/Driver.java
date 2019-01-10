package com.example.getdriver.entities;

public class Driver {
    private String LastName;
    private String FirstName;
    private static long id;
    private String PhoneNumber;
    private String EmailAddress;
    private String CreditCard;

    public Driver()
    {

    }
    public Driver(String lastName, String firstName, String phoneNumber, String emailAddress, String creditCard) {
        LastName = lastName;
        FirstName = firstName;
        PhoneNumber = phoneNumber;
        EmailAddress = emailAddress;
        CreditCard = creditCard;
    }

    public String getLastName() {

        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public static long getId() {
        return id;
    }

    public static void setId(long id) {
        Driver.id = id;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getEmailAddress() {
        return EmailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        EmailAddress = emailAddress;
    }

    public String getCreditCard() {
        return CreditCard;
    }

    public void setCreditCard(String creditCard) {
        CreditCard = creditCard;
    }
}
