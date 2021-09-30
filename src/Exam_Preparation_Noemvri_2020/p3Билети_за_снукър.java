package Exam_Preparation_Noemvri_2020;

import java.util.Scanner;

public class p3Билети_за_снукър {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stage = scanner.nextLine();
        String type = scanner.nextLine();
        int numTickets = Integer.parseInt(scanner.nextLine());
        String picture = scanner.nextLine();
        double unitPrice = 0.0;

        if (stage.equals("Quarter final")) {
            switch (type) {
                case "Standard":
                    unitPrice = 55.50;
                    break;
                case "Premium":
                    unitPrice = 105.20;
                    break;
                case "VIP":
                    unitPrice = 118.90;
                    break;
            }
        } else if (stage.equals("Semi final")) {
            switch (type) {
                case "Standard":
                    unitPrice = 75.88;
                    break;
                case "Premium":
                    unitPrice = 125.22;
                    break;
                case "VIP":
                    unitPrice = 300.40;
                    break;
            }
        } else if (stage.equals("Final")) {
            switch (type) {
                case "Standard":
                    unitPrice = 110.10;
                    break;
                case "Premium":
                    unitPrice = 160.66;
                    break;
                case "VIP":
                    unitPrice = 400.0;
                    break;
            }
        }

        double price = numTickets * unitPrice;

        if (price > 4000) {
            price *= 0.75;
            System.out.printf("%.2f", price);
            return;
        } else if (price > 2500) {
            price *= 0.90;
        }

        if (picture.equals("Y")) {
            price += (numTickets * 40.0);
            System.out.printf("%.2f", price);
        }

    }
}
