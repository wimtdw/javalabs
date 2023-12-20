package lab4_1.num5;

class Reader {
    private String fullName;
    private int readerTicketNumber;
    private String faculty;
    private String dateOfBirth;
    private String phoneNumber;

    public Reader(String fullName, int readerTicketNumber, String faculty, String dateOfBirth, String phoneNumber) {
        this.fullName = fullName;
        this.readerTicketNumber = readerTicketNumber;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }

    public void takeBook(int numberOfBooks) {
        System.out.println(fullName + " взял " + numberOfBooks + " книги");
    }

    public void takeBook(String... bookTitles) {
        StringBuilder message = new StringBuilder(fullName + " взял книги: ");
        for (int i = 0; i < bookTitles.length; i++) {
            message.append(bookTitles[i]);
            if (i < bookTitles.length - 1) {
                message.append(", ");
            }
        }
        System.out.println(message);
    }

    public void takeBook(Book... books) {
        StringBuilder message = new StringBuilder(fullName + " взял книги: ");
        for (int i = 0; i < books.length; i++) {
            message.append(books[i].getTitle());
            if (i < books.length - 1) {
                message.append(", ");
            }
        }
        System.out.println(message);
    }

    public void returnBook(int numberOfBooks) {
        System.out.println(fullName + " вернул " + numberOfBooks + " книги");
    }

    public void returnBook(String... bookTitles) {
        StringBuilder message = new StringBuilder(fullName + " вернул книги: ");
        for (int i = 0; i < bookTitles.length; i++) {
            message.append(bookTitles[i]);
            if (i < bookTitles.length - 1) {
                message.append(", ");
            }
        }
        System.out.println(message);
    }

    public void returnBook(Book... books) {
        StringBuilder message = new StringBuilder(fullName + " вернул книги: ");
        for (int i = 0; i < books.length; i++) {
            message.append(books[i].getTitle());
            if (i < books.length - 1) {
                message.append(", ");
            }
        }
        System.out.println(message);
    }
}

