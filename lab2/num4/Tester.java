package lab2.num4;

public class Tester {

    public static void main(String[] args) {
        Shop shop = new Shop();


        System.out.println("\nМеню:");
        System.out.println("1 - Добавить компьютер");
        System.out.println("2 - Удалить компьютер");
        System.out.println("3 - Поиск компьютера по бренду и модели");
        System.out.println("0 - Выход");

        int choice = 10;
        while (choice != 0) {
            choice = shop.getIntegerInput("Выберите действие");
            switch (choice) {
                case 1:
                    shop.addComputer();
                    break;
                case 2:
                    shop.removeComputer();
                    break;
                case 3:
                    shop.findComputer();
                    break;
                case 0:
                    //System.exit(0);
                    break;
                default:
                    System.out.println("try again");
            }
        }
    }
}

