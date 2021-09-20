package Kurs5Проверки;

import java.util.Scanner;
//Задача: билети за мач
//Група запалянковци решили да си закупят билети за Евро 2016. Цената на билета се определя спрямо две категории:
//• VIP – 499.99 лева
//• Normal – 249.99 лева
//Запалянковците имат определен бюджет, a броят на хората в групата определя какъв процент от бюджета трябва да се задели за транспорт:
//• От 1 до 4 – 75% от бюджета
//• От 5 до 9 – 60% от бюджета
//• От 10 до 24 – 50% от бюджета
//• От 25 до 49 – 40% от бюджета
//• 50 или повече – 25% от бюджета
//Напишете програма, която да пресмята дали с останалите пари от бюджета могат да си купят билети за избраната категория, както и колко пари ще им останат или ще са им нужни.
//Входни данни
//Входът се чете от конзолата и съдържа точно 3 реда:
//• На първия ред е бюджетът – реално число в интервала [1 000.00 … 1 000 000.00.
//• На втория ред е категорията – "VIP" или "Normal".
//• На третия ред е броят на хората в групата – цяло число в интервала [1 … 200].
//Изходни данни
//Да се отпечата на конзолата един ред:
//• Ако бюджетът е достатъчен:
//o "Yes! You have {N} leva left." – където N са останалите пари на групата.
//• Ако бюджетът НЕ Е достатъчен:
//o "Not enough money! You need {М} leva." – където М е сумата, която не достига.
//Сумите трябва да са форматирани с точност до два символа след десетичния знак.
public class If_else_Билет_за_мач {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budjet = Double.parseDouble(scanner.nextLine());
        String typebilet = scanner.nextLine();
        int hora = Integer.parseInt(scanner.nextLine());
        double razhodi = 0;
        double paribileti = 0;
        double ostatuk = 0;
        if (hora>=1 && hora<=4){
            razhodi = budjet-(budjet*0.75);
            if (typebilet.equals("VIP")){
                paribileti = razhodi-(hora*499.99);
            } else if (typebilet.equals("Normal")){
                paribileti = razhodi-(hora*249.99);
        }

    }    else if (hora>=5 && hora<=9){
            razhodi = budjet-(budjet*0.6);
            if (typebilet.equals("VIP")){
                paribileti = razhodi-(hora*499.99);
            } else if (typebilet.equals("Normal")){
                paribileti = razhodi-(hora*249.99);
}
        }else if (hora>=10 && hora<=24){
            razhodi = budjet-(budjet*0.5);
            if (typebilet.equals("VIP")){
                paribileti =  razhodi-(hora*499.99);
            } else if (typebilet.equals("Normal")){
                paribileti = razhodi-(hora*249.99);
           }
        }else if (hora>=25 && hora<=49){
            razhodi = budjet-(budjet*0.4);
            if (typebilet.equals("VIP")){
                paribileti = razhodi-(hora*499.99);
            } else if (typebilet.equals("Normal")){
                paribileti = razhodi-(hora*249.99);
            }
    } else if (hora>=50){
            razhodi = budjet-(budjet*0.25);
            if (typebilet.equals("VIP")){
                paribileti = razhodi-(hora*499.99);
            } else if (typebilet.equals("Normal")){
                paribileti = razhodi-(hora*249.99);
            }
}
 if (paribileti >0){


        System.out.printf("Yes! You have %.2f leva left.",paribileti );
    } else if (paribileti <0){
     paribileti = Math.abs(paribileti);
     System.out.printf("Not enough money! You need %.2f leva.",paribileti);
 }
}
}
