package Tarasevich.Tasks.jd01_01;

import java.util.Scanner;

public class TaskC2 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввод:");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println();
        System.out.println("Вывод:");
        int sum = a + b;

        System.out.println("DEC: " + a + "+"
                + b + "=" + sum);
        System.out.println("BIN: " + Integer.toBinaryString(a) + "+"
                + Integer.toBinaryString(b) + "=" + Integer.toBinaryString(sum));
        System.out.println("HEX: " + Integer.toHexString(a) +
                "+" + Integer.toHexString(b) + "=" + Integer.toHexString(sum));
        System.out.println("OKT: " + Integer.toOctalString(a) +
                "+" + Integer.toOctalString(b) + "=" + Integer.toOctalString(sum));

    }
}
