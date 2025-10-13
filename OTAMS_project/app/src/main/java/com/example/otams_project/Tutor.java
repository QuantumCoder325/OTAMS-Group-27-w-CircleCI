package com.example.otams_project;

public class Tutor extends User {


    String degree;
    String[] courses;

    public Tutor(String firstName, String lastName, String phone) {
        super(firstName, lastName, phone);
    }
    public Tutor() {
        super();
    }





    public static void register(String firstName, String lastName, String email , String password, String phone , String degree, String[] courses) {
        Account account = new Account(email, password, "tutor");
        Tutor tutor = new Tutor(firstName, lastName, phone);
        tutor.degree = degree;
        tutor.courses = courses;
        tutor.account = account;
        FirebaseAccessor accessor = new FirebaseAccessor();
        accessor.writeNewAccount(null, account);
    }
}
