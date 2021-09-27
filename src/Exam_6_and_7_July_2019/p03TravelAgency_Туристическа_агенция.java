/*
Изпит по "Основи на програмирането" – 6 и 7 юли 2019
        Задача 3. Туристическа агенция
        Туристическа агенция има нужда от система за изчисляване на дължимата сума при резервация. В зависимост от различните дестинации и различните пакети, цената е различна.
        Цените за ден са следните:
        Цена за ден    Банско/Боровец Варна/Бургас
        с екипировка без екипировка със закуска   без закуска
        100лв.    80лв  130лв.    100лв.
        VIP отстъпка    10% 5%  12% 7%
        Ако клиентът е заявил престой повече от 7 дни, получава единия ден безплатно.
        Вход
        От конзолата се четат 4 реда:
        1.  Име на града - текст с възможности ("Bansko",  "Borovets", "Varna" или "Burgas")
        2.  Вид на пакета - текст с възможности ("noEquipment",  "withEquipment", "noBreakfast" или "withBreakfast")
        3.  Притежание на VIP отстъпка - текст с възможности  "yes" или "no"
        4.  Дни за престой - цяло число в интервала [1 … 10000]
        Изход
        На конзолата се отпечатва 1 ред:
        • Когато потребителят е въвел всички данни правилно, отпечатваме:
        "The price is {цената, форматирана до втория знак}lv! Have a nice time!"
        • Ако потребителят е въвел по-малко от 1 ден за престой, отпечатваме:
        "Days must be positive number!"
        • Когато при въвеждането на града или вида на пакета се въведат невалидни данни, отпечатваме: "Invalid input!"
*/


package EXAM.Exam_6_and_7_July_2019;

import java.util.Scanner;

public class p03TravelAgency_Туристическа_агенция {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        String paketType = scanner.nextLine();
        String VIP = scanner.nextLine();
        int day = Integer.parseInt(scanner.next());
        if (day < 1) {
            System.out.println("Days must be positive number!");
            return;
        }
        double price = 0;
        switch (city) {
            case "Bansko":
            case "Borovets":
                if (paketType.equals("withEquipment")) {
                    price = 100 * day;
                    if (day > 7) {
                        price = 100 * (day - 1);
                    }
                    if (VIP.equals("yes")) {
                        price = price - price * 0.1;
                    } else {
                        price = 100 * day;
                    }

                } else if (paketType.equals("noEquipment")) {
                    price = 80 * day;
                    if (day > 7) {
                        price = 80 * (day - 1);
                    }
                    if (VIP.equals("yes")) {
                        price = price - price * 0.05;
                    } else {
                        price = 80 * day;
                    }
                } else {
                    System.out.println("Invalid input!");
                    return;
                }
                break;

            case "Varna":
            case "Burgas":

                if (paketType.equals("withBreakfast")) {
                    price = 130 * day;
                    if (day > 7) {
                        price = 130 * (day - 1);
                    }
                    if (VIP.equals("yes")) {
                        price = price - price * 0.12;
                    } else {
                        price = 130 * day;
                    }
                } else if (paketType.equals("noBreakfast")) {
                    price = 100 * day;
                    if (day > 7) {
                        price = 100 * (day - 1);
                    }
                    if (VIP.equals("yes")) {
                        price = price - price * 0.07;
                    } else {
                        price = 100 * day;
                    }
                } else {
                    System.out.println("Invalid input!");
                    return;
                }
                break;

            default:

                System.out.println("Invalid input!");
                return;
        }
        System.out.printf("The price is %.2flv! Have a nice time!", price);
    }
}
 