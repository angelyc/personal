package com.mario.designPatterns.adaptive.adapter.exercise;

import java.io.*;
import java.util.Properties;

public class FileProperties implements FileIO {
    Properties p;
    public FileProperties() {
        this.p = new Properties();
    }

    @Override
    public void readFromFile(String fileName) throws IOException {
        InputStream in = new FileInputStream(fileName);
        p.load(in);
    }

    @Override
    public void writeToFile(String fileName) throws IOException {
        OutputStream out = new FileOutputStream(fileName);
        String header = "#written by FileProperties";
        p.store(out, header);
    }

    @Override
    public void setValue(String key, String value) {
        p.setProperty(key, value);
    }

    @Override
    public String getValue(String key) {
        return p.getProperty(key);
    }
}
