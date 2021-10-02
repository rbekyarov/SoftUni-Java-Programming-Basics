/*
1.	Съдомиялна
        Гошо работи в ресторант и отговаря за зареждането на съдомиялната накрая на деня.
        Вашата задача е да напишете програма, която изчислява, дали дадено закупено количество бутилки от препарат за съдомиялна е достатъчно, за да измие определено количество съдове. Знае се, че всяка бутилка съдържа 750 мл. препарат, за 1 чиния са нужни 5 мл., а за тенджера 15 мл.  Приемете, че на всяко трето зареждане със съдове, съдомиялната се пълни само с тенджери, а останалите пъти с чинии. Докато не получите команда "End" ще продължите да получавате бройка съдове, които трябва да бъдат измити.
        Вход
        От конзолата се четат:
        •	Брой бутилки от препарат, който ще бъде използван за миенето на чинии - цяло число в интервала [1…10]
        На всеки следващ ред, до получаване на командата "End" или докато количеството препарат не се изчерпи, брой съдове, които трябва да бъдат измити - цяло число в интервала [1…100]
        Изход
        В случай, че количеството препарат е било достатъчно за измиването на съдовете:
        "Detergent was enough!"
        "{брой чисти чинии} dishes and {брой чисти тенджери} pots were washed."
        "Leftover detergent {количество останал препарат} ml."
        В случай, че количеството препарат не е било достатъчно за измиването на съдовете:
        "Not enough detergent, {количество не достигнал препарат} ml. more necessary!"
*/


        package While_Loop_More_Exercises;

import java.util.Scanner;

public class p1Съдомиялна {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bottles = Integer.parseInt(scanner.nextLine());
        int availableCleaner = 750 * bottles;
        int cleanerPlates = 0;
        int count = 0;
        int plates = 0;
        int numPlates = 0;
        int numPots = 0;
        int quantityPlates = 0;
        int quantityPots = 0;
        int totalCleaner = 0;
        int pots = 0;
        int cleanerPots = 0;
        String command = scanner.nextLine();

        while (!command.equals("End")) {
            count++;
            if (count % 3 != 0) {
                plates = Integer.parseInt(command);

                cleanerPlates = plates * 5;
                quantityPlates += cleanerPlates;
                numPlates += plates;
            } else  {
                pots = Integer.parseInt(command);
                cleanerPots = 15 * pots;
                numPots += pots;
                quantityPots += cleanerPots;
            }
            totalCleaner = quantityPlates + quantityPots;
            if (availableCleaner < totalCleaner) {
                break;
            }
            command = scanner.nextLine();
        }

        int diff = Math.abs(totalCleaner - availableCleaner);
        if (availableCleaner >= totalCleaner) {

            System.out.println("Detergent was enough!");
            System.out.printf("%d dishes and %d pots were washed.\n",numPlates,numPots);
            System.out.printf("Leftover detergent %d ml.",diff);
        } else {
            System.out.printf("Not enough detergent, %d ml. more necessary!",diff);
        }

    }
}
