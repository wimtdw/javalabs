package lab2.num4;

import java.util.Scanner;

interface Input {
    Scanner scanner = new Scanner(System.in);

    String getStringInput(String str);

    int getIntegerInput(String str);
}

