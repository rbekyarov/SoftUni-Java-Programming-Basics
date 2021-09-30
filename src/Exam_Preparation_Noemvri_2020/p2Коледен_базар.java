package Exam_Preparation_Noemvri_2020;

import java.util.Scanner;

public class p2Коледен_базар {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double goal = Double.parseDouble(scanner.nextLine());
        int fantasy = Integer.parseInt(scanner.nextLine());
        int horror = Integer.parseInt(scanner.nextLine());
        int romantic = Integer.parseInt(scanner.nextLine());

        double sum = fantasy * 14.90 + horror * 9.80 + romantic * 4.30;
        double DDS = 0.2 * sum;
        double finalSum = sum - DDS;

        if (finalSum > goal) {
            double remain = finalSum - goal;
            double bonus = Math.floor(.1 * remain);
            double left = finalSum - bonus;
            System.out.printf("%.2f leva donated.%n", left);
            System.out.printf("Sellers will receive %.0f leva.", bonus);
        } else {
            double needed = goal - finalSum;
            System.out.printf("%.2f money needed.", needed);
        }
    }
}