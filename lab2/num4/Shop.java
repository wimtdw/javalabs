package lab2.num4;
import java.util.ArrayList;
import java.util.List;

class Shop implements Input {
    private List<Computer> computers = new ArrayList<>();

    // Метод для добавления компьютера в магазин
    public void addComputer() {
        String brand = getStringInput("Введите бренд компьютера");
        String model = getStringInput("Введите модель компьютера");
        Computer computer = new Computer(brand, model);
        computers.add(computer);
    }

    // Метод для удаления компьютера из магазина
    public void removeComputer() {
        if (computers.isEmpty()) {
            System.out.println("Компьютеров нет");
            return;
        }

        System.out.println("Список компьютеров:");
        for (int i = 0; i < computers.size(); i++) {
            System.out.println((i + 1) + ". " + computers.get(i));
        }

        int choice;
        while (true) {
            choice = getIntegerInput("Номер компьютера для удаления");
            if (choice >= 1 && choice <= computers.size()) {
                break;
            } else {
                System.out.println("Неверный номер компьютера. Попробуйте снова.");
            }
        }
        computers.remove(choice - 1);
    }

    // Метод для поиска компьютера по бренду и модели
    public void findComputer() {
        if (computers.isEmpty()) {
            System.out.println("Магазин пуст");
            return;
        }

        String brand = getStringInput("Введите бренд компьютера");
        String model = getStringInput("Введите модель компьютера");

        boolean found = false;
        System.out.println("Результаты поиска:");
        for (Computer computer : computers) {
            if (computer.getBrand().equals(brand) && computer.getModel().equals(model)) {
                System.out.println(computer);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Компьютер не найден");
        }
    }
    public String getStringInput(String str) {
        System.out.print(str + ": ");
        return scanner.nextLine();
    }
    public int getIntegerInput(String str) {
        System.out.print(str + ": ");
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.print("try again: ");
            }
        }
    }
}

