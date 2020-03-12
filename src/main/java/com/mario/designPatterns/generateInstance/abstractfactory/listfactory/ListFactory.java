package com.mario.designPatterns.generateInstance.abstractfactory.listfactory;

import com.mario.designPatterns.generateInstance.abstractfactory.factory.Factory;
import com.mario.designPatterns.generateInstance.abstractfactory.factory.Link;
import com.mario.designPatterns.generateInstance.abstractfactory.factory.Page;
import com.mario.designPatterns.generateInstance.abstractfactory.factory.Tray;

public class ListFactory extends Factory {
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
