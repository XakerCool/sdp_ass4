package org.example.factory;

import org.example.factory.cups.Cup;

public interface IceCream {
    void melt();
    void setName(String name);
    String getName();
    void setCup(Cup cup); // Set cup of Ice Cream: waffle, plastic
    String getCup();
    String getType();
    void setType(String type);
    String getInfo();
}
