package lab4_1.num5;


public class Main {
    public static void main(String[] args) {
        Reader reader = new Reader("Петров В. В.", 12345, "Факультет информатики", "01.01.1990", "+7 (123) 456-7890");

        reader.takeBook(3);

        Book book1 = new Book("Приключения", "Автор1");
        Book book2 = new Book("Словарь", "Автор2");
        Book book3 = new Book("Энциклопедия", "Автор3");

        reader.takeBook(book1, book2, book3);

        reader.returnBook(2);
        reader.returnBook(book1, book2);
    }
}
