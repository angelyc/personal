package com.mario.designPatterns.avoidWaste.flyweight;

public class BigString {
    private BigChar[] bigChars;
    public BigString(String string) {
        initShared(string);
    }
    private void initShared(String string) {
        bigChars = new BigChar[string.length()];
        BigCharFactory bcf = BigCharFactory.getInstance();
        for (int i = 0; i < string.length(); i++) {
            bigChars[i] = bcf.getBigChar(string.charAt(i));
        }
    }
    private void initUnshared(String string) {
        bigChars = new BigChar[string.length()];
        for (int i = 0; i < string.length(); i++) {
            bigChars[i] = new BigChar(string.charAt(i));
        }
    }
    public BigString(String string, boolean shared) {
        if (shared) {
            initShared(string);
        } else {
            initUnshared(string);
        }
    }
    public void print() {
        for (int i = 0; i < bigChars.length; i++) {
            bigChars[i].print();
        }
    }
}
