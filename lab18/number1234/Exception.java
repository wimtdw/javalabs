package lab18.number1234;

import java.util.Scanner;

public class Exception {
    static public void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        try {
            int i = Integer.parseInt(intString);
            System.out.println( 2/i );
        }
        catch (ArithmeticException e){
            System.out.println("Попытка деления на ноль!");
        }
        catch (NumberFormatException e){
            System.out.println("Неправильный формат введённого числа!");
        }
        finally {
            System.out.println("Программа закончила работу");
        }
    }

    public static void main(String[] args) {
        exceptionDemo();
    }
}
