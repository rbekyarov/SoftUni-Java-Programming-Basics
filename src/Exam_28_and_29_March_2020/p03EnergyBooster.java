package Exam_28_and_29_March_2020;

import java.util.Scanner;

public class p03EnergyBooster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String plod = scanner.nextLine();
        String size = scanner.nextLine();
        int broiSetove = Integer.parseInt(scanner.nextLine());
        double price = 0;

        if (size.equals("small")) {
            if (plod.equals("Watermelon")) {
                price = 2 * 56 * broiSetove;
            } else if (plod.equals("Mango")) {
                price = 2 * 36.66 * broiSetove;
            } else if (plod.equals("Pineapple")) {
                price = 2 * 42.10 * broiSetove;
            } else if (plod.equals("Raspberry")) {
                price = 2 * 20 * broiSetove;
            }
        }
        if (size.equals("big")) {
            if (plod.equals("Watermelon")) {
                price = 5 * 28.70 * broiSetove;
            } else if (plod.equals("Mango")) {
                price = 5 * 19.60 * broiSetove;
            } else if (plod.equals("Pineapple")) {
                price = 5 * 24.80 * broiSetove;
            } else if (plod.equals("Raspberry")) {
                price = 5 * 15.20 * broiSetove;
            }
        }
        if (price >= 400 && price <= 1000) {
            price = price - price * 0.15;
        } else if (price > 1000) {
            price = price - price * 0.5;
        }
        System.out.printf("%.2f lv.", price);
    }
}
