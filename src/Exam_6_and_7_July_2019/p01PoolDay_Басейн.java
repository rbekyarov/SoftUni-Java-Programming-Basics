package Exam_6_and_7_July_2019;

import java.util.Scanner;

public class p01PoolDay_Басейн {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int broihora = Integer.parseInt(scanner.nextLine());
         double taxprise = Double.parseDouble(scanner.nextLine());
         double shezlongprice = Double.parseDouble(scanner.nextLine());
         double chadurprice = Double.parseDouble(scanner.nextLine());
         double razhoditax = taxprise*broihora;
         double broishezlongi = Math.ceil(broihora*0.75);
         double razhodshezlongi = broishezlongi*shezlongprice;
         double broicaduri = Math.ceil(broihora*0.5);
         double razhodchaduri = broicaduri*chadurprice;
         double razhodiTotal =razhodchaduri+razhoditax+razhodshezlongi;

        System.out.printf("%.2f lv.", razhodiTotal );

    }
}
