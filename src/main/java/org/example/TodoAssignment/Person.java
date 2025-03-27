package org.example.TodoAssignment;

import java.text.MessageFormat;

public class Person {
    private int id;
    private String firstName;
    private String lastName;
    private String email;

    public Person(String firstName, String lastName, String email) {
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
    }

    public int getId() {
        return id;
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName.trim().isEmpty())
            throw new IllegalArgumentException("Last name cannot be Null or Empty");
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName == null || firstName.trim().isEmpty())
            throw new IllegalArgumentException("First name cannot be Null or Empty");

        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void getLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null || email.trim().isEmpty())
            throw new IllegalArgumentException("Email cannot be Null or Empty");
        this.email = email;
    }


    public String getSummary() {
        return MessageFormat.format("Id: {0} ,name: {1} {2}, email: {3} ", getId(), getFirstName(), getLastName(), getEmail());
    }
}
