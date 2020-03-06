package com.mario.generic;

public class StringName implements GenericInterface<String> {
    public String whoAmI(String name) {
        return  "String: " + name;
    }
}
