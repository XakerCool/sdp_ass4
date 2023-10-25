package org.example;


import org.example.decorator.EmailNotificationListener;
import org.example.decorator.EventListener;
import org.example.decorator.SmsNotificationListener;
import org.example.factory.IceCream;
import org.example.factory.IceCreamFactory;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static IceCreamFactory iceCreamFactory = new IceCreamFactory();
    public static void main(String[] args) {
        EventListener eventListener = null;
        String userChoice = "";
        while(true)
        {
            String userType = "";
            String ifWantToGetNotifications = "";
            System.out.println("Hello to ice cream factory!");
            System.out.print("First of all type if you want to get notifications about new products (y/n):");
            ifWantToGetNotifications = scanner.nextLine();
            if (ifWantToGetNotifications.equals("y")) {
                System.out.print("Now which notification would you like to get (sms/email): ");
                String userNotificationType = scanner.nextLine();
                if (userNotificationType.equals("sms")) {
                    System.out.print("Input the phone number: ");
                    String userPhoneNumber = scanner.nextLine();
                    eventListener = new SmsNotificationListener(userPhoneNumber);
                } else if (userNotificationType.equals("email")) {
                    System.out.print("Input the email: ");
                    String userEmail = scanner.nextLine();
                    eventListener = new EmailNotificationListener(userEmail);
                }
            }
            System.out.println("######################");
            System.out.print("Here you can choose: produce ice cream (produce) or create ice cream (create) (input 0 to exit): ");
            userChoice = scanner.nextLine();
            if (userChoice.equals("0"))
            {
                System.out.println("Goodbye!");
                break;
            }
            switch (userChoice) {
                case "produce" -> {
                    System.out.print("Now input type of ice cream to produce (Plombir or Fruit Ice): ");
                    userType = scanner.nextLine();
                    IceCream iceCream = produceIceCream(userType);
                    if (eventListener != null)
                         eventListener.update("produce", iceCream);
                }
                case "create" -> {
                    System.out.print("Input type of your new ice cream ");
                    userType = scanner.nextLine();
                    System.out.print("Input name of your new ice cream ");
                    String iceCreamName = scanner.nextLine();
                    System.out.print("Input cup type of your new ice cream (plastic, waffle): ");
                    String iceCreamCupType = scanner.nextLine();
                    if (eventListener != null)
                        eventListener.update("create", createIceCream(userType, iceCreamName, iceCreamCupType));
                }
            }
            System.out.println("######################");
        }

    }

    public static IceCream produceIceCream(String userTaste) {
        return iceCreamFactory.produceIceCream(userTaste);
    }
    public static IceCream createIceCream(String type, String name, String cup) {
        return iceCreamFactory.createIceCream(type, name, cup);
    }
}

/*
* Project idea - Ice cream factory
* Observer - notify users about new Ice cream type
* Factory - create different ice cream types
* */