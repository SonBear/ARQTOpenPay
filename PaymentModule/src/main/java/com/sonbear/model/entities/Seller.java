package com.sonbear.model.entities;

/**
 *
 * @author HikingCarrot7
 */
public class Seller extends User {

    public Seller(String id, String firstName, String lastName, String email, String phoneNumber) {
        super(id, firstName, lastName, email, phoneNumber);
    }

    public Seller(String firstName, String lastName, String email, String phoneNumber) {
        super(firstName, lastName, email, phoneNumber);
    }

}