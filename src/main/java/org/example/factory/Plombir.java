package org.example.factory;

import org.example.factory.cups.Cup;
import org.example.factory.cups.WaffleCup;

public class Plombir implements IceCream {
    private String name;
    private Cup cup;
    private String type;
    public Plombir() {
        this.type = "Default plombir";
        this.name = "Default plombir ice cream";
        this.cup = new WaffleCup();
    }
    public Plombir(String name, Cup cup) {
        this.name = name;
        this.cup = cup;
    }
    @Override
    public void melt() {
        System.out.println("Plombir is melting! Actually it tastes good!");
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
    public void setCup(Cup setCup) {
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
