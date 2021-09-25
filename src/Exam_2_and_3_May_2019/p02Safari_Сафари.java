package Exam_2_and_3_May_2019;

import java.util.Scanner;

public class p02Safari_Сафари {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        double fuel = Double.parseDouble(scanner.nextLine());
        String day = scanner.nextLine();
        double fuelPrice = fuel * 2.10;
        double gid = 100;
        double totalPrice = fuelPrice + gid;

        if (day.equals("Saturday")) {
            totalPrice = totalPrice * 0.90;
        } else if (day.equals("Sunday")) {
            totalPrice = totalPrice * 0.80;
        }

        double result = Math.abs(totalPrice - budget);

        if (totalPrice <= budget) {
            System.out.printf("Safari time! Money left: %.2f lv.", result);
        } else {

            System.out.printf("Not enough money! Money needed: %.2f lv.", result);
        }

    }
}