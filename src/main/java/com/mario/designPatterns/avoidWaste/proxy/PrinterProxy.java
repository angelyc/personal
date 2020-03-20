package com.mario.designPatterns.avoidWaste.proxy;

public class PrinterProxy implements Printable {
    private String name;
    private String printableName;
    private Printable real;
    public PrinterProxy(){}
    public PrinterProxy(String name, String printableName){
        this.name = name;
        this.printableName = printableName;
    }
    @Override
    public synchronized void setPrinterName(String name) {
        if (null != real) {
            real.setPrinterName(name);
        }
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print(String string) {
        realize();
        real.print(string);
    }

    private synchronized void realize() {
        if (null == real) {
            try {
                Class clazz = Class.forName(printableName);
                real = (Printable)clazz.newInstance();
            } catch (ClassNotFoundException e) {
                System.err.println("没有找到" + printableName + "类");
            } catch (InstantiationException ie) {
                ie.printStackTrace();
            } catch (IllegalAccessException iae) {
                iae.printStackTrace();
            }
        }
    }
}
