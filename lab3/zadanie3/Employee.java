package lab3.zadanie3;
import java.util.Arrays;
import java.text.NumberFormat;
import java.util.Formatter;
import java.util.Locale;

public class Employee {
    private String fullname;
    private double salary;

    public Employee(String fullname, double salary) {
        this.fullname = fullname;
        this.salary = salary;
    }

    public String getFullname() {
        return fullname;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        Locale.setDefault(Locale.UK);
        NumberFormat numberFormat3 = NumberFormat.getCurrencyInstance();
        return String.format("%-20s: %s", fullname, numberFormat3.format(salary));
    }

    public static class Report {
        public static void generateReport(Employee[] employees) {
            System.out.println("Отчет о сотрудниках:");
            for (Employee employee : employees) {
                System.out.println(employee);
            }
        }
    }
    public static void main(String[] args) {

        Employee[] employees = new Employee[3];
        employees[0] = new Employee("John Smith", 125000.0);
        employees[1] = new Employee("Rose Tyler", 80000.5);
        employees[2] = new Employee("Martha Jones", 90000.5);

        Report.generateReport(employees);
    }
}

