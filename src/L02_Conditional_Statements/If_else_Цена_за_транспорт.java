package Kurs5Проверки;

import java.util.Scanner;

//Задача: цена за транспорт
//Студент трябва да пропътува n километра. Той има избор измежду три вида транспорт:
//• Такси. Начална такса: 0.70 лв. Дневна тарифа: 0.79 лв./км. Нощна тарифа: 0.90 лв./км.
//• Автобус. Дневна / нощна тарифа: 0.09 лв./км. Може да се използва за разсто-яния минимум 20 км.
//• Влак. Дневна / нощна тарифа: 0.06 лв./км. Може да се използва за разсто-яния минимум 100 км.
//Напишете програма, която въвежда броя километри n и период от деня (ден или нощ) и изчислява цената на най-евтиния транспорт.
//Входни данни
//От конзолата се четат два реда:
//• Първият ред съдържа числото n – брой километри – цяло число в интервала [1 … 5000].
//• Вторият ред съдържа дума "day" или "night" – пътуване през деня или през нощта.
//Изходни данни
//Да се отпечата на конзолата най-ниската цена за посочения брой километри.
public class If_else_Цена_за_транспорт {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int distance = Integer.parseInt(scanner.nextLine());
        String DayOrNight = scanner.nextLine();

        double price;
        double taxiRate = 0;
        if (DayOrNight.equals("day")) {
            taxiRate = 0.70;
        } else if (DayOrNight.equals("night")) {
            taxiRate = 0.90;
        }
        if (distance < 20) {
            price = 0.7 + (distance * taxiRate);
        } else if (distance < 100) {
            price = 0.09 * distance;
        } else {
            price = 0.06 * distance;

        }
        System.out.println(price);
    }
}