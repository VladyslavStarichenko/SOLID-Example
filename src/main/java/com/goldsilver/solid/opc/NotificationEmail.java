package com.goldsilver.solid.opc;

public class NotificationEmail implements NotificationStrategy {
    @Override
    public void sendMessage() {
        System.out.println("Notification through email.");
    }
}
