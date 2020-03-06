package com.mario.generic;

/** 泛型接口（接口上含有泛型）
 * 格式：
 *      public [abstract] interface 接口名<泛型变量> {
 *          // 方法
 *      }
 *  对于泛型接口，有两种方式确定其泛型的类型
 *  1、类实现接口的时候，直接明确泛型类型，如StringName
 *  2、类实现接口的时候，还不确定数据类型，这时可以先在实现类上定义泛型，然后按照泛型类的确定方法确定实际类型
 *
 * */
public interface GenericInterface<T> {
    public T whoAmI(T t);
}

