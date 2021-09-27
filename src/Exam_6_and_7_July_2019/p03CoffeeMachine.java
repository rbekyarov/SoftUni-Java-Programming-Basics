package Exam_6_and_7_July_2019;

import java.util.Scanner;

public class p03CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double price = 0;
        String napitka = scanner.nextLine();
        String zahar = scanner.nextLine();
        int broiNapitki = Integer.parseInt(scanner.nextLine());
        if (napitka.equals("Espresso")) {
            if (zahar.equals("Without")) {
                price = 0.9 * broiNapitki;
                price = price - price * 0.35;
                if (broiNapitki >= 5) {
                    price = price - price * 0.25;
                }
            } else if (zahar.equals("Normal")) {
                price = 1.0 * broiNapitki;
                if (broiNapitki >= 5) {
                    price = price - price * 0.25;
                }
            } else if (zahar.equals("Extra")) {
                price = 1.2 * broiNapitki;
                if (broiNapitki >= 5) {
                    price = price - price * 0.25;
                }
            }
        }
        if (napitka.equals("Cappuccino")) {
            if (zahar.equals("Without")) {
                price = 1.0 * broiNapitki;
                price = price - price * 0.35;
            } else if (zahar.equals("Normal")) {
                price = 1.2 * broiNapitki;
            } else if (zahar.equals("Extra")) {
                price = 1.6 * broiNapitki;
            }
        }
        if (napitka.equals("Tea")) {
            if (zahar.equals("Without")) {
                price = 0.5 * broiNapitki;
                price = price - price * 0.35;
            } else if (zahar.equals("Normal")) {
                price = 0.6 * broiNapitki;
            } else if (zahar.equals("Extra")) {
                price = 0.7 * broiNapitki;
            }
        }
        if (price > 15) {
            price = price - price * 0.20;
        }
        System.out.printf("You bought %s cups of %s for %.2f lv.", broiNapitki, napitka, price);

    }
}
