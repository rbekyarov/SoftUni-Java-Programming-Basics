package L03_Conditional_Statements_Advanced;

import java.util.Scanner;

public class p3Магазин_за_цветя {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numChrysanthemums = Integer.parseInt(scanner.nextLine());
        int numRoses = Integer.parseInt(scanner.nextLine());
        int numTulips = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String holiday = scanner.nextLine();
        double priceChrysanthemums = 0;
        double priceRoses = 0;
        double priceTulips = 0;
        double price = 0;
        int totalPrice = numChrysanthemums + numRoses + numTulips;
        if (season.equals("Spring") || (season.equals("Summer"))) {
            priceChrysanthemums = numChrysanthemums * 2.0;
            priceRoses = numRoses * 4.10;
            priceTulips = numTulips * 2.50;
            price = priceChrysanthemums + priceRoses + priceTulips;
            if (numTulips > 7 && season.equals("Spring")) {
                price = price - price * 0.05;
            }
            if (holiday.equals("Y")) {
                price = price + price * 0.15;
            }
        }
        if (season.equals("Autumn") || (season.equals("Winter"))) {
            priceChrysanthemums = numChrysanthemums * 3.75;
            priceRoses = numRoses * 4.50;
            priceTulips = numTulips * 4.15;
            price = priceChrysanthemums + priceRoses + priceTulips;
            if (numRoses >= 10 && season.equals("Winter")) {
                price = price - price * 0.10;
            }
            if (holiday.equals("Y")) {
                price = price + price * 0.15;
            }
        }
        if (totalPrice > 20) {
            price = price - price * 0.2;
        }
        price = price + 2;
        System.out.printf("%.2f", price);
    }
}