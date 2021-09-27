package EXAM.Exam_6_and_7_July_2019;

import java.util.Scanner;

public class p04Club {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pechalba = Double.parseDouble(scanner.nextLine());
        int priceWord = 0;
        double prihodi = 0;
        double razlika = 0;
        int broi = 0;
        String command = "";
        while (true) {
            command = scanner.nextLine();
            if (!(command.equals("Party!"))) {
                priceWord = command.length();

                broi = Integer.parseInt(scanner.nextLine());
                prihodi = priceWord * broi;
                if (!(priceWord % 2 == 0)) {
                    prihodi -= prihodi * 0.25;
                } prihodi+=prihodi;
                razlika = pechalba - prihodi;

            }else if (prihodi >= pechalba) {
                System.out.println("Target acquired.");
                System.out.printf("Club income - %.2f leva.", prihodi);
                break;
            }else {
                System.out.printf("We need %.2f leva more.\n", razlika);
                System.out.printf("Club income - %.2f leva.", prihodi);
                break;
            }
        }

    }
}