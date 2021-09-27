package Exam_6_and_7_July_2019;

import java.util.Scanner;

public class p02Shopping_Пазаруване {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);


       double budjet= Double.parseDouble(scanner.nextLine());
       int vga = Integer.parseInt(scanner.nextLine());
       int cpu = Integer.parseInt(scanner.nextLine());
       int ram = Integer.parseInt(scanner.nextLine());

/*
•	Видеокарта – 250 лв./бр.
•	Процесор – 35% от цената на закупените видеокарти/бр.
•	Рам памет – 10% от цената на закупените видеокарти/бр.
*/
        double priceVga= 250;
        double priceCpu= 0.35*250*vga;
        double priceRam= 0.1*250*vga;
        double totalPriseVga = priceVga*vga;
        double totalPriseCpu = cpu*priceCpu;
        double totalPriseRam = priceRam*ram;

        double razhodi = totalPriseVga+totalPriseCpu+totalPriseRam;

        /*Ако броя на видеокартите е по-голям от този на процесорите получава 15% отстъпка от крайната сметка*/

        if (vga>cpu){
            razhodi = razhodi-razhodi*0.15;
        }
        double razlika = Math.abs(budjet-razhodi);

        if (budjet>=razhodi){
            System.out.printf("You have %.2f leva left!",razlika);
        }else {
            System.out.printf("Not enough money! You need %.2f leva more!",razlika);
        }
/*
•	Ако бюджета е достатъчен:
        "You have {остатъчен бюджет} leva left!"
•	Ако сумата надхвърля бюджета:
        "Not enough money! You need {нужна сума} leva more!"
*/




    }

}
