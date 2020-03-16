package com.mario.designPatterns.consistency.decorator;

public class StringDisplay extends Display {
    private String string;
    public StringDisplay(String string) {
        this.string = string;
    }
    public int getColumns() {
        return string.getBytes().length;
        //return string.length();
    }
    public int getRows() {
        return 1;
    }
    public String getRowText(int row) {
        return row == 0 ? string : null;
    }
}
