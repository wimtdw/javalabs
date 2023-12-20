package lab4.num2;

public class Main {
    public static void main(String[] args) {
        TShirt tShirt = new TShirt(ClothingSize.S, 20.0, "Красный");
        Pants pants = new Pants(ClothingSize.M, 30.0, "Синий");
        Skirt skirt = new Skirt(ClothingSize.XXS, 25.0, "Розовый");
        Tie tie = new Tie(ClothingSize.L, 15.0, "Черный");

        Clothes[] allClothes = {tShirt, pants, skirt, tie};

        Atelier atelier = new Atelier();
        atelier.dressWomen(allClothes);
        atelier.dressMan(allClothes);
    }
}

