package org.example.decorator;

import org.example.factory.IceCream;

public class EmailNotificationListener implements EventListener{
    private String email;
    public EmailNotificationListener(String email) {
        this.email = email;
    }
    @Override
    public void update(String eventType, IceCream iceCream) {
        System.out.println("Email to " + this.email + ": new ice cream: " + iceCream.getInfo() + " was " + eventType + "ed");
    }
}
