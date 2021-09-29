package Exam_Preparation_Fevruari_2020;

import java.util.Scanner;

public class p2Скоростно_изкачване_Mountain_Run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double secondsMeter = Double.parseDouble(scanner.nextLine());

        double climb = distance * secondsMeter;
        double slow = Math.floor(distance / 50) * 30;
        double total = climb + slow;

        if (record <= total) {
            total -= record;
            System.out.printf("No! He was %.2f seconds slower.", total);
        } else if (record > total) {
            slow = Math.floor(distance / 50) * 30;
            total = climb + slow;
            System.out.printf("Yes! The new record is %.2f seconds.", total);
        }
    }
}

