package com.mario.designPatterns.adaptive.iterator;

public class BookSelfIterator<T> implements MyIterator<T> {
    private BookShelf<T> bookShelf;
    private int index;
    BookSelfIterator(BookShelf<T> bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    public boolean hasNext() {
        return index < bookShelf.getLength();
    }

    public T next() {
        T book = bookShelf.getBootAt(index);
        index++;
        return book;
    }
}
