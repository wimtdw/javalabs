package lab2.num1;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("John Smith", "john@mail.com", 'M');
        System.out.println(author.getName());
        System.out.println(author.getGender());
        System.out.println(author.getEmail());
        System.out.println(author);
        author.setEmail("smith@mail.com");
        System.out.println(author.getEmail());
        System.out.println(author);
    }
}
