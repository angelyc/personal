package com.mario.designPatterns.consistency.decorator;

import java.util.ArrayList;
import java.util.List;

public class MultiStringDisplay extends Display {
    private List<String> strings;
    public MultiStringDisplay() {
        strings = new ArrayList<>();
    }
    public int getColumns() {
        int n = 0;
        for(String s : strings) {
            if (s.length() > n) {
                n = s.length();
            }
        }
        return n;
    }

    public int getRows() {
        return strings.size();
    }

    public String getRowText(int row) {
        if (row < strings.size()) {
            return fix(strings.get(row));
        } else {
            return null;
        }
    }

    public void add(String string) {
        strings.add(string);
    }

    private String fix (String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        int n = getColumns();
        while(sb.length() < n) {
            sb.append(" ");
        }
        return sb.toString();
    }
}
