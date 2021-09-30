package Exam_Preparation_Noemvri_2020;

import java.util.Scanner;

public class p4Ергенско_Парти {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int targetSum = Integer.parseInt(scanner.nextLine());

        double totalPrice = 0;
        int counterGests = 0;
        String input = scanner.nextLine();
        while (!input.equals("The restaurant is full")) {
            int group = Integer.parseInt(input);
            int curentGroupPrice = 0;
            counterGests += group;
            if (group < 5) {
                curentGroupPrice = group * 100;
            } else {
                curentGroupPrice = group * 70;
            }
            totalPrice += curentGroupPrice;
            input = scanner.nextLine();
        }
        if (totalPrice >= targetSum) {
            double dif = totalPrice - targetSum;
            System.out.printf("You have %d guests and %.2f leva left.", counterGests, dif);
        } else {
            System.out.printf("You have %d guests and %.2f leva income, but no singer.", counterGests, totalPrice);
        }
    }
}

