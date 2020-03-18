package com.mario.designPatterns.simplify.facade;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PageMaker {
    private PageMaker(){}
    public static void makeWelcomePage(String mailAddr, String fileName) {
        try {
            Properties mailProp = DataBase.getProperties("maildata");
            String username = mailProp.getProperty(mailAddr);
            HtmlWriter writer = new HtmlWriter(new FileWriter(fileName));
            writer.title("Welcome to " + username + "'s page!");
            writer.paragraph(username + "欢迎来到" + username + " 的主页");
            writer.paragraph("等着你的邮件哦！");
            writer.mailto(mailAddr, username);
            writer.close();
            System.out.println(fileName + " is created for " + mailAddr + " (" + username + "）");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void makeLinkPage(String fileName) {
        try {
            Properties mailProp = DataBase.getProperties("maildata");
            Set<Object> mailAddresses = mailProp.keySet();
            HtmlWriter writer = new HtmlWriter(new FileWriter(fileName));
            writer.title("Link Page");
            Enumeration en = mailProp.propertyNames();
            for (Object o : mailAddresses) {
                String mailAddr = (String)o;
                String userName = mailProp.getProperty(mailAddr);
                writer.mailto(mailAddr, userName);
            }

            while(en.hasMoreElements()) {
                String address = (String)en.nextElement();
                String userName = mailProp.getProperty(address);
                writer.mailto(address, userName);
            }
            writer.close();
            System.out.println(fileName + " is created ." );
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        PageMaker.makeWelcomePage("hyuki@hyuki.com", "welcome.html");
        PageMaker.makeLinkPage("link.html");
    }
 }
