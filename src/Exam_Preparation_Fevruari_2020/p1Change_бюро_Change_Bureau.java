package Exam_Preparation_Fevruari_2020;

import java.util.Scanner;

public class p1Change_бюро_Change_Bureau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bitcoin = Integer.parseInt(scanner.nextLine());
        int yuan = Integer.parseInt(scanner.nextLine());
        double commissions = Double.parseDouble(scanner.nextLine());

        commissions = commissions * 0.01;

        double euro = (yuan * 0.15 * 1.76 + bitcoin * 1168) / 1.95;
        double charge = euro * commissions;
        double result = euro - charge;

        System.out.printf("%.2f", result);
    }
}
