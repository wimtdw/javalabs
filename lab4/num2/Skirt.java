package lab4.num2;

public class Skirt extends Clothes implements WomenClothing {
    public Skirt(ClothingSize size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressWoman() {
        System.out.println("Женщина одета в юбку.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Юбка: Размер - " + getSize() + ", Цена - " + getCost() + ", Цвет - " + getColor());
    }
}


