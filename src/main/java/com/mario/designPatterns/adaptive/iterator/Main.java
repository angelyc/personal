package com.mario.designPatterns.adaptive.iterator;

import ch.qos.logback.core.db.dialect.MySQLDialect;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Around the World in 80 Days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));
        MyIterator<Book> it = bookShelf.iterator();
        while(it.hasNext()) {
            Book book = it.next();
            System.out.println(book.getName());
        }
        System.out.println("******no generic******");
        MyIterator<Book> it2 = bookShelf.iterator();
        while(it2.hasNext()) {
            Book book = it2.next();
            System.out.println(book.getName());
        }
    }
}
