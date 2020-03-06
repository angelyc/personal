package com.mario.generic;

public class NormalName<T> implements GenericInterface<T> {
    public T whoAmI(T name) {
        return name;
    }
}
