package Exam_6_and_7_July_2019;

import java.util.Scanner;

public class p01Repainting {
    public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);
    int nailon = Integer.parseInt(scanner.nextLine());
    int boia  = Integer.parseInt(scanner.nextLine());
    int razreditel  = Integer.parseInt(scanner.nextLine());
    int chasove  = Integer.parseInt(scanner.nextLine());
    double priceNailon = 1.5;
    double priceBoia = 14.5;
    double priceRazreditel = 5;
    double razhodNailon = (nailon+2)*priceNailon;
    double razhodBoia = (boia+(0.1*boia))*priceBoia;
    double razhodRazreditel = razreditel*priceRazreditel;
    double razhodi = razhodNailon+razhodBoia+razhodRazreditel+0.4;
    double priceRabota =0.3*razhodi*chasove;
    double total = priceRabota+razhodi;
        System.out.printf("Total expenses: %.2f lv.",total);
    }

}
