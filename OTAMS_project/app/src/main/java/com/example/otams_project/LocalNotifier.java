package com.example.otams_project;

import static android.app.NotificationManager.IMPORTANCE_HIGH;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

import androidx.core.app.NotificationCompat;

public class LocalNotifier {

    private static final String REQUEST_STATUS_CHANNEL_ID = "requestChannel";
    private static NotificationManager manager;
    public static void initializeNotificationChannels(Context caller) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
        NotificationChannel channel = new NotificationChannel(REQUEST_STATUS_CHANNEL_ID, "Request Status", IMPORTANCE_HIGH);
            channel.setDescription("Notifies you when your account request status changes.");

            NotificationManager notificationManager = (NotificationManager) caller.getSystemService(Context.NOTIFICATION_SERVICE);
            manager = notificationManager;

            notificationManager.createNotificationChannel(channel);
        }
    }

    public static void sendApproveNotification(Context caller, Account account) {
        if (manager == null) {
            return;
        }

        int requestCode = account.getEmail().hashCode();

        Intent openApp = new Intent(caller, MainActivity.class);
        PendingIntent openAppPending = PendingIntent.getActivity(caller, requestCode, openApp, PendingIntent.FLAG_IMMUTABLE);

        NotificationCompat.Builder notification = new NotificationCompat.Builder(caller, REQUEST_STATUS_CHANNEL_ID);
        notification.setSmallIcon(R.drawable.outline_check_24);
        notification.setContentTitle("Request Status Update");
        notification.setContentText(account.getUser().getFirstName() + " your account has been approved!");
        notification.setContentIntent(openAppPending);
        notification.build();

        manager.notify(requestCode, notification.build());
    }

    public static void sendRejectNotification(Context caller, Account account) {
        if (manager == null) {
            return;
        }

        int requestCode = account.getEmail().hashCode();

        Intent openApp = new Intent(caller, MainActivity.class);
        PendingIntent openAppPending = PendingIntent.getActivity(caller, requestCode, openApp, PendingIntent.FLAG_IMMUTABLE);

        Intent adminContactIntent = new Intent(caller, RegisterActivity.class);
        PendingIntent adminContactPendingIntent = PendingIntent.getActivity(caller, requestCode, adminContactIntent, PendingIntent.FLAG_IMMUTABLE);

        NotificationCompat.Builder notification = new NotificationCompat.Builder(caller, REQUEST_STATUS_CHANNEL_ID);
        notification.setSmallIcon(R.drawable.outline_close_24);
        notification.setContentTitle("Request Status Update");
        notification.setContentText(account.getUser().getFirstName() + " your account has been rejected.");
        notification.setContentIntent(openAppPending);
        notification.addAction(R.drawable.outline_android_24, "Contact Admin", adminContactPendingIntent);

        notification.build();

        manager.notify(requestCode, notification.build());
    }

}
