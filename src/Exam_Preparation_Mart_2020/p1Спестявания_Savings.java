
/*Задача 1. Спестявания
        Деси иска да посети голям музикален фестивал това лято. Тя трябва да започне да спестява част от дохода си,
        за да успее да заплати разходите по пътуването й до там. Напишете програма, която да изчисли максимално
        колко процента от дохода си може да спестява Деси, за да посети фестивала. Всеки месец, Деси има нужда от
        определена сума пари, за да покрие личните си разходи за месеца, а 30% от дохода си ще запази за
        непредвидени разходи.
        Вход
        От конзолата се четат 3 числа:
        1. Първи ред – дохода на Деси за месец – реално число в интервала [1500.00… 10 000.00]
        2. Втори ред – броят месеци, с които Деси разполага, за да спести парите – цяло число в интервала
        [3... 12]
        3. Трети ред – сумата, от която Деси има нужда, за да покрие личните си разходи – реално число
        в интервала [300.00... 1000.00]
        Изход
        На конзолата да се отпечатат два реда:
        • "She can save {максимален процент от дохода си, който може да спести}%"
        • "{сумата, която ще успее да спести}"
        Всички числа трябва да бъдат форматирани до втората цифра след десетичния знак.*/

package Exam_Preparation_Mart_2020;

import java.util.Scanner;

public class p1Спестявания_Savings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double profit = Double.parseDouble(scanner.nextLine());
        int mounts = Integer.parseInt(scanner.nextLine());
        double expenses = Double.parseDouble(scanner.nextLine());

        double otherExpenses = 0.3 * profit;
        double totalExpenses = expenses + otherExpenses;
        double savedMoney = profit - totalExpenses;
        double totalSavedMoney = savedMoney * mounts;
        double percentSavedMoney = savedMoney / profit * 100;

        System.out.printf("She can save %.2f%%\n", percentSavedMoney);
        System.out.printf("%.2f", totalSavedMoney);

    }
}
