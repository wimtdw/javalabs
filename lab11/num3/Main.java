package lab11.num3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Date birthDate = dateFormat.parse("01.01.2000");

        Student student = new Student("John", "Smith", "Computer Science", 1, birthDate);

        System.out.println(student.toString());

        System.out.println("Дата рождения в формате 'dd MMMM yyyy': " + student.getFormattedBirthDate("dd MMMM yyyy")+" года");
    }
}

