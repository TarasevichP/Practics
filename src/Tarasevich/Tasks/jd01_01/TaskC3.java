package Tarasevich.Tasks.jd01_01;

import java.util.Scanner;

public class TaskC3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("weigth piple in Earth   ");
        int Piple_in_Earth = scanner.nextInt();

        double Piple_in_Mars = getWeigth(Piple_in_Earth);

        System.out.println();
        System.out.print("weigth piple in Mars   " + Piple_in_Mars);

    }

    private static double getWeigth(int Piple_in_Earth) {
        final double SPEED_IN_MARS = 3.71;
        final double SPEED_IN_EARTH = 9.81;
        double Piple_in_Mars = Piple_in_Earth / SPEED_IN_EARTH * SPEED_IN_MARS;
        double delta = Piple_in_Mars * 100 - (int) Piple_in_Mars * 100;
        if (delta < 0.5) {
            return (int)Piple_in_Mars * 100 / 100.0;
        }
        if (delta >= 0.5) {
            return (int)(Piple_in_Mars * 100 +1)/ 100.0;
        }
     return Piple_in_Mars;
    }
}
