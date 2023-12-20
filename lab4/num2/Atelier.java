package lab4.num2;

public class Atelier {
    public void dressWomen(Clothes[] clothes) {
        System.out.println("Женская одежда:");
        for (Clothes item : clothes) {
            if (item instanceof WomenClothing) {
                WomenClothing womenClothing = (WomenClothing) item;
                womenClothing.dressWoman();
                item.displayInfo();
                System.out.println();
            }
        }
    }

    public void dressMan(Clothes[] clothes) {
        System.out.println("Мужская одежда:");
        for (Clothes item : clothes) {
            if (item instanceof MenClothing) {
                MenClothing menClothing = (MenClothing) item;
                menClothing.dressMan();
                item.displayInfo();
                System.out.println();
            }
        }
    }
}

