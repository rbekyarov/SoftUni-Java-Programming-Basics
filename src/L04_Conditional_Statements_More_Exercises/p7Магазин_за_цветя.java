package L04_Conditional_Statements_More_Exercises;

import java.util.Scanner;

public class p7Магазин_за_цветя {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int brMagnol = Integer.parseInt(scanner.nextLine());
        int brZumb = Integer.parseInt(scanner.nextLine());
        int brRozi = Integer.parseInt(scanner.nextLine());
        int brKaktusi = Integer.parseInt(scanner.nextLine());
        double priceGift = Double.parseDouble(scanner.nextLine());
        double priceMagnol = brMagnol * 3.25;
        double priceZumb = brZumb * 4.0;
        double priceRozi = brRozi * 3.5;
        double priceKaktusi = brKaktusi * 8.0;
        double price = priceMagnol + priceZumb + priceRozi + priceKaktusi;
        double priceTotal = price - price * 0.05;
        double deff = Math.abs(priceTotal - priceGift);

        if (priceTotal >= priceGift) {
            System.out.printf("She is left with %.0f leva.", Math.floor(deff));
        } else {
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(deff));
        }
    }
}
