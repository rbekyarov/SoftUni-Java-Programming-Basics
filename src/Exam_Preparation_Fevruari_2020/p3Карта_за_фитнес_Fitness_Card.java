package Exam_Preparation_Fevruari_2020;

import java.util.Scanner;

public class p3Карта_за_фитнес_Fitness_Card {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double suma = Double.parseDouble(scanner.nextLine());
        String pol = scanner.nextLine();
        int years = Integer.parseInt(scanner.nextLine());
        String sport = scanner.nextLine();
        double price = 0;
        if (pol.equals("m")) {
            if (sport.equals("Gym")) {
                price = 42;
            } else if (sport.equals("Boxing")) {
                price = 41;
            } else if (sport.equals("Yoga")) {
                price = 45;
            } else if (sport.equals("Zumba")) {
                price = 34;
            } else if (sport.equals("Dances")) {
                price = 51;
            } else if (sport.equals("Pilates")) {
                price = 39;
            }
        }
        if (pol.equals("f")) {
            if (sport.equals("Gym")) {
                price = 35;
            } else if (sport.equals("Boxing")) {
                price = 37;
            } else if (sport.equals("Yoga")) {
                price = 42;
            } else if (sport.equals("Zumba")) {
                price = 31;
            } else if (sport.equals("Dances")) {
                price = 53;
            } else if (sport.equals("Pilates")) {
                price = 37;
            }
        }
        if (years <= 19) {
            price = price - price * 0.2;
        }

        if (suma >= price) {
            System.out.printf("You purchased a 1 month pass for %s.", sport);
        } else {
            System.out.printf("You don't have enough money! You need $%.2f more.", price - suma );
        }


    }

}
