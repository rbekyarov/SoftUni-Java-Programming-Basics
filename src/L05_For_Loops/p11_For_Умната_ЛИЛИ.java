package L05_For_Loops;//Задача: умната Лили
//Лили вече е на N години. За всеки свой рожден ден тя получава подарък. За нечет-ните рождени дни (1, 3, 5, …, n) получава играчки,
// а за всеки четен (2, 4, 6, …, n) получава пари. За втория рожден ден получава 10.00 лв.,
// като сумата се увеличава с 10.00 лв. за всеки следващ четен рожден ден (2 -> 10, 4 -> 20, 6 -> 30 и т.н.).
// През годините Лили тайно е спестявала парите. Братът на Лили, в годините, в които тя получава пари, взима по 1.00 лев от тях.
// Лили продала играчките, получени през годините, всяка за P лева и добавила сумата към спестените пари. С парите искала да си купи пералня за X лева.
// Напишете програма, която да пресмята колко пари е събрала и дали ѝ стигат да си купи пералня.
//Входни данни
//От конзолата се прочитат 3 числа, всяко на отделен ред:
//• Възрастта на Лили – цяло число в интервала [1 … 77].
//• Цената на пералнята – число в интервала [1.00 … 10 000.00].
//• Единична цена на играчка – цяло число в интервала [0 … 40].
//Изходни данни
//Да се отпечата на конзолата един ред:
//• Ако парите на Лили са достатъчни:
//o “Yes! {N}” – където N е остатъка пари след покупката.
//• Ако парите не са достатъчни:
//o “No! {М}” – където M е сумата, която не достига.
//• Числата N и M трябва да са форматирани до втория знак след десетичната точка.
//10 170.00 6 Yes! 5.00
//21 1570.98 3
//No! 997.98

import java.util.Scanner;

public class p11_For_Умната_ЛИЛИ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double priceWashingMachine = Double.parseDouble(scanner.nextLine());
        double priceToy = Double.parseDouble(scanner.nextLine());

        int toys = 0;
        int savedMoney = 0;
        for (int birthday = 1; birthday <= age; birthday++) {
            if (birthday % 2 == 0) {
                savedMoney += birthday * 5 - 1;
            } else {
                toys += 1;
            }
        }
        double totalSum = savedMoney + (toys * priceToy);

        if (totalSum >= priceWashingMachine) {
            double diff = totalSum - priceWashingMachine;
            System.out.printf("Yes! %.2f", diff);
        } else {
            double needMoney = priceWashingMachine - totalSum;
            System.out.printf("No! %.2f", needMoney);
        }

    }
}
