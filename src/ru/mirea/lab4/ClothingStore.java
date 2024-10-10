package ru.mirea.lab4;

enum Size {
    XXS(32, "Детский размер"),
    XS(34, "Взрослый размер"),
    S(36, "Взрослый размер"),
    M(38, "Взрослый размер"),
    L(40, "Взрослый размер");

    private int euroSize;
    private String desc;
    Size(int euroSize, String desc) {
        this.euroSize = euroSize;
        this.desc = desc;

    }
    public int getEuroSize() {
        return euroSize;
    }
    public String getDesc() {
        return desc;
    }
}

interface MenClothing {
    void dressMan();
}
interface WomenClothing {
    void dressWomen();
}

class MensClothing implements MenClothing {
    private Size size;

    public MensClothing(Size size) {
            this.size = size;
        }

    @Override
    public void dressMan() {
        System.out.println("Одеваем мужчину в размер: " + size + " (" + size.getEuroSize() + ")");
    }
}


class WomensClothing implements WomenClothing {
    private Size size;
    public WomensClothing(Size size) {
            this.size = size;
    }
    @Override
    public void dressWomen() {
        System.out.println("Одеваем женщину в размер: " + size + " (" + size.getEuroSize() + ")");
    }
}

public class ClothingStore {
    public static void main(String[] args) {
        MensClothing manClothing = new MensClothing(Size.M);
        manClothing.dressMan();
        System.out.println("Описание размера XXS: " +Size.M.getDesc());
        WomensClothing womanClothing = new WomensClothing(Size.XXS);
        womanClothing.dressWomen();
        System.out.println("Описание размера M: " + Size.XXS.getDesc());
    }
}
