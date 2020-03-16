package com.mario.designPatterns.consistency.decorator;

public class UpDownBorder extends Border {
    private char borderChar;
    public UpDownBorder(Display display, char borderChar) {
        super(display);
        this.borderChar = borderChar;
    }
    public int getColumns() {
        return display.getColumns();
    }
    public int getRows() {
        return 1 + display.getRows() + 1;
    }
    public String getRowText(int row) {
        if (0 == row || 1 + display.getRows() == row) {
            return  makeLine();
        } else {
            return display.getRowText(row - 1);
        }
    }

    private String makeLine() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < display.getColumns(); i++) {
            sb.append(borderChar);
        }
        return sb.toString();
    }
}
