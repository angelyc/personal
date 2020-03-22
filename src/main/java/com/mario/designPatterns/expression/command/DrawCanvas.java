package com.mario.designPatterns.expression.command;

import java.awt.*;

public class DrawCanvas extends Canvas implements Drawable {
    private Color color;
    private int radius;
    private MacroCommand history;
    public DrawCanvas(int width, int height, MacroCommand history, Color color) {
        setSize(width, height);
        setBackground(Color.WHITE);
        this.history = history;
        this.color = color;
        init();
    }

    @Override
    public void init() {
        color = Color.RED;
        radius = 3;
        history.append(new ColorCommand(this, color));
    }

    public void paint(Graphics g) {
        history.execute();
    }
    @Override
    public void setColor(Color color) {
        this.color = color;
    }
    @Override
    public void draw(int x, int y) {
        Graphics g = getGraphics();
        g.setColor(color);
        g.fillOval(x - radius, y - radius, radius * 2, radius * 2);
    }
}
