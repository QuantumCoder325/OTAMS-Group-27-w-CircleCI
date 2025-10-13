package com.example.otams_project;

public class Account {
    private String emailAddress;
    private String password;
    private String role;

    public Account(String emailAddress, String password, String role){
        this.emailAddress = emailAddress;
        this.password = password;
        this.role = role;
    }
    public String getEmailAddress(){
        return emailAddress;
    }
    public String getPassWord(){
        return password;
    }
    public String getRole(){
        return role;
    }
    public void setPassword(String password){
        this.password = password;
    }

}
