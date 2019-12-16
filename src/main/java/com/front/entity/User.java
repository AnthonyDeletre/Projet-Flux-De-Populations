package com.front.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.context.annotation.Scope;

@JsonIgnoreProperties(ignoreUnknown = true)
@Scope("session")
public class User {

    private int id = 1;
    private String email;
    private String password;
    private String firstName;
    private String lastName;

    public User(String email, String password, String firstname, String lastname){
        this.email = email;
        this.password = password;
        this.firstName = firstname;
        this.id = id++;
    }

    public User(String username, String password) {
        this.email = username;
        this.password = password;
    }

    public User() { }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstname) {
        this.firstName = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastname) {
        this.lastName = lastname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", lastname='" + lastName + '\'' +
                ", firstname='" + firstName + '\'' +
                '}';
    }
}
