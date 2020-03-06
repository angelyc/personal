package com.mario.designPatterns.childClass.templateMethod;

public class TemplateMethod {
    /** 在父类中定义处理流程的框架，在子类中实现具体处理的模式称为Template Method模式 */
    public static void main(String[] args) {
        CharDisplay cd = new CharDisplay('*');
        StringDisplay sd = new StringDisplay("hello template method");
        cd.display();
        sd.display();
    }
}
