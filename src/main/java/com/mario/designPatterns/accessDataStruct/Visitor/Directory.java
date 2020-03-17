package com.mario.designPatterns.accessDataStruct.Visitor;

import java.util.ArrayList;
import java.util.Iterator;

public class Directory extends Entry {
    private String name;
    private ArrayList directory = new ArrayList();
    private int size;
    public Directory(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public int getSize() {
        /*int size = 0;
        Iterator it  = directory.iterator();
        while(it.hasNext()) {
            Entry entry = (Entry)it.next();
            size += entry.getSize();
        }
        return size;*/
        SizeVisitor sizeVisitor = new SizeVisitor();
        accept(sizeVisitor);
        return sizeVisitor.getSize();
    }
    public Entry add(Entry entry) {
        directory.add(entry);
        return this;
    }
    public Iterator iterator() {
        return directory.iterator();
    }
    public void accept(Visitor v) {
        v.visit(this);
    }
}
