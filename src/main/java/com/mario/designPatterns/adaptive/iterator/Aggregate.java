package com.mario.designPatterns.adaptive.iterator;


public interface Aggregate<E> {
    /** 接口中声明的方法只有一个
     *  iterator方法会生成一个用于遍历集合的迭代器
     *  */
    public abstract MyIterator<E> iterator();
}
