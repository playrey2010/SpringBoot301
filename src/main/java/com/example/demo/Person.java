package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//The @Entity annotation creates a table (or rather, will populate your table with fields from this bean) in your database (h2 in this app)
@Entity
public class Person {
    //@Id indicates this field is the unique IDENTIFIER used for each row of the db table.
    @Id
    // @GeneratedValue indicates the identifier is generated,
    // GenerationType.AUTO means a unique number will automatically be assigned to each row.
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String firstName;
    private String lastName;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
