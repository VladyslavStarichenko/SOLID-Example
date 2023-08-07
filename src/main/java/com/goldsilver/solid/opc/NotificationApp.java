package com.goldsilver.solid.opc;

public class NotificationApp {
    public static void main(String[] args) {
        NotificationServiceGood notificationService = new NotificationServiceGood();
        NotificationEmail notificationEmail = new NotificationEmail();
        NotificationTelegram notificationTelegram = new NotificationTelegram();

        notificationService.sendOTP(notificationEmail);
        notificationService.sendOTP(notificationTelegram);
    }
}
