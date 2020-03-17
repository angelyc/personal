package com.mario.designPatterns.accessDataStruct.Visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FileFindVisitor extends Visitor {
    private String suffix;
    private String currentDir;
    private List<File> files;
    public FileFindVisitor(String suffix) {
        this.suffix = suffix;
        files = new ArrayList<>();
    }
    public void visit(File file) {
        String name = file.getName();
        if (name.contains(suffix)) {
            files.add(file);
        }
    }
    public void visit(Directory directory) {
        String saveDir = currentDir;
        currentDir = currentDir + "/" + directory.getName();
        Iterator iterator = directory.iterator();
        while (iterator.hasNext()){
            Entry entry = (Entry)iterator.next();
            entry.accept(this);
        }
        currentDir = saveDir;
    }

    public Iterator getFoundFiles() {
        return files.iterator();
    }
}
