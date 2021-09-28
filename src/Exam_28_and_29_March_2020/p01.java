package Exam_28_and_29_March_2020;

import java.util.Scanner;

public class p01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bitcoin = Integer.parseInt(scanner.nextLine());
        double kit = Double.parseDouble(scanner.nextLine());
        double komision = Double.parseDouble(scanner.nextLine());
        double dolari = kit*0.15;
        double dolari_lev = dolari*1.76;
       double leva = bitcoin*1168+dolari_lev;
       double evro = leva/1.95;

        double totalEvro = evro - evro*komision/100;
        System.out.printf("%.2f",totalEvro);




    }
}
