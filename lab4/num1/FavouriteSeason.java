package lab4.num1;


public class FavouriteSeason {
    public static void main(String[] args) {
        Season myFavouriteSeason = Season.Лето;

        System.out.println("Мое любимое время года: " + myFavouriteSeason);

        switch (myFavouriteSeason) {
            case Весна:
                System.out.println("Я люблю весну!");
                System.out.println("Средняя температура: "+ Season.Весна.getAverageTemperature());
                System.out.println(Season.Весна.getDescription());

                break;
            case Лето:
                System.out.println("Я люблю лето!");
                System.out.println("Средняя температура: "+ Season.Лето.getAverageTemperature());
                System.out.println(Season.Лето.getDescription());
                break;
            case Осень:
                System.out.println("Я люблю осень!");
                System.out.println("Средняя температура: "+ Season.Осень.getAverageTemperature());
                System.out.println(Season.Осень.getDescription());
                break;
            case Зима:
                System.out.println("Я люблю зиму!");
                System.out.println("Средняя температура: "+ Season.Зима.getAverageTemperature());
                System.out.println(Season.Зима.getDescription());
                break;
            default:
                System.out.println("Я не могу определить мое любимое время года.");
        }
        System.out.println();
        for (Season season : Season.values()) {
            System.out.println("Время года: " + season.name());
            System.out.println("Средняя температура: " + season.getAverageTemperature() + " градусов Цельсия");
            System.out.println("Описание: " + season.getDescription());
            System.out.println();
        }
    }
}
