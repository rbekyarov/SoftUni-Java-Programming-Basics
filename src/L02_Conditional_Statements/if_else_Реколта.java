package Kurs5Проверки;//Задача: реколта
//От лозе с площ X кв. м. се заделя 40% от реколтата за производство на вино.
// От 1 кв.м. лозе се изкарват Y килограма грозде. За 1 литър вино са нужни 2,5 кг. грозде. Желаното количество вино за продан е Z литра.
//Напишете програма, която пресмята колко вино може да се произведе и дали това количество е достатъчно.
// Ако е достатъчно, остатъкът се разделя по равно между работниците на лозето.
//Входни данни
//Входът се чете от конзолата и се състои от точно 4 реда:
//• 1-ви ред: X кв.м е лозето – цяло число в интервала [10 … 5000].
//• 2-ри ред: Y грозде за един кв.м. – реално число в интервала [0.00 … 10.00].
//• 3-ти ред: Z нужни литри вино – цяло число в интервала [1 … 600].
//• 4-ти ред: брой работници – цяло число в интервала [1 … 20].
//Изходни данни
//На конзолата трябва да се отпечата следното:
//• Ако произведеното вино е по-малко от нужното:
//"It will be a tough winter! More {недостигащо вино} liters wine needed." * Резултатът трябва да е закръглен към по-ниско цяло число.
//• Ако произведеното вино е повече от нужното:
//o "Good harvest this year! Total wine: {общо вино} liters." * Резултатът трябва да е закръглен към по-ниско цяло число.
//o "{Оставащо вино} liters left -> {вино за 1 работник} liters per person." * И двата резултата трябва да са закръглени към по-високото цяло число.
//Примерен вход и изход Вход Изход Вход Изход 650 2 175 3 Good harvest this year! Total wine: 208 liters. 33 liters left -> 11 liters per person. 1020 1.5 425 4 It will be a tough winter! More 180 liters wine needed.
import java.util.Scanner;

public class if_else_Реколта {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int plosht = Integer.parseInt(scanner.nextLine());
        double grozde = Double.parseDouble(scanner.nextLine());
        int vino = Integer.parseInt(scanner.nextLine());
        int rabotnici = Integer.parseInt(scanner.nextLine());

        double resgrozde = plosht*grozde;
        double resvino = resgrozde*0.4/2.5;

         if (resvino>vino) {
             double vinoostatyk = resvino-vino;
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n",Math.floor(resvino));
            System.out.printf("%.0f liters left → %.0f liters per person.", Math.ceil(vinoostatyk),Math.ceil(vinoostatyk/rabotnici));
    } else {
        System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(vino-resvino));


}
}
}