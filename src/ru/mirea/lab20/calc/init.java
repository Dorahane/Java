package ru.mirea.lab20.calc;

public class init <K, T> {
    private K first;
    private T second;

    public init(K first, T second){
        this.first = first;
        this.second = second;
    }
    public K getFirst(){return first;}
    public T getSecond(){return second;}

    @Override
    public String toString() {
        return "firstParam = " + first +
                " , secondParam = " + second;
    }
}
