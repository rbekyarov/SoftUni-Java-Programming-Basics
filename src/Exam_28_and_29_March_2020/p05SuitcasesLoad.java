/*
Изпит по "Основи на програмирането" - 28 и 29 март 2020

        Задача 5. Товарене на багажи
        Напишете програма, която ви помага при товаренето на куфари в багажника на самолет.
        Всеки самолет има определен капацитет на багажника. До получаване на команда "End" ще получавате обем на куфар.
        Обемът на всеки трети куфар трябва да се увеличава с 10%, поради загубата на пространство при начина на подреждане.
        Ако свободното пространството в даден момент е по-малко от обема на куфар товаренето трябва да прекъсне.
        Вход
        Първоначално се чете един ред:
        •	Капацитетът на багажника – реално число в диапазона [100.0…6000.0]
        След това до получаване на команда "End" или до запълване на багажника, се чете по един ред:
        o	Обем на куфар – реално число в диапазона [100.0…6000.0]
        Изход
        На конзолата да се отпечатат следните редове според случая:
        •	При получаване на командата "End" се печата:
        "Congratulations! All suitcases are loaded!"
        •	Ако обемът на куфара е по-голям от оставащото пространство в багажника:
        "No more space!"
        •	Накрая винаги се отпечатва статистика – колко багажа са натоварени:
        "Statistic: {брой натоварени багажи} suitcases loaded."
*/
package Exam_28_and_29_March_2020;

import java.util.Scanner;

public class p05SuitcasesLoad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double volume = Double.parseDouble(scanner.nextLine());
        double volumeBaggage = 0;
        double totalVolume = 0;
        int counter = 0;
        String command = "";
        while (true) {
            command = scanner.nextLine();
            if (!command.equals("End")) {
                volumeBaggage = Double.parseDouble(command);
                totalVolume += volumeBaggage;
                counter++;
            }
            if (counter % 3 == 0) {
                totalVolume = totalVolume + volumeBaggage * 0.1;

            }
            if (command.equals("End")) {
                System.out.println("Congratulations! All suitcases are loaded!");
                System.out.println("Statistic: " + counter + " suitcases loaded.");
                break;
            }
            if (totalVolume > volume) {
                counter -= 1;
                System.out.println("No more space!");
                System.out.println("Statistic: " + counter + " suitcases loaded.");
                break;
            }

        }
    }
}