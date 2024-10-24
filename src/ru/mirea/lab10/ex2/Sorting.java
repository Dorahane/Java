package ru.mirea.lab10.ex2;
import java.util.ArrayList;
import java.util.Scanner;

public class Sorting{
    private ArrayList<Student> studentsList;

    public Sorting() {
        studentsList = new ArrayList<>();
    }

    public void setArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество студентов: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Введите имя студента: ");
            String firstName = scanner.nextLine();
            System.out.print("Введите фамилию студента: ");
            String lastName = scanner.nextLine();
            System.out.print("Введите GPA студента: ");
            double gpa = scanner.nextDouble();
            scanner.nextLine();
            studentsList.add(new Student(firstName, lastName, gpa));
        }
    }

    // Метод сортировки по среднему баллу (GPA) с использованием быстрой сортировки
    public void quicksort(Comparator<Student> comparator) {
        studentsList.sort(comparator::compare);
    }

    // Метод сортировки слиянием
    public void mergeSort() {
        studentsList = mergeSort(studentsList);
    }

    private ArrayList<Student> mergeSort(ArrayList<Student> list) {
        if (list.size() <= 1) {
            return list;
        }

        int mid = list.size() / 2;
        ArrayList<Student> left = mergeSort(new ArrayList<>(list.subList(0, mid)));
        ArrayList<Student> right = mergeSort(new ArrayList<>(list.subList(mid, list.size())));

        return merge(left, right);
    }

    private ArrayList<Student> merge(ArrayList<Student> left, ArrayList<Student> right) {
        ArrayList<Student> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < left.size() && j < right.size()) {
            if (left.get(i).getGpa() >= right.get(j).getGpa()) {
                result.add(left.get(i));
                i++;
            } else {
                result.add(right.get(j));
                j++;
            }
        }

        while (i < left.size()) {
            result.add(left.get(i));
            i++;
        }

        while (j < right.size()) {
            result.add(right.get(j));
            j++;
        }

        return result;
    }

    // Метод для вывода массива студентов
    public void outArray() {
        for (Student student : studentsList) {
            System.out.println(student);
        }
    }
}
