package org.example.TodoAssignment.model;

import org.example.TodoAssignment.sequencers.PersonIdSequencer;

import java.util.Objects;

public class Person {
    private final int id;
    private String firstName;
    private String lastName;
    private String email;
    private AppUser credentials;

    public Person(String firstName, String lastName, String email) {
        this.id = PersonIdSequencer.nextId();
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
        setCredentials(credentials);
    }

    //TODO Check for lower and uppercase on Email , Name , Last name error handling

    public Person(String firstName, String lastName, String email, AppUser credentials) {
        this(firstName, lastName, email);
        setCredentials(credentials);
    }

    public int getId() {
        return id;
    }

    public AppUser getCredentials() {
        return credentials;
    }

    public void setCredentials(AppUser credentials) {
        this.credentials = credentials;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null || email.trim().isEmpty())
            throw new IllegalArgumentException("Email cannot be Null or Empty");
        this.email = email;
    }

    //Don't include credentials in hash and equals


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return getId() == person.getId() && Objects.equals(getFirstName(), person.getFirstName()) && Objects.equals(getLastName(), person.getLastName()) && Objects.equals(getEmail(), person.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getFirstName(), getLastName(), getEmail());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Id: ").append(getId()).append("\n").append("Name: ").append(getFirstName()).append(" ").append(getLastName()).append("\n").append("Email: ").append(getEmail());

        return sb.toString();
    }
}
