package com.mario.designPatterns.childClass.templateMethod;

public class CharDisplay extends AbstractDisplay{
    private char ch; // 需要显示的字符
    public CharDisplay(char ch) {
        this.ch = ch;
    }
    protected void open() {
        System.out.printf("<<");
    }
    protected void print() {
        System.out.printf("%c", ch);
    }
    protected void close(){
        System.out.println(">>");
    }
}
