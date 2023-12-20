package lab17.number2;

public class MVCPattern {
    public static void main(String[] args) {
        Worker model = DataBase();
        View view = new View();
        Controller controller = new Controller(model, view);
        controller.updateView();
        controller.setWorkerHours(40);
        controller.updateView();
    }

    static public Worker DataBase(){
        Worker worker = new Worker();
        worker.setName("John");
        worker.setId("12a123");
        worker.setHours(15);
        return worker;
    }
}
