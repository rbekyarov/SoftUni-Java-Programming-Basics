package Exam_2_and_3_May_2019;

import java.util.Scanner;

public class p03Mobile_operator_Мобилен_оператор {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String contractDuration = scanner.nextLine();
        String contractType = scanner.nextLine();
        String internet = scanner.nextLine();
        int taxesForMonth = Integer.parseInt(scanner.nextLine());

        double price = 0.0;

        if (contractDuration.equals("one") && internet.equals("yes")) {
            if (contractType.equals("Small")) {
                price = (9.98 + 5.50) * taxesForMonth;
            } else if (contractType.equals("Middle")) {
                price = (18.99 + 4.35) * taxesForMonth;
            } else if (contractType.equals("Large")) {
                price = (25.98 + 4.35) * taxesForMonth;
            } else if (contractType.equals("ExtraLarge")) {
                price = (35.99 + 3.85) * taxesForMonth;
            }
            System.out.printf("%.2f lv.", price);
        } else if (contractDuration.equals("one") && internet.equals("no")) {
            if (contractType.equals("Small")) {
                price = 9.98 * taxesForMonth;
            } else if (contractType.equals("Middle")) {
                price = 18.99 * taxesForMonth;
            } else if (contractType.equals("Large")) {
                price = 25.98 * taxesForMonth;
            } else if (contractType.equals("ExtraLarge")) {
                price = 35.99 * taxesForMonth;
            }
            System.out.printf("%.2f lv.", price);
        }
        if (contractDuration.equals("two") && internet.equals("yes")) {
            if (contractType.equals("Small")) {
                price = (8.58 + 5.50) * taxesForMonth;
            } else if (contractType.equals("Middle")) {
                price = (17.09 + 4.35) * taxesForMonth;
            } else if (contractType.equals("Large")) {
                price = (23.59 + 4.35) * taxesForMonth;
            } else if (contractType.equals("ExtraLarge")) {
                price = (31.79 + 3.85) * taxesForMonth;
            }
            price = price - price * 0.0375;
            System.out.printf("%.2f lv.", price);
        } else if (contractDuration.equals("two") && internet.equals("no")) {
            if (contractType.equals("Small")) {
                price = 8.58 * taxesForMonth;
            } else if (contractType.equals("Middle")) {
                price = 17.09 * taxesForMonth;
            } else if (contractType.equals("Large")) {
                price = 23.59 * taxesForMonth;
            } else if (contractType.equals("ExtraLarge")) {
                price = 31.79 * taxesForMonth;
            }
            price = price - price * 0.0375;
            System.out.printf("%.2f lv.", price);
        }
    }
}

