package com.mario.designPatterns.iterator;

import java.util.ArrayList;
import java.util.List;

public class BookShelf<T> implements Aggregate<T> {
    private List<T> books;
    private int last = 0;

    BookShelf() {
        books = new ArrayList<>();
    }

    T getBootAt(int index) {
        return books.get(index);
    }

    void appendBook(T book) {
        books.add(book);
        last++;
    }

    int getLength() {
        return last;
    }

    public  MyIterator<T> iterator() {
        return new BookSelfIterator(this);
    }
}
