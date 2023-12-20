package lab19.number2;
import java.util.*;

class SortingStudentsByGPA {
    private List<Student> studentList;

    public SortingStudentsByGPA() {
        studentList = new ArrayList<>();
    }

    public void setArray(List<Student> students) {
        studentList.addAll(students);
    }

    public void quicksort() {
        Collections.sort(studentList, (s1, s2) -> Double.compare(s2.getGpa(), s1.getGpa()));
    }

    public void quicksortByField(Comparator<Student> comparator) {
        Collections.sort(studentList, comparator);
    }

    public void outArray() {
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    public Student findStudentByFullName(String fullName) throws StudentNotFoundException {
        for (Student student : studentList) {
            if ((student.getFirstName() + " " + student.getLastName()).equalsIgnoreCase(fullName)) {
                return student;
            }
        }
        throw new StudentNotFoundException("Студент с ФИО '" + fullName + "' не найден.");
    }

    public static void main(String[] args) {
        List<Student> students1 = new ArrayList<>();
        students1.add(new Student("Иван", "Иванов", "Информатика", 3, "Группа1", 4.5));
        students1.add(new Student("Петр", "Петров", "Математика", 2, "Группа2", 3.8));

        List<Student> students2 = new ArrayList<>();
        students2.add(new Student("Анна", "Смирнова", "Физика", 4, "Группа3", 4.9));
        students2.add(new Student("Алексей", "Сидоров", "Химия", 3, "Группа1", 4.2));

        SortingStudentsByGPA system = new SortingStudentsByGPA();
        system.setArray(students1);

        try {
            Student student = system.findStudentByFullName("Иван Иванов");
            System.out.println("Найден студент: " + student);
        } catch (StudentNotFoundException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }

        try {
            Student student = system.findStudentByFullName("Tyler");
            System.out.println("Найден студент: " + student);
        } catch (StudentNotFoundException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }

        system.quicksort();

        System.out.println("\nСортировка по среднему баллу:");
        system.outArray();

        System.out.println("\nДобавляем еще студентов и сортируем по имени:");
        system.setArray(students2);
        system.quicksortByField(Comparator.comparing(Student::getFirstName));
        system.outArray();
    }
}
