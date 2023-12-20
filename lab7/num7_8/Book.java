package lab7.num7_8;

class Book implements Printable {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public void print() {
        System.out.println("Book: " + title);
    }

    public static void printBooks(Printable[] printables) {
        System.out.println("Printing Books:");
        for (Printable printable : printables) {
            if (printable instanceof Book) {
                printable.print();
            }
        }
    }
}

