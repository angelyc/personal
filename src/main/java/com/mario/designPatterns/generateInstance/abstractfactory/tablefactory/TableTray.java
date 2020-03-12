package com.mario.designPatterns.generateInstance.abstractfactory.tablefactory;

import com.mario.designPatterns.generateInstance.abstractfactory.factory.Item;
import com.mario.designPatterns.generateInstance.abstractfactory.factory.Tray;

import java.util.Iterator;

public class TableTray extends Tray {
    public TableTray(String caption) {
        super(caption);
    }
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<td>");
        buffer.append("<table width = \"100%\" border = \"1\"<tr>");
        buffer.append("<td bgcolor = \"#cccccc\" align = \"center\" colspan = \"" + tray.size() + "\"><b>" + caption + "</b></tr>");
        buffer.append("</tr>\n");
        buffer.append("<tr>\n");
        Iterator it = tray.iterator();
        while (it.hasNext()) {
            Item item = (Item)it.next();
            buffer.append(item.makeHTML());
        }
        buffer.append("</tr></table>\n");
        buffer.append("</td>\n");
        return buffer.toString();
    }
}
