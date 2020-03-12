package com.mario.designPatterns.generateInstance.abstractfactory.listfactory;

import com.mario.designPatterns.generateInstance.abstractfactory.factory.Link;

public class ListLink extends Link {
    public ListLink(String caption, String url) {
        super(caption, url);
    }

    public String makeHTML() {
        return "  <li><a href=\"" + url + "\">" + caption + "</a></li>\n";
    }
}
