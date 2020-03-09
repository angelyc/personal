package com.mario.designPatterns.generateInstance.prototype;

public interface Product extends Cloneable {
    void use(String s);
    Product createClone();
}
