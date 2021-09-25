package Exam_2_and_3_May_2019;

import java.util.Scanner;

public class p05Division_Without_Remainder_Делене_без_остатък {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        int count = 0;

        for (int i = 1; i <= n; i++) {
            int numb = Integer.parseInt(scanner.nextLine());
            count++;
            if (numb % 2 == 0) {
                p1++;
            }
            if (numb % 3 == 0) {

                p2++;
            }
            if (numb % 4 == 0) {

                p3++;
            }
        }

        double p1Percent = (p1 / count) * 100;
        double p2Percent = (p2 / count) * 100;
        double p3Percent = (p3 / count) * 100;

        System.out.printf("%.2f%%\n", p1Percent);
        System.out.printf("%.2f%%\n", p2Percent);
        System.out.printf("%.2f%%", p3Percent);

    }
}
