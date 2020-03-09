package com.mario.designPatterns.generateInstance.prototype;


/**
 * Prototype模式，根据实例生成新实例
 * Prototype有“原型”“模型”的意思，
 * 在设计模式中，Prototype是指根据实例原型、实例模型来生成新的实例
 * Java中，可以使用clone创建出实例的副本。
 * */
public interface Product extends Cloneable {
    void use(String s);
    Product createClone();
}
