package lab17.number1;

public class MVCPatternDemo {
    public static void main(String[] args) {
        Student student = DataBase();

        StudentView view = new StudentView();
        StudentController controller = new StudentController(student, view);

        controller.updateView();

        System.out.println("\nAfter updaiting");

        controller.setStudentName("Jane");
        controller.updateView();
    }

    static public Student DataBase(){
        Student student = new Student();
        student.setName("John");
        student.setRollNo("123ABC");
        return student;
    }
}

