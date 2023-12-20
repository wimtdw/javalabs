package lab9.num1;

public class StudentSortTest {
    public static void main(String[] args) {
        Student[] students = {
                new Student(101, "Alice"),
                new Student(103, "Bob"),
                new Student(102, "Charlie"),
                new Student(105, "David"),
                new Student(104, "Eve")
        };

        System.out.println("Before sorting:");
        printStudents(students);

        insertionSort(students);

        System.out.println("\nAfter sorting by iDNumber:");
        printStudents(students);
    }

    public static void insertionSort(Student[] students) {
        int n = students.length;

        for (int i = 1; i < n; i++) {
            Student key = students[i];
            int j = i - 1;

            while (j >= 0 && students[j].getIDNumber() > key.getIDNumber()) {
                students[j + 1] = students[j];
                j = j - 1;
            }
            students[j + 1] = key;
        }
    }

    public static void printStudents(Student[] students) {
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

