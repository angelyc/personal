package com.mario.designPatterns.childClass.templateMethod;

public class StringDisplay extends AbstractDisplay{
    private String str; // 需要显示的字符串
    private int width;
    public StringDisplay(String str) {
        this.str = str;
        width = str.length();
    }
    protected void open() {
        printLine();
    }
    protected void print() {
        System.out.println("|" + str + "|");
    }
    protected void close(){
        printLine();
    }
    private void printLine() {
        String line = "+";
        for (int i = 0; i < width; i++) {
            line += "-";
        }
        line += "+";
        System.out.println(line);
    }
}
