package com.mario.designPatterns.generateInstance.prototype;

import java.util.HashMap;

public class Manager {
    private HashMap<String, Product> showcase = new HashMap();

    public void register(String name, Product product) {
        showcase.put(name, product);
    }

    public Product create(String protoName) {
        Product p = showcase.get(protoName);
        return p.createClone();
    }
}
