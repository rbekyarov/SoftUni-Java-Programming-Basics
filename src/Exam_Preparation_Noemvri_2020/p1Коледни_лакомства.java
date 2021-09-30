
/*
Задача 1. Коледни лакомства
        Инна ще покани гости за Коледа и решава да ги посрещне с различни коледни лакомства. Тя отива до местната сладкарница, за да купи по няколко килограма от всеки вид. Напишете програма, която изчислява колко пари ще са необходими на Инна, според количеството и цените в сладкарницата. На конзолата ще бъдат въведени цените в лева на баклавата и мъфините и количеството щолен, бонбони и бисквити в килограми. Цените на лакомствата се формират както следва:
        •	Щолен – 60% по-скъп от баклавата
        •	Бонбони – 80% по-скъпи от мъфини
        •	Бисквити – 7.50 лв. за килограм
        Вход
        От конзолата се четат 5 числа:
        •	Първи ред – цена на баклавата на килограм. Реално число в интервала [0.00…40.00]
        •	Втори ред – цена на мъфините на килограм. Реално число в интервала [0.00…30.00]
        •	Трети ред – килограмите щолен. Реално число в интервала [0.00…50.00]
        •	Четвърти ред – килограмите бонбони. Реално число в интервала [0.00… 70.00]
        •	Пети ред – килограмите бисквити. Цяло число в интервала [0 ... 100]
        Изход
        Да се отпечата на конзолата едно число с плаваща запетая: колко пари ще са нужни на Инна, за да закупи всички лакомства. Резултатът да се форматира до втория знак след десетичната запетая.
*/


package Exam_Preparation_Noemvri_2020;

import java.util.Scanner;

public class p1Коледни_лакомства {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double priceBaklava = Double.parseDouble(scanner.nextLine());
        double priceMufini = Double.parseDouble(scanner.nextLine());
        double kgShtolen = Double.parseDouble(scanner.nextLine());
        double kgBonboni = Double.parseDouble(scanner.nextLine());
        double kgBiskvitki = Double.parseDouble(scanner.nextLine());
        double priceShtolen = 0;
        double priceBonboni = 0;

        priceShtolen = priceBaklava + 0.6 * priceBaklava;
        priceBonboni = priceMufini + 0.8 * priceMufini;
        double priceBiskvitki = 7.5;
        double totalPrice = kgShtolen * priceShtolen + priceBonboni * kgBonboni + kgBiskvitki * priceBiskvitki;
        System.out.printf("%.2f", totalPrice);

    }
}
