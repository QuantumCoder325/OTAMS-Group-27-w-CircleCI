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

public class LoginActivity extends AppCompatActivity {

    private EditText emailInput;
    private EditText passwordInput;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        emailInput = findViewById(R.id.emailInput);
        passwordInput = findViewById(R.id.passwordInput);


    }
    public void onLoginButtonClick(View view) {
        String email = emailInput.getText().toString();
        String password = passwordInput.getText().toString();

        startActivity(new Intent(LoginActivity.this, LoggedInActivity.class));
    }
}