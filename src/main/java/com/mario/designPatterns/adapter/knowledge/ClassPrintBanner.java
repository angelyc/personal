package com.mario.designPatterns.adapter.knowledge;

/** 使用委托方式实现适配器 */
public class ClassPrintBanner extends ClassPrint {
    private Banner banner;
    public ClassPrintBanner(String string) {
        this.banner = new Banner(string);
    }

    public void printWeak() {
        banner.showWithParen();
    }

    public void printStrong() {
        banner.showWithAster();
    }
}
