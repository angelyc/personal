package com.mario.designPatterns.avoidWaste.proxy;

public interface Printable {
    void setPrinterName(String name);       // 设置名字
    String getPrinterName();                // 获取名字
    void print(String string);              // 显示名字（打印输出）
}
