package L03Conditional_Statements_Advanced;

import java.util.Scanner;

public class p5Ваканция {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String accommodation = "";
        String place = "";
        double price = 0;

        if (budget <= 1000) {
            accommodation = "Camp";
            if (season.equals("Summer")) {
                place = "Alaska";
                price = budget * 0.65;
            }
            if (season.equals("Winter")) {
                place = "Morocco";
                price = budget * 0.45;
            }

        } else if (budget > 1000 && budget <= 3000) {
            accommodation = "Hut";
            if (season.equals("Summer")) {
                place = "Alaska";
                price = budget * 0.80;
            }
            if (season.equals("Winter")) {
                place = "Morocco";
                price = budget * 0.60;
            }

        } else if (budget > 3000) {
            accommodation = "Hotel";
            if (season.equals("Summer")) {
                place = "Alaska";
                price = budget * 0.90;
            }
            if (season.equals("Winter")) {
                place = "Morocco";
                price = budget * 0.90;
            }
        }


        System.out.printf("%s - %s - %.2f", place, accommodation,price);

    }
}
