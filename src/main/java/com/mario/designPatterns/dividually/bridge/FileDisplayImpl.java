package com.mario.designPatterns.dividually.bridge;

public class FileDisplayImpl extends DisplayImpl {
    private String fileName;
    public FileDisplayImpl(String fileName) {
        this.fileName = fileName;
    }
    public void rawOpen() {
        System.out.println("打开文件：" + fileName);
    }

    public void rawPrint() {
        System.out.println("显示文件内容");
    }

    public void rawClose() {
        System.out.println("关闭文件：" + fileName);
    }

}
