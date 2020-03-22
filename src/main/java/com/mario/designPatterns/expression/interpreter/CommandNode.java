package com.mario.designPatterns.expression.interpreter;

public class CommandNode extends Node {
    private Node node;
    @Override
    public void parse(Context context) throws ParseException {
        if (context.getCurrentToken().equals("repeat")) {
            node = new RepeadCommandNode();
            node.parse(context);
        } else {
            node = new PrimitiveCommandNode();
            node.parse(context);
        }
    }

    @Override
    public String toString() {
        return node.toString();
    }
}