package lab11.num4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateAndCalendarFromUserInput {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmm");
        System.out.print("Введите год, месяц, день, часы и минуты (например, 202311201240): ");
        String userInput = scanner.nextLine();

        try {
            Date date = dateFormat.parse(userInput);
            System.out.println("Объект Date: " + date);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            System.out.println("Объект Calendar: " + calendar.getTime());
        } catch (ParseException e) {
            System.out.println("Ошибка при парсинге введенной строки.");
        }
    }
}
