package com.example.otams_project;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;

public class LoggedInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logged_in);
        String role =getIntent().getStringExtra("ROLE");
        if(role==null){
            role="User";}
        TextView welcomeText=findViewById(R.id.textView3);
        welcomeText.setText("Welcome! Successfully Logged in as "+role);




    }
    public void onLogoutButtonClick(View view){
        startActivity( new Intent(LoggedInActivity.this , MainActivity.class));
    }
}