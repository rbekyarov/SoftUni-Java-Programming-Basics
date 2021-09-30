package Exam_Preparation_Mart_2020;

import java.util.Scanner;

public class p2Лятно_пазаруване_Summer_Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        double towelPrice = Double.parseDouble(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

        double umbrella = 2 * towelPrice / 3;
        double slippers = umbrella * 0.75;
        double beachBag = 1 * (towelPrice + slippers) / 3;

        double totalSum = towelPrice + umbrella + slippers + beachBag;
        totalSum = totalSum - totalSum * 0.05;

        if (budget >= totalSum)
        {
            System.out.printf("Annie's sum is %.2f lv. She has %.2f lv. left.",totalSum,Math.abs(totalSum - budget));
        }
        else
        {
            System.out.printf("Annie's sum is %.2f lv. She needs %.2f lv. more.",totalSum,budget - totalSum);
        }
    }
    }

