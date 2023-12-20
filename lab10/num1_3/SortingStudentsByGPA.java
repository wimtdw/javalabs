package lab10.num1_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingStudentsByGPA {
    private List<Student> iDNumber = new ArrayList<>();

    public void setArray(List<Student> students) {
        iDNumber.addAll(students);
    }

    public void quicksort(Comparator<Student> comparator) {
        iDNumber.sort(comparator);

    }

    public List<Student> getArray() {
        return iDNumber;
    }

    public void outArray() {
        for (Student student : iDNumber) {
            System.out.println(student);
        }
    }

    public static void main(String[] args) {
        SortingStudentsByGPA sorter1 = new SortingStudentsByGPA();
        SortingStudentsByGPA sorter2 = new SortingStudentsByGPA();
        List<Student> students1 = new ArrayList<>();
        List<Student> students2 = new ArrayList<>();

        students1.add(new Student("Alice", "Smith", "Computer Science", 3, "Group A", 3.8));
        students1.add(new Student("Bob", "Johnson", "Engineering", 2, "Group B", 3.5));
        students2.add(new Student("Charlie", "Brown", "Mathematics", 4, "Group C", 4.0));
        students2.add(new Student("David", "Lee", "Physics", 3, "Group A", 3.9));
        students2.add(new Student("Eve", "Davis", "Chemistry", 2, "Group B", 3.7));

        sorter1.setArray(students1);
        sorter2.setArray(students2);

        sorter1.quicksort((s1, s2) -> Double.compare(s2.getGPA(), s1.getGPA()));
        sorter2.quicksort((s1, s2) -> Double.compare(s2.getGPA(), s1.getGPA()));

        List<Student> mergedStudents = new ArrayList<>();
        mergedStudents.addAll(sorter1.getArray());
        mergedStudents.addAll(sorter2.getArray());

        mergedStudents.sort((s1, s2) -> Double.compare(s2.getGPA(), s1.getGPA()));

        System.out.println("Merged and sorted by GPA in descending order:");
        for (Student student : mergedStudents) {
            System.out.println(student);
        }
    }
}
