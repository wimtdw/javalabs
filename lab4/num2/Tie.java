package lab4.num2;


public class Tie extends Clothes implements MenClothing {
    public Tie(ClothingSize size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчина одет в галстук.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Галстук: Размер - " + getSize() + ", Цена - " + getCost() + ", Цвет - " + getColor());
    }
}

