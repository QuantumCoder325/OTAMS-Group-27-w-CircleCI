package com.example.otams_project;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onLoginClick(View view){
        startActivity( new Intent(MainActivity.this , LoginActivity.class));
    }
    public void onRegisterClick(View view){
        startActivity( new Intent(MainActivity.this , RegisterActivity.class));
    }




    public void writeAccountSuccess() {
        Toast.makeText(this, "Account creation successful", Toast.LENGTH_LONG).show();
    }

    public void writeAccountFail() {
        Toast.makeText(this, "Failed account creation", Toast.LENGTH_LONG).show();
    }
}