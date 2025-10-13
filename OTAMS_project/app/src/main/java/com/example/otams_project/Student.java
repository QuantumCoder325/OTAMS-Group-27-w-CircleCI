package com.example.otams_project;

public class Student extends User {


    String program;

    public Student(String firstName, String lastName, String phone) {
        super(firstName, lastName, phone);
    }
    public Student() {
        super();
    }




    public static void register(String firstName, String lastName, String email , String password, String phone , String program) {
        Account account = new Account(email, password, "student");
        Student student = new Student(firstName, lastName, phone);
        student.program = program;
        student.account = account;
    }
}
