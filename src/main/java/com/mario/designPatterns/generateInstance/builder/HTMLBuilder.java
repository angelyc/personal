package com.mario.designPatterns.generateInstance.builder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class HTMLBuilder extends Builder{
    private String fileName;
    private PrintWriter writer;
    public void makeTitle(String title){
        fileName = title + ".html";
        try {
            writer = new PrintWriter(new FileWriter(fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }

        writer.println("<html><head><title>" +title + "</title></head>" +
                "<body>");
        writer.println("<h1>" + title + "</h1>");
    }
    public void makeString(String str){
        writer.println("<p>" + str + "</p>");
    }
    public void makeItems(String[] items){
        writer.println("<ul>");
        for (String item:items) {
            writer.println("<li>" + item + "</li>");
        }
        writer.println("</ul>");
    }
    public void close(){
        writer.println("</body></html>");
        writer.close();
    }

    public String getResult() {
        return fileName;
    }
}
