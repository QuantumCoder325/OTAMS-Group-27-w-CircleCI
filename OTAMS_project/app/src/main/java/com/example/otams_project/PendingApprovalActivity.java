package com.example.otams_project;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;


public class PendingApprovalActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pending_approval);


    }
    public void onBackToLoginClick(View view){
        Intent intent=new Intent(PendingApprovalActivity.this, LoginActivity.class);
        startActivity(intent);
        finish();}
}
