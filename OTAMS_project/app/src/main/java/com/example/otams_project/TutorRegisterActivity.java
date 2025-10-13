package com.example.otams_project;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;
import android.widget.EditText;
import android.content.Intent;



public class TutorRegisterActivity extends AppCompatActivity {
    private EditText firstNameInput;
    private EditText lastNameInput;
    private EditText emailInput;
    private EditText passwordInput;
    private EditText phoneInput;
    private EditText degreeInput;

    private EditText coursesInput;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutor_register);

        firstNameInput = findViewById(R.id.firstNameInput);
        lastNameInput = findViewById(R.id.lastNameInput);
        emailInput = findViewById(R.id.emailInput);
        passwordInput = findViewById(R.id.passwordInput);
        phoneInput = findViewById(R.id.phoneInput);
        degreeInput = findViewById(R.id.degreeInput);
        coursesInput = findViewById(R.id.coursesInput);
    }

    public void onRegisterButtonClick(View view){
        String firstName = firstNameInput.getText().toString();
        String lastName = lastNameInput.getText().toString();
        String email = emailInput.getText().toString();
        String password = passwordInput.getText().toString();
        String phone = phoneInput.getText().toString();
        String degree = degreeInput.getText().toString();
        String courses = coursesInput.getText().toString();
        String[] coursesArray = courses.split(",");
        Tutor.register(firstName, lastName, email, password, phone , degree , coursesArray);
        startActivity( new Intent(TutorRegisterActivity.this , MainActivity.class));




    }
}


