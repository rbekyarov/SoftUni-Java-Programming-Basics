package Exam_Preparation_April_2021;

import java.util.Scanner;

public class p3Боядисване_на_яйца {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String size = scanner.nextLine();
        String color = scanner.nextLine();
        int numPartidi = Integer.parseInt(scanner.nextLine());

        double price = 0;
        if (size.equals("Large")) {
            if (color.equals("Red")) {
                price = 16;
            } else if (color.equals("Green")) {
                price = 12;
            } else if (color.equals("Yellow")) {
                price = 9;
            }
        }
        if (size.equals("Medium")) {
            if (color.equals("Red")) {
                price = 13;
            } else if (color.equals("Green")) {
                price = 9;
            } else if (color.equals("Yellow")) {
                price = 7;
            }
        }
        if (size.equals("Small")) {
            if (color.equals("Red")) {
                price = 9;
            } else if (color.equals("Green")) {
                price = 8;
            } else if (color.equals("Yellow")) {
                price = 5;
            }
        }

        double totalPrice = numPartidi * price;
        double razhodi = totalPrice * 0.35;
        double prihodi = totalPrice - razhodi;

        System.out.printf("%.2f leva.", prihodi);
    }
}
