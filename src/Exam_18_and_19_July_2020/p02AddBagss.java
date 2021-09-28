package Exam_18_and_19_July_2020;

import java.util.Scanner;

public class p02AddBagss {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceOve20 = Double.parseDouble(scanner.nextLine());
        double kilogrami = Double.parseDouble(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());
        int bagaji = Integer.parseInt(scanner.nextLine());
        double price= 0;
 /*       Таксите за багаж се изчисляват въз основа на теглото на чекирания багаж:
•	до 10кг – 20% от цената на багаж над 20кг
•	между 10кг и 20кг вкл. – 50% от цената на багаж над 20кг.
•	над 20кг – таксата се чете от конзолата
        В зависимост от броя на дните, които остават до пътуването, цената се оскъпява:
•	повече от 30 дни - цената на багажа се оскъпява с 10%
•	между 7 и 30 дни вкл. - цената на багажа се оскъпява с 15%
•	по-малко от 7 дни - цената на багажа се оскъпява с 40%
                Напишете програма, която пресмята колко ще трябва да заплати Мими, спрямо горните условия.
*/
        if (kilogrami<=10){
            price = priceOve20*0.2;
        }else if (kilogrami<10 && kilogrami<=20){
            price = priceOve20*0.5;
        } else{
            price=priceOve20;
        }

        if (days>30){
            price = price + price*0.1;
        }
        if (days<=30&&days>7){
            price = price + price*0.15;
        }
        if (days<=7){
            price = price + price*0.4;
        }

        price=price*bagaji;
        System.out.printf(" The total price of bags is: %.2f lv. ",price);

    }
}
