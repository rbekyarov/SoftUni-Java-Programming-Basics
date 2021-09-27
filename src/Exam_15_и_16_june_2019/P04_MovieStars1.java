package Exam_15_и_16_june_2019;

import java.util.Scanner;

public class P04_MovieStars1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budget = Double.parseDouble(scan.nextLine());

        String actorName = scan.nextLine();

        while (!"ACTION".equals(actorName)) {

            if (actorName.length() > 15) {
                budget -= budget * 0.2;
            } else {
                double salary = Double.parseDouble(scan.nextLine());
                budget -= salary;
            }

            if (budget < 0) {
                break;
            }

            actorName = scan.nextLine();
        }

        if ("ACTION".equals(actorName)) {
            System.out.printf("We are left with %.2f leva.", budget);
        } else {
            System.out.printf("We need %.2f leva for our actors.", Math.abs(budget));
        }
    }
}