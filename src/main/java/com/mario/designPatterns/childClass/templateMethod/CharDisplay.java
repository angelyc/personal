package com.mario.designPatterns.childClass.templateMethod;

public class CharDisplay extends AbstractDisplay{
    private char ch; // 需要显示的字符
    public CharDisplay(char ch) {
        this.ch = ch;
    }
    public void open() {
        System.out.printf("<<");
    }
    public void print() {
        System.out.printf("%c", ch);
    }
    public void close(){
        System.out.println(">>");
    }
}
