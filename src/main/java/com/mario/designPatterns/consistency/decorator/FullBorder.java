package com.mario.designPatterns.consistency.decorator;

public class FullBorder extends Border {
    public FullBorder(Display display) {
        super(display);
    }
    public int getColumns() {
        return 1 + display.getColumns() + 1;
    }
    public int getRows() {
        return 1 + display.getRows() + 1;
    }
    public String getRowText(int row) {
        if (0 == row || 1 + display.getRows() == row) {
            return "+" + makeLine() + "+";
        } else {
            return "|" + display.getRowText(row - 1) + "|";
        }
    }

    private String makeLine() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < display.getColumns(); i++) {
            sb.append('-');
        }
        return sb.toString();
    }
}
