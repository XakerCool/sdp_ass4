package org.example.factory;

import org.example.factory.cups.Cup;
import org.example.factory.cups.DefaultCup;
import org.example.factory.cups.PlasticCup;
import org.example.factory.cups.WaffleCup;

import java.util.ArrayList;
import java.util.List;

public class IceCreamFactory {
    private List<IceCream> iceCreamList = new ArrayList<>();
    public IceCreamFactory() { // Add two default ice creams
        iceCreamList.add(new Plombir());
        iceCreamList.add(new FruitIce());
    }
    public IceCream produceIceCream(String type) { // method to produce existing default ice cream
        switch (type) {
            case "plombir" -> {
                Plombir plombir = new Plombir();
                iceCreamList.add(plombir);
                return plombir;
            }
            case "fruit ice" -> {
                FruitIce fruitIce = new FruitIce();
                iceCreamList.add(fruitIce);
                return fruitIce;
            }
        }
        return null;
    }
    public IceCream createIceCream(String type, String name, String cup) {// method to create ice cream
        CustomIceCream customIceCream = new CustomIceCream(type, name, chooseCup(cup));
        iceCreamList.add(customIceCream);
        return customIceCream;
    }

    public Cup chooseCup(String cup) {
        switch (cup) {
            case "plastic" -> {
                return new PlasticCup();
            }
            case "waffle" -> {
                return new WaffleCup();
            }
            default -> {
                System.out.println("There is no such option! We will attach default cup");
                return new DefaultCup();
            }
        }
    }
}
