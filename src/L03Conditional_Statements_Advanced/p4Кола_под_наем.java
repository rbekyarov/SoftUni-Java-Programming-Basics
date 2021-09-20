package L03Conditional_Statements_Advanced;

import java.util.Scanner;

public class p4Кола_под_наем {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String clas = "";
        String type = "";
        double price = 0;

        if (budget <= 100) {
            clas = "Economy class";
            if (season.equals("Summer")) {
                type = "Cabrio";
                price = budget * 0.35;
            }
            if (season.equals("Winter")) {
                type = "Jeep";
                price = budget * 0.65;
            }

        } else if (budget > 100 && budget <= 500) {
            clas = "Compact class";
            if (season.equals("Summer")) {
                type = "Cabrio";
                price = budget * 0.45;
            }
            if (season.equals("Winter")) {
                type = "Jeep";
                price = budget * 0.80;
            }

        } else if (budget > 500) {
            clas = "Luxury class";
            type = "Jeep";
            price = budget * 0.90;
        }

        System.out.println(clas);
        System.out.printf("%s - %.2f", type, price);
    }
}
