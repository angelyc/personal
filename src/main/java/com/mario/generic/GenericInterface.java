package com.mario.generic;

/** 泛型接口（接口上含有泛型）
 * 格式：
 *      public [abstract] interface 接口名<泛型变量> {
 *          // 方法
 *      }
 * */
public interface GenericInterface<T> {
    public T whoAmI(T t);
}
