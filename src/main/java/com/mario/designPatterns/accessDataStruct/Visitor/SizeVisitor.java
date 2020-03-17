package com.mario.designPatterns.accessDataStruct.Visitor;

import java.util.Iterator;

public class SizeVisitor extends Visitor {
    private int size;
    public int getSize() {
        return size;
    }
    public void visit(File file) {
        size += file.getSize();
    }
    public void visit(Directory directory) {
        Iterator iterator = directory.iterator();
        while (iterator.hasNext()){
            Entry entry = (Entry)iterator.next();
            entry.accept(this);
        }
    }
}
