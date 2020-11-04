package Tarasevich.Tasks.jd01_02;

import java.util.Scanner;

public class TaskA {
/*
start second task before practics with massives
 */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        step1(arr);
        step2(arr);
        step3(arr);


    }

    static void step1(int[] arr) {
        int max = 1;
        int min = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (max < arr[i]) {
                max = arr[i];
            } else if (min >= arr[i])
                min = arr[i];

        }
        System.out.println("max =" + max + " min =" + min);

    }

    static void step2(int[] arr) {
        double Arifmetic;
        double sum = 0;
        for (int element : arr) {
            sum = sum + element;
        }
        Arifmetic = sum / arr.length;

        for (int element : arr)
            if (element < Arifmetic) {
                System.out.print("Element " + element + " ");
            }
        System.out.println(Arifmetic);
    }

    static void step3(int[] arr) {

        int min = arr[0];


        for (int element : arr) {
            if (min > element) {
                min = element;
            }

            for (int i = arr.length - 1; i >= 0; i--) {
                if (arr[i] == min) {
                    System.out.println("element number -" + i);
                }

            }
        }
    }
}
