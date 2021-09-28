package Exam_18_and_19_July_2020;

import java.util.Scanner;

public class p01AgencyProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String name = scanner.nextLine();
        int broiVuzrastni = Integer.parseInt(scanner.nextLine());
        int broiDetski = Integer.parseInt(scanner.nextLine());
        double cenaVuzrastni = Double.parseDouble(scanner.nextLine());
        double cenaObslujvane = Double.parseDouble(scanner.nextLine());
        double cenaDetski = cenaVuzrastni - cenaVuzrastni*0.7;
        /*Агенцията добавя към нетната цена на всеки билет такса обслужване.
        Крайната печалба на Агенцията е 20% от общата цена на всички билети.*/

        double sum = ((broiVuzrastni* cenaVuzrastni)+ (broiVuzrastni*cenaObslujvane)) +
                ((broiDetski*cenaDetski)+(broiDetski*cenaObslujvane));

        double pechalba = sum *0.2;

        System.out.printf("The profit of your agency from %s tickets is %.2f lv.", name,pechalba);
}
}
