package com.mario.designPatterns.adaptive.iterator;

public class BookSelfIterator2 implements MyIterator {
    private BookShelf bookShelf;
    private int index;

    public BookSelfIterator2(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    public boolean hasNext() {
        if (index < bookShelf.getLenght()) {
            return true;
        } else {
            return false;
        }
    }

    public Book next() {
        Book book = bookShelf.getBootAt(index);
        index++;
        return book;
    }
}
