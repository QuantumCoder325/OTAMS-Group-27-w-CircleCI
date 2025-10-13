package com.example.otams_project;

public class User {
    private String firstName;
    private String lastName;
    private String phone;

    protected Account account;

    protected User(String firstName, String lastName, String phone){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;

    }
    public User(){
        this.firstName = null;
        this.lastName = null;
        this.phone = null;
        this.account = null;
    }


    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getPhone(){
        return phone;
    }


    public Account getAccount(){
        return account;
    }
    public static void register(String firstName, String lastName, String email , String password, String phone){
        Account account = new Account(email, password, "null");
        User user = new User(firstName, lastName, phone);
        user.account = account;
    }

    }
