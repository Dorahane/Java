package ru.mirea.lab4.ex4;

public class Main {
    public static void main(String[] args) {
        Processor processor = new Processor("Intel", "Core i7", 3.5);
        Memory memory = new Memory("DDR4", 16);
        Monitor monitor = new Monitor("Dell", 24.0);

        Computer computer = new Computer(Brand.DELL, processor, memory, monitor);

        System.out.println(computer);
    }
}