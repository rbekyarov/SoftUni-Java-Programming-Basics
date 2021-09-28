package Exam_28_and_29_March_2020;

import java.util.Scanner;

public class p04Трекингмания {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countGroup = Integer.parseInt(scanner.nextLine());
        double groupMusala = 0;
        double groupMonblan = 0;
        double groupKilimandjaro = 0;
        double groupK2 = 0;
        double groupEverest = 0;
        int countPeople = 0;
        int allPeopole = 0;

        for (int i = 1; i <= countGroup; i++) {
            countPeople = Integer.parseInt(scanner.nextLine());
            allPeopole += countPeople;
            if (countPeople <= 5) {
                groupMusala += countPeople;
            } else if (countPeople <= 12) {
                groupMonblan += countPeople;
            } else if (countPeople <= 25) {
                groupKilimandjaro += countPeople;
            } else if (countPeople <= 40) {
                groupK2 += countPeople;
            } else {
                groupEverest += countPeople;
            }
        }
        groupMusala = groupMusala / allPeopole * 100;
        groupMonblan = groupMonblan / allPeopole * 100;
        groupKilimandjaro = groupKilimandjaro / allPeopole * 100;
        groupK2 = groupK2 / allPeopole * 100;
        groupEverest = groupEverest / allPeopole * 100;
        System.out.printf("%.2f", groupMusala);
        System.out.println("%");
        System.out.printf("%.2f", groupMonblan);
        System.out.println("%");
        System.out.printf("%.2f", groupKilimandjaro);
        System.out.println("%");
        System.out.printf("%.2f", groupK2);
        System.out.println("%");
        System.out.printf("%.2f", groupEverest);
        System.out.println("%");


    }

}
