package com.mario.generic;

public class Main {
    public static void main(String[] args) {
        StringName str = new StringName();
        System.out.println(str.whoAmI("String name"));
        NormalName<String> normalName = new NormalName<>();
        System.out.println(normalName.whoAmI("Normal name"));
    }
}
