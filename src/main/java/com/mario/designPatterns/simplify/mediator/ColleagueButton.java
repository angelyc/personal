package com.mario.designPatterns.simplify.mediator;

import java.awt.*;

public class ColleagueButton extends Button implements Colleague{
    private Mediator mediator;
    public ColleagueButton(String caption) {
        super(caption);
    }
    public void setMediator(Mediator mediator){
        this.mediator = mediator;
    }
    public void setColleagueEnabled(boolean enabled) { // Mediator下达启用/禁用的指示
        setEnabled(enabled);
    }
}
