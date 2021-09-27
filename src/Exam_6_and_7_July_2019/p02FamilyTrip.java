package EXAM.Exam_6_and_7_July_2019;

import java.util.Scanner;

public class p02FamilyTrip {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double budjet = Double.parseDouble(scanner.nextLine());
        int noshtuvki = Integer.parseInt(scanner.nextLine());
        double cenanoshtuvka = Double.parseDouble(scanner.nextLine());
        int dopulnitelniRazhodi = Integer.parseInt(scanner.nextLine());

        if (noshtuvki>7){
            cenanoshtuvka = cenanoshtuvka-0.05*cenanoshtuvka;
        }
        double totalnoshtuvki = cenanoshtuvka*noshtuvki;
        double totaldoprazhodi = budjet*dopulnitelniRazhodi/100;
        double total = totaldoprazhodi+totalnoshtuvki;
        double razlika = Math.abs(budjet-total);

        if (budjet>=total){
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.",razlika);
        }else {

            System.out.printf("%.2f leva needed.",razlika);
        }

    }
}
