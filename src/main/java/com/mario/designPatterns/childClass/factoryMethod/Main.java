package com.mario.designPatterns.childClass.factoryMethod;

public class Main {
    public static void main(String[] args) {
        IDCardFactory idCardFactory = new IDCardFactory();
        Product idCard1 = idCardFactory.create("张三");
        Product idCard2 = idCardFactory.create("李四");
        Product idCard3 = idCardFactory.create("王五");
        idCard1.use();
        idCard2.use();
        idCard3.use();

        System.out.println(idCardFactory.getClass());
        System.out.println(idCardFactory.getClass().getMethods());
        idCardFactory.getOwners().stream().forEach(e -> System.out.println(e));
    }
}
