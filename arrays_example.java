package com.company;

public class Main {

    public static void main(String[] args) {

        int[] numbers = { 80, -90, 800, 136, -12};
        String[] names = {"Avi", "Michael", "Daniel", "Ben", "Yossi"};

        // for
        for (int i = 0; i < names.length; i++) {
            String item = names[i];
            System.out.println(item);
        }
        // foreach
        for (String name : names) {
            System.out.println(name);
        }

        int index = (int)(Math.random() * numbers.length);
        System.out.println(names[index]);
        System.out.println(numbers[index]);
        //                   0    1    2    3    4    5    6
        int[][] matrix = { { 1, 280, -90, 800, 136, -12},       // 0
                           {80, -90,   3,   4, 800, 136, -12}}; // 1
        //                       row   column
        System.out.println(matrix[0]   [0]);
        System.out.println(matrix[0][3]);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("[%d][%d] = %d", i, j, matrix[i][j]);
                System.out.println();
            }
        }
        // foreach on matrix
        for (int[] arr: matrix) {
            // arr = { 1, 280, -90, 800, 136, -12}
            // arr =  {80, -90,   3,   4, 800, 136, -12}
            for (int item: arr) {
                System.out.println(item);
            }
        }

        String[] names2 = {"Avi", "Michael", "Daniel", "Ben", "Yossi"};

        // for
        for (int i = 0; i < names2.length; i++) {
            String item = names2[i];
            System.out.println(item);
        }
        // foreach
        for (String name : names2) {
            System.out.println(name);
        }

    }
}
