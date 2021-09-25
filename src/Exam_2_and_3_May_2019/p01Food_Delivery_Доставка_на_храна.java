package Exam_2_and_3_May_2019;

import java.util.Scanner;

public class p01Food_Delivery_Доставка_на_храна {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int broiChikens = Integer.parseInt(scanner.nextLine());
        int broiFishes = Integer.parseInt(scanner.nextLine());
        int broiVegiterian = Integer.parseInt(scanner.nextLine());
        double priceWithoutDesert = broiChikens * 10.35 + broiFishes * 12.40 + broiVegiterian * 8.15;
        double desrtPrice = priceWithoutDesert * 0.20;
        double total = priceWithoutDesert + desrtPrice + 2.50;

        System.out.printf("Total:%.2f ", total);
    }
}