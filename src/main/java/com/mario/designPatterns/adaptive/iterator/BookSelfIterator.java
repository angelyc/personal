package com.mario.designPatterns.adaptive.iterator;

public class BookSelfIterator implements MyIterator<Book> {
    private BookShelf bookShelf;
    private int index;
    BookSelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    public boolean hasNext() {
        return index < bookShelf.getLength();
    }

    public Book next() {
        Book book = bookShelf.getBootAt(index);
        index++;
        return book;
    }
}
