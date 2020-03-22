package com.mario.designPatterns.expression.command;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener, MouseMotionListener, WindowListener {
    private MacroCommand history = new MacroCommand();
    private DrawCanvas canvas = new DrawCanvas(400, 400, history, Color.RED);
    private JButton clearButton = new JButton("clear");
    private JButton undoButton = new JButton("undo");
    private JButton redButton = new JButton("红色");
    private JButton blackButton = new JButton("黑色");
    private JButton greenButton = new JButton("绿色");
    public Main(String title) {
        super(title);

        this.addWindowListener(this);
        canvas.addMouseMotionListener(this);
        clearButton.addActionListener(this);
        undoButton.addActionListener(this);
        redButton.addActionListener(this);
        redButton.setBackground(Color.RED);
        blackButton.addActionListener(this);
        blackButton.setBackground(Color.BLACK);
        greenButton.addActionListener(this);
        greenButton.setBackground(Color.GREEN);
        Box buttonBox = new Box(BoxLayout.X_AXIS);
        buttonBox.add(clearButton);
        buttonBox.add(undoButton);
        buttonBox.add(redButton);
        buttonBox.add(blackButton);
        buttonBox.add(greenButton);
        Box mainBox = new Box(BoxLayout.Y_AXIS);
        mainBox.add(buttonBox);
        mainBox.add(canvas);
        getContentPane().add(mainBox);
        pack();
        show();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == clearButton) {
            history.clear();
            canvas.init();
            canvas.repaint();
        } else if (e.getSource() == redButton) {
            canvas.setColor(Color.RED);
        } else if (e.getSource() == blackButton) {
            canvas.setColor(Color.BLACK);
        } else if (e.getSource() == greenButton) {
            canvas.setColor(Color.green);
        } else if (e.getSource() == undoButton) {
            history.undo();
            canvas.repaint();
        }
    }

    @Override
    public void mouseMoved(MouseEvent e) {}

    @Override
    public void mouseDragged(MouseEvent e) {
        Command command = new DrawCommand(canvas, e.getPoint());
        history.append(command);
        command.execute();
    }

    @Override
    public void windowClosed(WindowEvent e) {}
    @Override
    public void windowActivated(WindowEvent e) {}
    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }
    @Override
    public void windowDeactivated(WindowEvent e) {}
    @Override
    public void windowDeiconified(WindowEvent e) {}
    @Override
    public void windowOpened(WindowEvent e) {}
    @Override
    public void windowIconified(WindowEvent e) {}

    public static void main(String[] args) {
        new Main("Command Pattern Sample");
    }
}
