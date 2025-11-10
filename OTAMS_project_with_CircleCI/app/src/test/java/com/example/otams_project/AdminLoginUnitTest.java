package com.example.otams_project;

import org.junit.Test;

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

    }
}
