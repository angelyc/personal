package com.mario.designPatterns.childClass.factoryMethod;

import java.util.ArrayList;
import java.util.List;

public class IDCardFactory extends Factory {
    private List owners = new ArrayList();
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }
    protected void registerProduct(Product p) {
        owners.add(((IDCard)p).getOwner());
    }
    public List getOwners(){
        return owners;
    }
}
