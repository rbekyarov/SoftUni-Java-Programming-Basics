package Exam_28_and_29_March_2020;

import java.util.Scanner;

public class p01Учебни_материали {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double himikali = Double.parseDouble(scanner.nextLine());
        double markeri = Double.parseDouble(scanner.nextLine());
        double litur = Double.parseDouble(scanner.nextLine());
        double namalenie = Double.parseDouble(scanner.nextLine());
        double leva = himikali*5.8 + markeri*7.2 +litur*1.2;
        double totalLeva = leva - leva*namalenie/100;
        System.out.printf("%.3f",totalLeva);
    }
}
