package Exam_6_and_7_April_2019;

import java.util.Scanner;

public class p04CinemaVoucher_Char_Vajna {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int voucher = Integer.parseInt(scanner.nextLine());

        int price = 0;
        int ticket = 0;
        int otherProduct = 0;

        String product = scanner.nextLine();

        while (!product.equals("End")) {
            if (product.length() > 8) {
                price = product.charAt(0) + product.charAt(1);

                if (voucher >= price) {
                    voucher -= price;
                } else {
                    break;
                }

                ticket++;
            } else {
                price = product.charAt(0);

                if (voucher >= price) {
                    voucher -= price;
                } else {
                    break;
                }

                otherProduct++;
            }

            product = scanner.nextLine();
        }

        System.out.println(ticket);
        System.out.println(otherProduct);

    }
}


