package EXAM.Exam_6_and_7_July_2019;

import java.util.Scanner;

public class p04Clubzzzzzzzzzzzzzzzzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double target = Double.parseDouble(scanner.nextLine());
        int priceWord = 0;
        double income = 0;
        double balance = 0;
        int broi = 0;
        String command = "";
        while (true) {
            command = scanner.nextLine();
            if (!(command.equals("Party!"))) {
                priceWord = command.length();

                broi = Integer.parseInt(scanner.nextLine());
                income = priceWord * broi;
                if (!(priceWord % 2 == 0)) {
                    income -= income * 0.25;
                }
                income += income;
                if (income >= target) {
                    System.out.println("Target acquired.");
                    System.out.printf("Club income - %.2f leva.", income);

                }else {
                    break;
                }

            } else {
                break;
            }
        }
        balance = target - income;


        System.out.printf("We need %.2f leva more.\n", balance);
        System.out.printf("Club income - %.2f leva.", income);


    }
}