package Exam_2_and_3_May_2019;

import java.util.Scanner;

public class p04Tourist_Shop_Туристически_магазин {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double budget = Double.parseDouble(scanner.nextLine());
        int itemCount = 0;
        double itemTotalPrice = 0;

        String command = scanner.nextLine();
        while (!command.equals("Stop")) {
            double itemPrice = Double.parseDouble(scanner.nextLine());
            itemCount = itemCount + 1;
            if (itemCount % 3 == 0) {
                itemTotalPrice = itemTotalPrice + itemPrice / 2;
            } else {
                itemTotalPrice = itemTotalPrice + itemPrice;
            }

            if (itemTotalPrice > budget) {
                break;
            }command = scanner.nextLine();
        }


        if (itemTotalPrice > budget) {
            System.out.println("You don't have enough money!");
            System.out.printf("You need %.2f leva!", itemTotalPrice - budget);
        } else {
            System.out.printf("You bought %d products for %.2f leva.", itemCount, itemTotalPrice);
        }

    }
}
