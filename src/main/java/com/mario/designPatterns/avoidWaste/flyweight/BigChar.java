package com.mario.designPatterns.avoidWaste.flyweight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOError;
import java.io.IOException;

public class BigChar {
    // 字符名字
    private static String path = "./src/main/java/com/mario/designPatterns/avoidWaste/flyweight/bigchars/";
    private char charName;
    private String fontData;
    public BigChar(char charName) {
        this.charName = charName;
        try {
            BufferedReader reader = new BufferedReader(
                    new FileReader(path + "big" + charName + ".txt"));
            String line;
            StringBuilder stringBuilder = new StringBuilder();
            while((line = reader.readLine()) != null) {
                stringBuilder.append(line);
                stringBuilder.append("\n");
            }
            reader.close();
            this.fontData = stringBuilder.toString();
        } catch (IOException e) {
            this.fontData = charName + "?";
        }
    }

    public void print() {
        System.out.println(fontData);
    }
}
