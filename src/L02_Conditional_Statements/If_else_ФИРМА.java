package Kurs5Проверки;

import java.util.Scanner;
//Задача: фирма
//Фирма получава заявка за изработването на проект, за който са необходими опре-делен брой часове. Фирмата разполага с определен брой дни. През 10% от дните служителите са на обучение и не могат да работят по проекта. Един нормален работен ден във фирмата е 8 часа. Проектът е важен за фирмата и всеки служител задължително работи по проекта в извънработно време по 2 часа на ден.
//Часовете трябва да са закръглени към по-ниско цяло число (например → 6.98 часа се закръглят на 6 часа).
//Напишете програма, която изчислява дали фирмата може да завърши проекта навреме и колко часа не достигат или остават.
//Входни данни
//Входът се чете от конзолата и съдържа точно 3 реда:
//• На първия ред са необходимите часове – цяло число в интервала [0 … 200 000].
//• На втория ред са дните, с които фирмата разполага – цяло число в интервала [0 … 20 000].
//• На третия ред е броят на всички служители – цяло число в интервала [0 … 200].
//Изходни данни
//Да се отпечата на конзолата един ред:
//• Ако времето е достатъчно:
//o "Yes!{оставащите часове} hours left.".
//• Ако времето НЕ Е достатъчно:
//o "Not enough time!{недостигащите часове} hours needed.".
//Примерен вход и изход Вход Изход Вход Изход 90 7 3 Yes!2 hours left. 99 3 1 Not enough time!72 hours needed.
public class If_else_ФИРМА {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chasvve = Integer.parseInt(scanner.nextLine());
        int dni = Integer.parseInt(scanner.nextLine());
        int slujiteli = Integer.parseInt(scanner.nextLine());
        double resdni = dni-(dni*0.1);
        double reschasove = Math.floor(resdni*10*slujiteli);

        if (reschasove>chasvve) {
            System.out.printf("Yes!%.0f hours left.", Math.floor(reschasove - chasvve));
        }else
            System.out.printf("Not enough time!%.0f hours needed.", Math.floor(chasvve-reschasove)	);
}



}