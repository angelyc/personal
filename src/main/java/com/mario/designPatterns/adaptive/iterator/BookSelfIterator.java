package com.mario.designPatterns.adaptive.iterator;

public class BookSelfIterator implements MyIterator<Book> {
    private BookShelf bookShelf;
    private int index;
    public BookSelfIterator(BookShelf bookShelf) {
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
