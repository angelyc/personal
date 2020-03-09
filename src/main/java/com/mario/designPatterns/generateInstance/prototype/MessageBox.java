package com.mario.designPatterns.generateInstance.prototype;

public class MessageBox implements Product {
    private char decochar;
    public MessageBox(char decochar){
        this.decochar = decochar;
    }
    public void use(String s){
        int length = s.getBytes().length;
        selfHeadTail(length + 4);

        System.out.println(decochar + " " + s + " " + decochar);
        selfHeadTail(length + 4);
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
    private void selfHeadTail(int length) {
        for (int i = 0; i < length;i++){
            System.out.print(decochar);
        }
        System.out.println("");
    }
}
