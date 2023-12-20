package lab4.num2;


public class Pants extends Clothes implements MenClothing, WomenClothing {
    public Pants(ClothingSize size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчина одет в штаны.");
    }

    @Override
    public void dressWoman() {
        System.out.println("Женщина одета в штаны.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Штаны: Размер - " + getSize() + ", Цена - " + getCost() + ", Цвет - " + getColor());
    }
}

