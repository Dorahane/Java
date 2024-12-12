package ru.mirea.lab29;

import java.util.Scanner;

public class RoadCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        if (N < 0 || N > 100) {
            System.out.println(0);
            return;
        }
        int[][] roads = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                roads[i][j] = scanner.nextInt();
            }
        }
        int roadCount = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (roads[i][j] == 1) {
                    roadCount++;
                }
            }
        }
        System.out.println(roadCount);
        scanner.close();
    }
}