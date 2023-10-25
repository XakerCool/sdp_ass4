package org.example.decorator;

import org.example.factory.IceCream;

public class SmsNotificationListener implements EventListener {
    private String phoneNumber;
    public SmsNotificationListener(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    @Override
    public void update(String eventType, IceCream iceCream) {
        System.out.println("SMS to " + this.phoneNumber + ": new ice cream: " + iceCream.getInfo() + " was " + eventType + "ed");
    }
}
