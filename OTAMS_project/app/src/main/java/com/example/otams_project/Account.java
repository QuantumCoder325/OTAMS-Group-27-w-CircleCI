package com.example.otams_project;

import java.io.Serializable;

public class Account implements Serializable {
    private String email;
    private String password;
    private String role;
    private User user;

    public Account(String accountEmail, String accountPassword, String accountRole, User accountUser) {
        this.email = accountEmail;
        this.password = accountPassword;
        this.role = accountRole;
        this.user = accountUser;
    }

    public Account() {

    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }
    public User getUser() {
        return  user;
    }

    public void login() {

    }

    public void logout() {

    }
}
