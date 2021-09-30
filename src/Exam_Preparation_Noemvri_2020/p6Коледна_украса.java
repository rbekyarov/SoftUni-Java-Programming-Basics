package Exam_Preparation_Noemvri_2020;

import java.util.Scanner;

public class p6Коледна_украса {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());

        String command = scanner.nextLine();
        while (!command.equals("Stop")) {
            int itemPrice = 0;
            for (int i = 0; i < command.length(); i++) {
                itemPrice += command.charAt(i);
            }
            if (budget - itemPrice >= 0) {
                System.out.println("Item successfully purchased!");
                budget -= itemPrice;
            } else {
                System.out.println("Not enough money!");
                budget -= itemPrice;
                break;
            }

            command = scanner.nextLine();
        }
        if (budget > 0) {
            System.out.printf("Money left: %d", budget);
        }
    }
}
