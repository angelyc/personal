package com.mario.designPatterns.adaptive.iterator;

public class BookShelf implements Aggregate<Book> {
    private Book[] books;
    private int last = 0;

    BookShelf(int maxSize) {
        books = new Book[maxSize];
    }

    Book getBootAt(int index) {
        return books[index];
    }

    void appendBook(Book book) {
        books[last] = book;
        last++;
    }

    int getLength() {
        return last;
    }

    public  MyIterator iterator() {
        return new BookSelfIterator(this);
    }
}
