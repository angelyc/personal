package com.mario.designPatterns.expression.interprete;

public abstract class Node {
    public abstract void parse(Context context) throws ParseException;
}
