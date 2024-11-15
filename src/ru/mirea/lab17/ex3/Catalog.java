package ru.mirea.lab17.ex3;

public class Catalog {
    private Node head;
    public void addNode(){
        Node node = new Node();
        node.readAt();

        if (head == null){
            head = node;
            node.next = head;
        }else{
            Node now = head;
            while (now.next != head){
                now = now.next;
            }
            now.next = node;
            node.next = head;
        }
    }
    public void printC(){
        if (head == null) {
            System.out.println("Список пуст.");
            return;
        }
        Node now = head;
        do {
            now.printAt(); // Выводим атрибуты узла
            System.out.println(); // Отделяем записи
            now = now.next; // Переходим к следующему элементу
        } while (now != head);

    }
}
