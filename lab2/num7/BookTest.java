package lab2.num7;

public class BookTest {
    public static void main(String[] args) {

        Book book1 = new Book("abc", "author1", 1890);
        Book book2 = new Book("qqq", "author2", 2000);
        Book book3 = new Book("qqqqqqq", "author3", 2010);
        Book book4 = new Book("qwert", "author4", 1900);
        Book book5 = new Book("aaaaaa", "author5", 1980);

        BookShelf bookShelf = new BookShelf(5);
        bookShelf.addBook(book1);
        bookShelf.addBook(book2);
        bookShelf.addBook(book3);
        bookShelf.addBook(book4);
        bookShelf.addBook(book5);

        bookShelf.printBookShelf();

        System.out.println("Самая поздняя книга: " + bookShelf.getLatestBook());
        System.out.println("Самая ранняя книга: " + bookShelf.getOldestBook());

        bookShelf.sortBooksByYear();
        bookShelf.printBookShelf();
    }
}

