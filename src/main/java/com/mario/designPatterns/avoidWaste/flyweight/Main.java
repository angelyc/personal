package com.mario.designPatterns.avoidWaste.flyweight;

public class Main {
    public static void main(String[] args) {
        showMemory(); // 629800
        BigString bs = new BigString("1212123");
        bs.print();
        showMemory(); // 636000
        BigString bs2 = new BigString("1212123", true);
        bs2.print();
        showMemory(); // 633952
        BigString bs3 = new BigString("1212123", false);
        bs3.print();
        showMemory(); // 638664
    }

    public static void showMemory() {
        Runtime.getRuntime().gc();
        long used = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println("使用内存：" + used);
    }
}
