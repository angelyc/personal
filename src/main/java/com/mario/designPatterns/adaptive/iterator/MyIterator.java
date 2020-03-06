package com.mario.designPatterns.adaptive.iterator;

/** 定义接口MyIterator
 *  以区分java提供java.util.Iterator接口*/
public interface MyIterator<T> {
    boolean hasNext();
    T next();
}
