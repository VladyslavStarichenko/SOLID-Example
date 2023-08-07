package com.goldsilver.solid.opc;

public class NotificationServiceGood {

    public void sendOTP(NotificationStrategy notificationStrategy) {
        notificationStrategy.sendMessage();
    }
}
