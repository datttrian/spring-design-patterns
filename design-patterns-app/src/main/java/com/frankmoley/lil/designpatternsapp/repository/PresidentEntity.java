package com.frankmoley.lil.designpatternsapp.repository;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "PRESIDENT")
public class PresidentEntity {
    @Id
    @GeneratedValue
    @Column(name = "PRSIDENT_ID")
    private long id;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "MIDDLE_INITIAL")
    private String middleInitial;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(name = "EMAIL_ADDRESS")
    private String emailAddress;

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleInitial() {
        return this.middleInitial;
    }

    public void setMiddleInitial(String middleInitial) {
        this.middleInitial = middleInitial;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return this.emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", firstName='" + getFirstName() + "'" +
                ", middleInitial='" + getMiddleInitial() + "'" +
                ", lastName='" + getLastName() + "'" +
                ", emailAddress='" + getEmailAddress() + "'" +
                "}";
    }

}
