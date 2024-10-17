package ru.mirea.lab6.ex4;

// почасовая ставка как цена
class Service implements Priceable {
    private String name;
    private double hourlyRate;
    private int hours;

    public Service(String name, double hourlyRate, int hours) {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hours = hours;
    }
    public double getPrice() {return hourlyRate*hours;}

    @Override
    public String toString() {
        return "Service{name='" + name + "', hourlyRate=" + hourlyRate + "hours = " + hours +'}';
    }
}
