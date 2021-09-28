package Exam_28_and_29_March_2020;

import java.util.Scanner;

public class p02CatWalking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minutes = Integer.parseInt(scanner.nextLine());
        int trainer = Integer.parseInt(scanner.nextLine());
        int calls = Integer.parseInt(scanner.nextLine());
        int minutesTotal = minutes * trainer;
        int callBurn = minutesTotal * 5;
        double callPercent = 1.0*calls - calls * 0.5;
        if (callBurn >= callPercent) {
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.", callBurn);
        } else  {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.", callBurn);
        }

    }
}
