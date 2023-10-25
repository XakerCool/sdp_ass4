package org.example.decorator;

import org.example.factory.IceCream;

public class IceCreamManufacturer {
    public EventManager events;
    public IceCream iceCream;
    public IceCreamManufacturer() {
        this.events = new EventManager("produce", "create");
    }
    public void produceIceCream(IceCream iceCream) {
        this.iceCream = iceCream;
        events.notify("produce", this.iceCream);
    }
    public void createIceCream(IceCream iceCream) {
        this.iceCream = iceCream;
        events.notify("create", this.iceCream);
    }
}
