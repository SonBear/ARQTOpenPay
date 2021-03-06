package com.sonbear.model.entities;

import java.util.UUID;

/**
 *
 * @author Sonbear
 */
public abstract class User extends Entity {

    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;

    public User() {
        super(UUID.randomUUID().toString());
    }

    public User(String id, String firstName, String lastName, String email, String phoneNumber) {
        super(id);
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public User(String firstName, String lastName, String email, String phoneNumber) {
        this(UUID.randomUUID().toString(), firstName, lastName, email, phoneNumber);
    }

    public User setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public User setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public User setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

}
