package org.example.factory;

import org.example.factory.cups.Cup;
import org.example.factory.cups.DefaultCup;
import org.example.factory.cups.PlasticCup;

public class FruitIce implements IceCream {
    private String name;
    private Cup cup;
    private String type;
    public FruitIce() {
        this.type = "Default fruit ice";
        this.name = "Default fruit ice cream";
        this.cup = new PlasticCup();
    }
    public FruitIce(String name, Cup cup) {
        this.name = name;
        this.cup = cup;
    }
    @Override
    public void melt() {
        System.out.println("Fruit Ice is melted! Now I have fruit juice!");
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return this.name;
    }
    @Override
    public void setCup(Cup cup) {
        this.cup = cup;
    }
    @Override
    public String getCup() {
        return this.cup.getCup();
    }
    @Override
    public void setType(String type) {
        this.type = type;
    }
    @Override
    public String getType() {
        return this.type;
    }
    @Override
    public String getInfo() {
        return "Type: " + this.getType() + ", name: " + this.getName() + ", cup: " + this.getCup();
    }
}
