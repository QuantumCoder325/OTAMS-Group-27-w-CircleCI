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
import android.widget.Toast;



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
        FirebaseAccessor accessor = new FirebaseAccessor();
        accessor.doesEmailMatchPassword(this, email, password);


    }

    public void approveSignIn(Account account) {
        Toast.makeText(this, account.getEmail()+ " has signed in, they are a " + account.getRole(), Toast.LENGTH_LONG).show();
        startActivity( new Intent(LoginActivity.this , LoggedInActivity.class));
    }

    public void denySignIn() {
        Toast.makeText(this, "Failed login", Toast.LENGTH_LONG).show();
    }

}