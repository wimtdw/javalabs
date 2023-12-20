package lab4.num2;


public class TShirt extends Clothes implements MenClothing, WomenClothing {
    public TShirt(ClothingSize size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчина одет в футболку.");
    }

    @Override
    public void dressWoman() {
        System.out.println("Женщина одета в футболку.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Футболка: Размер - " + getSize() + ", Цена - " + getCost() + ", Цвет - " + getColor());
    }
}
