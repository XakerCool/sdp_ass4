package org.example.decorator;

import org.example.factory.IceCream;

public interface EventListener {
    void update(String eventType, IceCream iceCream);
}
