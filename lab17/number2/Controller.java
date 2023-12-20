package lab17.number2;

public class Controller {
    private Worker model;
    private View view;

    public Controller(Worker model, View view) {
        this.model = model;
        this.view = view;
    }

    public String getWorkerName(){
        return model.getName();
    }

    public String getWorkerId(){
        return model.getId();
    }

    public int getWorkerHours(){
        return model.getHours();
    }

    public void setWorkerName(String name){
        model.setName(name);
    }

    public void setWorkerId(String id){
        model.setId(id);
    }

    public void setWorkerHours(int hours){
        model.setHours(hours);
    }

    public void updateView(){
        view.print(model.getName(), model.getId(), model.getHours());
    }
}
