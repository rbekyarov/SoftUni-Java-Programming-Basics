
/*
11.	Паркинг "Happy Cat"
        Деси трябва да заведе котката си на ветеринар в клиниката "Happy Cat", но паркингът се заплаща.
        Напишете програма, която пресмята колко общо трябва да се плати за престоя на колата на Деси на паркинга,
        за да заведе котката си на ветеринар. Паркингът е различен от останалите и има разнообразен ценоразпис.
        За всеки четен ден и нечетен час, паркингът таксува 2.50 лева.
        Във всеки нечетен ден и четен час таксата е 1.25 лева, във всички останали случаи се заплаща 1 лев.
        Таксуването става на всеки изминал час от деня. Всеки един от изходите трябва да бъде закръглен до втория знак
        след десетичната запетая.
        Вход
        От конзолата се четат два реда:
        •	Брой дни – цяло число в интервала [1 … 5]
        •	Брой часове за всеки един от дните - цяло число в интервала [1 … 24]
        Изход:
        Да се отпечата на конзолата:
        •	За всеки изминал ден, общата сума, която трябва да се плати – "Day: {индексът на деня} – {общата сума за деня} leva"
        •	Когато програмата приключи - "Total: {общата сума за всички дни} leva"
*/

package L08_More_Nested_Loops;

import java.util.Scanner;

public class p11Паркинг_Happy_Cat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());
        double priceDay = 0;
        double priceHour = 0;
        double totalPrice = 0;

        for (int i = 1; i <= days; i++) {
            priceDay = 0;
            for (int j = 1; j <= hours; j++) {
                if (i % 2 == 0 && j % 2 == 1) {
                    priceHour = 2.50;
                } else if (i % 2 == 1 && j % 2 == 0) {
                    priceHour = 1.25;
                } else {
                    priceHour = 1.00;
                }
                priceDay += priceHour;
                totalPrice+= priceHour;
            }
            System.out.printf("Day: %d - %.2f leva\n", i, priceDay);
        }

        System.out.printf("Total: %.2f leva", totalPrice);
    }
}
