package Exam_6_and_7_April_2019;

import java.util.Scanner;

public class p02GodzillavsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budjet = Double.parseDouble(scanner.nextLine());
        int broiStatist = Integer.parseInt(scanner.nextLine());
        double cenaObleklo = Double.parseDouble(scanner.nextLine());
        double totalobleklo = broiStatist * cenaObleklo;
        double dekor = budjet * 0.1;
        if (broiStatist > 150) {
            totalobleklo = totalobleklo - totalobleklo * 0.1;
        }
        double razhodi = totalobleklo + dekor;
        double razlika = budjet - razhodi;
        if (razhodi > budjet) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", Math.abs(razlika));
        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", Math.abs(razlika));
        }
    }
}
