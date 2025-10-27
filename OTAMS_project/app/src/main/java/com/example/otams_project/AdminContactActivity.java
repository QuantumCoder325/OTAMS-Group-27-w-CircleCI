package com.example.otams_project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class AdminContactActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_contact);
    }

    public void onReturnClick(View view){
        startActivity( new Intent(AdminContactActivity.this , MainActivity.class));
        finish();
    }

}
