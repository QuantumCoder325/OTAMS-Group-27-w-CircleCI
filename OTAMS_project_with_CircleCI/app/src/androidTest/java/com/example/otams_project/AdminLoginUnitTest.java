package com.example.otams_project;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class AdminLoginUnitTest implements Login {

    CountDownLatch latch;

    @Test
    public void adminCredentialsAndLoginAreFunctional() throws InterruptedException {
        FirebaseAccessor accessor = FirebaseAccessor.getInstance();
        String email = "admin.root@gmail.com";
        String password = "admin123@";
        accessor.doesEmailMatchPassword(this, email, password);

        latch = new CountDownLatch(1);

        boolean completed = latch.await(5, TimeUnit.SECONDS);
        assert  completed: ("Login failed");
    }

    @Override
    public void denySignIn() {

    }

    @Override
    public void approveSignIn(Account account) {

    }
}
