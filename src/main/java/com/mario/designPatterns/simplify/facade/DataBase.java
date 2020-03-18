package com.mario.designPatterns.simplify.facade;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

class DataBase {
    private DataBase() {}
    static Properties getProperties(String dbName) {
        String fileName = dbName + ".txt";
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }
}
