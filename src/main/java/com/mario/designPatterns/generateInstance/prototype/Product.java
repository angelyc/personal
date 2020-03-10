package com.mario.designPatterns.generateInstance.prototype;


/**
 * Prototype模式，根据现有的实例来生成新实例
 * 1、对象种类繁多，无法整合到一个类中
 * 2、难以根据类生成实例
 * 3、想解耦框架与生成实例：事先“注册”一个“原型”实例，然后通过复制该实例来生成新实例
 * Prototype有“原型”“模型”的意思，
 * 在设计模式中，Prototype是指根据实例原型、实例模型来生成新的实例
 * Java中，可以使用clone创建出实例的副本。
 * */
public interface Product extends Cloneable {
    void use(String s);
    Product createClone();
}
