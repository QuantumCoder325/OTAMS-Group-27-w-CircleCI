package com.example.otams_project;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LocalNotifier.initializeNotificationChannels(this);
    }
    public void onLoginClick(View view){
        LocalNotifier.sendRejectNotification(this, new Account("email", "pass", "role", new User("FirstName", "LastName", "Phone") ));
        startActivity( new Intent(MainActivity.this , LoginActivity.class));
    }
    public void onRegisterClick(View view){
        LocalNotifier.sendApproveNotification(this, new Account("email", "pass", "role", new User("FirstName", "LastName", "Phone") ));
        startActivity( new Intent(MainActivity.this , RegisterActivity.class));
    }
}