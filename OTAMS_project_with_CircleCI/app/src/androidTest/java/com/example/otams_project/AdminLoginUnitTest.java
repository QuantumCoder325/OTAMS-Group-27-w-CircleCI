package com.example.otams_project;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class AdminLoginUnitTest implements Login {

    @Test
    public void adminCredentialsAndLoginAreFunctional() {
        FirebaseAccessor accessor = FirebaseAccessor.getInstance();
        String email = "admin.root@gmail.com";
        String password = "admin123@";
        accessor.doesEmailMatchPassword(this, email, password);
    }

    @Override
    public void denySignIn() {
        throw new AssertionError("Failed to login to admin");
    }

    @Override
    public void approveSignIn(Account account) {
        throw new AssertionError("Success");
    }
}
