package lab6.num11;


public class Main {
    public static void main(String[] args) {
        double celsius = 25.0; // Температура в градусах Цельсия

        Convertable kelvinConverter = new CelsiusToKelvinConverter();
        Convertable fahrenheitConverter = new CelsiusToFahrenheitConverter();

        double kelvin = kelvinConverter.convert(celsius);
        double fahrenheit = fahrenheitConverter.convert(celsius);

        System.out.println(celsius + " градусов Цельсия равны:");
        System.out.println(kelvin + " Кельвинам");
        System.out.println(fahrenheit + " градусам Фаренгейта");
    }
}

