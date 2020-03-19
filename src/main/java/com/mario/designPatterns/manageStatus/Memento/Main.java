package com.mario.designPatterns.manageStatus.Memento;

public class Main {
    public static void main(String[] args) {
        Gamer gamer = new Gamer(100);
        Memento memento = gamer.createMemento();
        for (int i = 0; i < 100; i++) {
            System.out.println("====" + i);
            System.out.println("当前状态：" + gamer);
            gamer.bet();
            System.out.println("所持有金钱为" + gamer.getMoney());
            if (gamer.getMoney() > memento.getMoney()) {
                System.out.println("    (所持有的金钱增加了许多，因此保存游戏当前的状态)");
                memento = gamer.createMemento();
            } else if (gamer.getMoney() < memento.getMoney()){
                System.out.println("    (所持有的金钱减少了许多，因此将游戏恢复至以前的状态)");
                gamer.restoreMemento(memento);
            }
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
            System.out.println("");
        }
    }
}