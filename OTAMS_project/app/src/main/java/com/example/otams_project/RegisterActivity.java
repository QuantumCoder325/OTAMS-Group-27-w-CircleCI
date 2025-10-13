package com.example.otams_project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void onStudentClick(View view){
        startActivity( new Intent(RegisterActivity.this , StudentRegisterActivity.class));
    }
    public void onTutorClick(View view){
        startActivity( new Intent(RegisterActivity.this , TutorRegisterActivity.class));
    }
}