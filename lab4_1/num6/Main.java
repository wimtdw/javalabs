package lab4_1.num6;


public class Main {
    public static void main(String[] args) {
        Employer employer = new Employer("Иван", "Петров", 50000);
        Manager manager = new Manager("Мария", "Иванова", 60000, 2000);

        System.out.println("Заработная плата сотрудника: " + employer.getIncome());
        System.out.println("Заработная плата менеджера: " + manager.getIncome());

        Employer[] employees = new Employer[2];
        employees[0] = employer;
        employees[1] = manager;

        for (Employer emp : employees) {
            System.out.println("Заработная плата: " + emp.getIncome());
        }
    }
}

