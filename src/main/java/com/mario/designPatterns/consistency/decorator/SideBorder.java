package com.mario.designPatterns.consistency.decorator;

public class SideBorder extends Border{
    private char borderChar;                                // 表示修饰符的字符
    public SideBorder(Display display, char borderChar) {
        super(display);
        this.borderChar = borderChar;
    }
    public int getColumns() {
        return 1 + display.getColumns() + 1;
    }
    public int getRows() {
        return display.getRows();
    }
    public String getRowText(int row) {
        return borderChar + display.getRowText(row) + borderChar;
    }
}
