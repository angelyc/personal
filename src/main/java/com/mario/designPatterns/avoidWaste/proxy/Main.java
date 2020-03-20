package com.mario.designPatterns.avoidWaste.proxy;

public class Main {
    public static void main(String[] args) {
        String packageName = Printable.class.getPackage().getName();
        packageName += ".";
        Printable p = new PrinterProxy("Alice", packageName + "Printer");
        System.out.println("现在的名字是" + p.getPrinterName() + "。");
        p.setPrinterName("Bob");
        System.out.println("现在的名字是" + p.getPrinterName() + "。");
        p.print("Hello world。");
    }
}
