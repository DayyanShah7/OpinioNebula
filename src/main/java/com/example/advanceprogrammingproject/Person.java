package com.example.advanceprogrammingproject;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.time.LocalDate;
import java.util.Date;

public class Person {

    private SimpleStringProperty name;
    private SimpleStringProperty id;
    private SimpleStringProperty username;
    private SimpleStringProperty email;
    private SimpleStringProperty gender;

    // Constructor to initialize Person object with details
    Person(String name, String id, String username, String email, String gender) {
        this.name = new SimpleStringProperty(name);
        this.id = new SimpleStringProperty(id);
        this.username = new SimpleStringProperty(username);
        this.email = new SimpleStringProperty(email);
        this.gender = new SimpleStringProperty(gender);
    }

    // Getter and Setter methods for the 'name' property
    public StringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    // Getter and Setter methods for the 'id' property
    public StringProperty idProperty() {
        return id;
    }

    public void setId(String id) {
        this.id.set(id);
    }

    // Getter and Setter methods for the 'email' property
    public StringProperty emailProperty() {
        return email;
    }

    public void setEmail(String email) {
        this.email.set(email);
    }

    // Getter and Setter methods for the 'gender' property
    public StringProperty genderProperty() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender.set(gender);
    }

    // Getter and Setter methods for the 'username' property
    public StringProperty usernameProperty() {
        return username;
    }

    public void setUsername(String username) {
        this.username.set(username);
    }
}
