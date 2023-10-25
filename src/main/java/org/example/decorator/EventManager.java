package org.example.decorator;

import org.example.factory.IceCream;

import java.util.*;

public class EventManager {
    Map<String, List<EventListener>> listeners = new HashMap<>();

    public EventManager(String... operations) {
        for (String operation : operations) {
            this.listeners.put(operation, new ArrayList<>());
        }
    }
    public void subscribe(String eventType, EventListener listener) {
        List<EventListener> users = listeners.get(eventType); // Find users with specific listener
        users.add(listener); // subscribe users
    }
    public void unsubscribe(String eventType, EventListener listener) {
        List<EventListener> users = listeners.get(eventType); // Find users with specific listener
        users.remove(listener); // unsubscribe users
    }

    public void notify(String eventType, IceCream iceCream) {
        List<EventListener> users = listeners.get(eventType); // Notify users with specific listener
        for (EventListener listener : users) {
            listener.update(eventType, iceCream);
        }
    }
}
