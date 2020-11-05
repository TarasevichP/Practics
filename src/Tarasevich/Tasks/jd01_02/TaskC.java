package Tarasevich.Tasks.jd01_02;

import java.util.Scanner;

public class TaskC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        step1(n);
    }


    static void step1(int n) {
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = (int) (n - Math.random() * n - n);
                if (i == arr.length - 1) {
                    System.out.println();
                } else
                    System.out.print(arr[i][j] + " ");
                if (j == arr.length - 1 || i == arr.length - 1) {
                    System.out.println();
                }


            }
        }

    }
}
