package com.mario.designPatterns.adaptive.iterator;

public class BookShelf implements Aggregate<Book> {
    private Book[] books;
    private int last = 0;

    public BookShelf(int maxSize) {
        books = new Book[maxSize];
    }

    public Book getBootAt(int index) {
        return books[index];
    }

    public void appendBook(Book book) {
        books[last] = book;
        last++;
    }

    public int getLenght() {
        return last;
    }

    public MyIterator<Book> iterator() {
        return new BookSelfIterator(this);
    }

    public MyIterator iterator2() {
        return new BookSelfIterator2(this);
    }
}
