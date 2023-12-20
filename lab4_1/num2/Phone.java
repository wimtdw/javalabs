package lab4_1.num2;

public class Phone {
    public String number;
    public String model;
    public double weight;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this(number, model, 0.0);
    }

    public Phone() {
        this("", "");
    }

    public String getNumber() {
        return number;
    }

    public void receiveCall(String callerName) {
        System.out.println("Звонит " + callerName);
    }

    public void receiveCall(String callerName, String callerNumber) {
        System.out.println("Звонит " + callerName + ", номер: " + callerNumber);
    }

    public void sendMessage(String... phoneNumbers) {
        System.out.println("Отправка сообщения на следующие номера:");
        for (String phoneNumber : phoneNumbers) {
            System.out.println(phoneNumber);
        }
    }
}

