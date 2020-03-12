package com.mario.designPatterns.generateInstance.abstractfactory.tablefactory;

import com.mario.designPatterns.generateInstance.abstractfactory.factory.Factory;
import com.mario.designPatterns.generateInstance.abstractfactory.factory.Link;
import com.mario.designPatterns.generateInstance.abstractfactory.factory.Page;
import com.mario.designPatterns.generateInstance.abstractfactory.factory.Tray;

public class TableFactory extends Factory {
    public Link createLink(String caption, String url) {
        return new TableLink(caption, url);
    }

    public Tray createTray(String caption) {
        return new TableTray(caption);
    }

    public Page createPage(String title, String author) {
        return new TablePage(title, author);
    }
}
