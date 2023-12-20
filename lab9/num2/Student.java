package lab9.num2;

import java.util.List;

public class Student implements Comparable<Student>{
    private String name;
    private double GPA;

    public Student(String name, double GPA) {
        this.name = name;
        this.GPA = GPA;
    }

    public String getName() {
        return name;
    }

    public double getGPA() {
        return GPA;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", GPA=" + GPA +
                '}';
    }
    @Override
    public int compareTo(Student student) {
        // Сравниваем по итоговому баллу (GPA) в порядке убывания
        if (this.getGPA() < student.getGPA()) {
            return 1; // Первый студент имеет больший GPA
        } else if (this.getGPA() > student.getGPA()) {
            return -1; // Второй студент имеет больший GPA
        } else {
            return 0; // GPA студентов равны
        }
    }
    public static void quickSort(List<Student> students, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(students, low, high);
            quickSort(students, low, pivotIndex - 1);
            quickSort(students, pivotIndex + 1, high);
        }
    }
    public static int partition(List<Student> students, int low, int high) {
        Student pivot = students.get(high);
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (students.get(j).compareTo(pivot) <= 0) {
                i++;
                Student temp = students.get(i);
                students.set(i, students.get(j));
                students.set(j, temp);
            }
        }
        Student temp = students.get(i + 1);
        students.set(i + 1, students.get(high));
        students.set(high, temp);
        return i + 1;
    }
}
