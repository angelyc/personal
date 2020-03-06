package com.mario.designPatterns.adaptive.adapter.knowledge;

public class Adapter {
    /** 适配器，位于实际情况与需求之间，填补两者之间的差异
     *  适配器的英文为Adapter，意思是“使...相互适应”
     *  在程序世界中，经常会存在现有的程序无法直接使用，需要做适当的变换之后才能使用的情况
     *  这种用于填补“现有程序”和“所需程序”之间差异的设计模式就是Adapter模式
     *  Adapter模式也被称为Wrapper模式。包装器，把A包装成B适用的样子
     *  */
    public static void main(String[] args) {
        /* PrintBanner为使用继承方式实现的适配器 */
        InterfacePrint ip = new InterfacePrintBanner("Design Pattern Adapter");
        ip.printWeak();
        ip.printStrong();

        /* ClassPrintBanner使用委托方式实现适配器 */
        ClassPrintBanner cp = new ClassPrintBanner("使用委托方式实现适配器");
        cp.printStrong();
        cp.printWeak();
    }
}
