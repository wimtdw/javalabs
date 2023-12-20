package lab17.number2;

public class View {
    public void print(String name, String Id, int hours){
        System.out.println("Worker Details:");
        System.out.println("\tName: " + name);
        System.out.println("\tId: " + Id);
        System.out.println("\tHours: " + hours);
        System.out.println("\tSalary: " + hours*100);
    }
}
