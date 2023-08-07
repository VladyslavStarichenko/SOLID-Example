package com.goldsilver.solid.opc;

public class NotificationTelegram implements NotificationStrategy{
    @Override
    public void sendMessage() {
        System.out.println("Notification via telegram.");
    }
}
