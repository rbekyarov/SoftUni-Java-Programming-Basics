package L04_Conditional_Statements_More_Exercises;

import java.util.Scanner;

public class p5Фирма {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int hoursTarget = Integer.parseInt(scanner.nextLine());
        int dayHave = Integer.parseInt(scanner.nextLine());
        int employees = Integer.parseInt(scanner.nextLine());
        double hours = (dayHave - (dayHave * 0.1)) * 8;
        double extraDays = employees * 2 * dayHave;
        double totalHours = Math.floor(hours + extraDays);
        double difference = Math.abs(hoursTarget - totalHours);
        if (hoursTarget <= totalHours) {
            System.out.printf("Yes!%.0f hours left.", difference);
        } else {
            System.out.printf("Not enough time!%.0f hours needed.", difference);
        }

    }
}
