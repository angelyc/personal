package com.mario.designPatterns.manageStatus.State;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SafeFrame extends Frame implements ActionListener, Context {
    private State state = DayState.getInstance();
    private TextField textClock = new TextField(60);
    private TextArea textScreen = new TextArea(10, 60);
    private Button buttonUse = new Button("use");
    private Button buttonAlarm = new Button("alarm");
    private Button buttonPhone = new Button("phone");
    private Button buttonExit = new Button("exit");

    public SafeFrame(String title) {
        super(title);
        setBackground(Color.lightGray);
        setLayout(new BorderLayout());
        // 配置textClock
        add(textClock, BorderLayout.NORTH);
        textClock.setEditable(false);
        // textScreen
        add(textScreen, BorderLayout.CENTER);
        textScreen.setEditable(false);
        // 为界面添加按钮
        Panel panel = new Panel();
        panel.add(buttonUse);
        panel.add(buttonAlarm);
        panel.add(buttonPhone);
        panel.add(buttonExit);
        // 配置界面
        add(panel, BorderLayout.SOUTH);
        // 显示
        pack();
        show();
        // 设置监听器
        buttonUse.addActionListener(this);
        buttonAlarm.addActionListener(this);
        buttonPhone.addActionListener(this);
        buttonExit.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.toString());
        if (e.getSource() == buttonUse) {
            state.doUse(this);
        } else if (e.getSource() == buttonAlarm) {
            state.doAlarm(this);
        } else if (e.getSource() == buttonPhone) {
            state.doPhone(this);
        } else if (e.getSource() == buttonExit) {
            System.exit(0);
        } else {
            System.out.println("?");
        }
    }

    @Override
    public void setClock(int hour) {
        String clockString = "现在时间是";
        if (hour < 10) {
            clockString += "0" + hour + ":00";
        }
        clockString += hour + ":00";
        System.out.println(clockString);
        textClock.setText(clockString);
        state.doClock(this, hour);
    }

    @Override
    public void changeState(State state) {
        System.out.println("从" + this.state + "状态变为了" + state + "状态。");
        this.state = state;
    }

    @Override
    public void callSecurityCenter(String msg) {
        textScreen.append("call!" + msg + "\n");
    }

    @Override
    public void recordLog(String msg) {
        textScreen.append("record ... " + msg + "\n");
    }
}
