package com.mario.designPatterns.accessDataStruct.Visitor;

import java.util.Iterator;

public class ListVisitor extends Visitor {
    private String currentDir = "";
    public void visit(File file) {
        System.out.println(currentDir + "/" + file);
    }
    public void visit(Directory directory) {
        System.out.println(currentDir + "/" + directory);
        String saveDir = currentDir;
        currentDir = currentDir + "/" + directory.getName();
        Iterator iterator = directory.iterator();
        while (iterator.hasNext()){
            Entry entry = (Entry)iterator.next();
            entry.accept(this);
        }
        currentDir = saveDir;
    }
}
