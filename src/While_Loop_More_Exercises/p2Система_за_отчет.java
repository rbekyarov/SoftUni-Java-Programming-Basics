/*
2.	Система за отчет
        На благотворително събитие плащанията за закупените продукти винаги се редуват: плащане в брой и плащане с карта. Установени са следните правила за заплащане:
        •	Ако продуктът надвишава 100лв., за него не може да се плати в брой
        •	Ако продуктът е на цена под 10лв., за него не може да се плати с кредитна карта
        Програмата приключва или след като получим команда "End" или след като средствата бъдат събрани.
        Вход
        От конзолата се четат:
        •	Сумата, която се очаква да бъде събрана от продажбите - цяло число в интервала [1 ... 10000]
        На всеки следващ ред, до получаване на командата "End" или докато не се съберат нужните средства: цените на предметите, които ще бъдат закупени - цяло число в интервала [1 ... 500]
        Изход
        На конзолата да се отпечата:
        •	При успешна транзакция: "Product sold!"
        •	При неуспешна транзакция: "Error in transaction!"
        •	Ако сумата на всички закупени продукти надвиши или достигне очакваната сума, програмата трябва да приключи и на конзолата да се изпишат два реда:
        o	"Average CS: {средно плащане в кеш на човек}"
        o	"Average CC: {средно плащане с карта на човек}"
        Плащанията трябва да бъдат форматирани до втората цифра след десетичния знак.
        •	При получаване на команда "End", да се изпише един ред:
        o	"Failed to collect required money for charity."
*/


        package While_Loop_More_Exercises;

import java.util.Scanner;

public class p2Система_за_отчет {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int target = Integer.parseInt(scanner.nextLine());
        String message = "";
        int count = 0;
        int countCash = 0;
        int countCart = 0;
        int payment = 0;
        int moneyCash = 0;
        int moneyCart = 0;
        int moneyTotal = 0;
        double averageCash = 0;
        double averageCart = 0;

        String comand = scanner.nextLine();
        while (!comand.equals("End")) {
            count++;
            if (count % 2 != 0) {
                payment = Integer.parseInt(comand);

                if (payment <= 100) {
                    countCash++;
                    moneyCash += payment;
                    message = "Product sold!";
                    System.out.println(message);
                } else {
                    message = "Error in transaction!";
                    System.out.println(message);
                }

            } else {
                payment = Integer.parseInt(comand);

                if (payment > 10) {
                    countCart++;
                    moneyCart += payment;
                    message = "Product sold!";
                    System.out.println(message);
                } else {
                    message = "Error in transaction!";
                    System.out.println(message);
                }
            }
            moneyTotal = moneyCash + moneyCart;
            if (moneyTotal >= target) {
                break;
            }
            comand = scanner.nextLine();
        }
        averageCash = 1.0 * moneyCash / countCash;
        averageCart = 1.0 * moneyCart / countCart;
        if (comand.equals("End")) {
            System.out.println("Failed to collect required money for charity.");
        } else {
            System.out.printf("Average CS: %.2f\n", averageCash);
            System.out.printf("Average CC: %.2f", averageCart);
        }

    }
}
