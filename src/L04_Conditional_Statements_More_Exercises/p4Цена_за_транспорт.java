package L04_Conditional_Statements_More_Exercises;

import java.util.Scanner;

public class p4Цена_за_транспорт {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int brKm = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        double price = 0;
        if (brKm < 20) {
            if (command.equals("day")) {
                price = 0.7 + 0.79 * brKm;
            } else {
                price = 0.7 + 0.90 * brKm;
            }
        }
        if (brKm >= 20) {
            price = brKm * 0.09;
        }
        if (brKm >= 100) {
            price = brKm * 0.06;
        }
        System.out.printf("%.2f", price);
    }
}
