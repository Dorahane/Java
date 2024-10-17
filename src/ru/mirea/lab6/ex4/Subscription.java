package ru.mirea.lab6.ex4;

// месячная плата за подписку
class Subscription implements Priceable {
    private String name;
    private double monthlyFee;
    private int mounth;

    public Subscription(String name, double monthlyFee, int mounth) {
        this.name = name;
        this.monthlyFee = monthlyFee;
        this.mounth = mounth;
    }

    public double getPrice() {return monthlyFee * mounth;}

    @Override
    public String toString() {
        return "Subscription{name='" + name + "', monthlyFee=" + monthlyFee + "months=" + mounth + '}';
    }
}
