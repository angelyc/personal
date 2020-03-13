package com.mario.designPatterns.generateInstance.prototype;

public class UnderlinePen implements Product {
    private char ulchar;
    public UnderlinePen(char decochar){
        this.ulchar = decochar;
    }
    public void use(String s){
        int length = s.getBytes().length;

        System.out.println("\"" + s + "\"");
        System.out.print(" ");
        for (int i = 0; i < length;i++){
            System.out.print(ulchar);
        }
        System.out.println("");
    }
    public Product createClone() {
        Product p = null;
        try {
            p = (Product)clone();
        } catch (CloneNotSupportedException ce) {
            ce.printStackTrace();
        }
        return p;
    }
}