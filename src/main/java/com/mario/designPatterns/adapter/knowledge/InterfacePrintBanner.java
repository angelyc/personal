package com.mario.designPatterns.adapter.knowledge;

/** 使用继承方式实现的适配器 */
public class InterfacePrintBanner extends Banner implements InterfacePrint {
    public InterfacePrintBanner(String string) {
        super(string);
    }
    public void printWeak() {
        showWithParen();
    }
    public void printStrong() {
        showWithAster();
    }
}
