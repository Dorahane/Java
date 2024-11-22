package lab20.ex1;

public class ex1<T, V, K> {
    private T first;
    private V second;
    private K third;

    public ex1(T first, V second, K third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public T getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    public K getThird() {
        return third;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(V second) {
        this.second = second;
    }

    public void setThird(K third) {
        this.third = third;
    }

    @Override
    public String toString() {
        return "GenericClass{" +
                "firstParam=" + first +
                ", secondParam=" + second +
                ", thirdParam=" + third +
                '}';
    }
}
