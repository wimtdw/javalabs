package lab7.num7_8;

class Magazine implements Printable {
    private String title;

    public Magazine(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public void print() {
        System.out.println("Magazine: " + title);
    }

    public static void printMagazines(Printable[] printables) {
        System.out.println("Printing Magazines:");
        for (Printable printable : printables) {
            if (printable instanceof Magazine) {
                printable.print();
            }
        }
    }
}

