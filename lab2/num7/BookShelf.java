package lab2.num7;

import java.util.Arrays;
import java.util.Comparator;

public class BookShelf {
    public Book[] books;
    public int size;

    public BookShelf(int count) {
        books = new Book[count];
        size = 0;
    }
    public void addBook(Book book) {
        if (size < books.length) {
            books[size++] = book;
        } else {
            System.out.println("bookshelf is full");
        }
    }
    public Book getLatestBook() {
        if (size == 0) {
            return null;
        }

        Book latestBook = books[0];
        for (int i = 1; i < size; i++) {
            if (books[i].getYear() > latestBook.getYear()) {
                latestBook = books[i];
            }
        }
        return latestBook;
    }
    public Book getOldestBook() {
        if (size == 0) {
            return null;
        }

        Book oldestBook = books[0];
        for (int i = 1; i < size; i++) {
            if (books[i].getYear() < oldestBook.getYear()) {
                oldestBook = books[i];
            }
        }
        return oldestBook;
    }
    public void sortBooksByYear() {
        Arrays.sort(books, 0, size, Comparator.comparingInt(Book::getYear));
    }


    public void printBookShelf() {
        System.out.println("Книжная полка: ");
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
    }

}
