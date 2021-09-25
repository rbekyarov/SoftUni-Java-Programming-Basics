package Exam_2_and_3_May_2019;

import java.util.Scanner;

public class p06Vet_Parking_Ветеринарен_паркинг {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());
        double total = 0;
//

        for (int i = 1; i < days; i++) {

            boolean day = false;
            boolean hour = false;
            double parking_price = 0;

            if (days % 2 == 0) {
                day = true;
            }


            if (hours % 2 == 0) {
                hour = true;
            }


            for (int j = 1; j < hours; j++) {


                if (days % 2 == 0 && hours % 2 != 0)
                    parking_price += 2.50;
                else if (days % 2 != 0 && hours % 2 == 0) {
                    parking_price += 1.25;
                } else {
                    parking_price += 1;
                }
            }
            total += parking_price;

            System.out.printf("Day: %s - %.2f leva\n",days,parking_price);


            System.out.printf("Total: %.2f leva",total);

        }
    }
}