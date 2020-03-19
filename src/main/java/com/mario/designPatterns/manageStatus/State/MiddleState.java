package com.mario.designPatterns.manageStatus.State;

public class MiddleState implements State {
    private static MiddleState singleton = new MiddleState();
    private MiddleState(){}
    public static MiddleState getInstance() {
        return singleton;
    }
    public void doClock(Context context, int hour) {
        if (hour >= 13 ) {
            context.changeState(DayState.getInstance());
        }
    }
    public void doUse(Context context){
        context.callSecurityCenter("紧急：午饭使用金库！");
    }
    public void doAlarm(Context context){
        context.callSecurityCenter("按下警铃（午饭）");
    }
    public void doPhone(Context context){
        context.recordLog("午饭的通话录音");
    }

    @Override
    public String toString() {
        return "[午饭]";
    }
}
