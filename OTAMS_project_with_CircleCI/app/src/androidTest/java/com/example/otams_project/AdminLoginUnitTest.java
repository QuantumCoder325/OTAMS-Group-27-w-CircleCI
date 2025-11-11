package com.example.otams_project;

import static org.junit.Assert.assertTrue;

import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.CountDownLatch;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class AdminLoginUnitTest implements Login {

    CountDownLatch latch;
    boolean success = false;

    @Test
    public void adminCredentialsAndLoginAreFunctional() throws InterruptedException {
        FirebaseAccessor accessor = FirebaseAccessor.getInstance();
        String email = "admin.root@gmail.com";
        String password = "admin123@";
        accessor.doesEmailMatchPassword(this, email, password);

        latch = new CountDownLatch(1);

        latch.await();

        assertTrue("Login failed", success);
    }

    @Override
    public void denySignIn() {
        success = false;
        latch.countDown();
    }

    @Override
    public void approveSignIn(Account account) {
        success = true;
        latch.countDown();
    }
}
