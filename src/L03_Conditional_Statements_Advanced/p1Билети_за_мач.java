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
package L03_Conditional_Statements_Advanced;

import java.util.Scanner;

public class p1Билети_за_мач {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                double budget = Double.parseDouble(scanner.nextLine());
                String typeTickets = scanner.nextLine();
                int people = Integer.parseInt(scanner.nextLine());
                double expenses = 0;
                double priceTickets = 0;
                double diff = 0;
                if (people>=1 && people<=4){
                    expenses = budget-(budget*0.75);
                    if (typeTickets.equals("VIP")){
                        priceTickets = expenses-(people*499.99);
                    } else if (typeTickets.equals("Normal")){
                        priceTickets = expenses-(people*249.99);
                    }

                }    else if (people>=5 && people<=9){
                    expenses = budget-(budget*0.6);
                    if (typeTickets.equals("VIP")){
                        priceTickets = expenses-(people*499.99);
                    } else if (typeTickets.equals("Normal")){
                        priceTickets = expenses-(people*249.99);
                    }
                }else if (people>=10 && people<=24){
                    expenses = budget-(budget*0.5);
                    if (typeTickets.equals("VIP")){
                        priceTickets =  expenses-(people*499.99);
                    } else if (typeTickets.equals("Normal")){
                        priceTickets = expenses-(people*249.99);
                    }
                }else if (people>=25 && people<=49){
                    expenses = budget-(budget*0.4);
                    if (typeTickets.equals("VIP")){
                        priceTickets = expenses-(people*499.99);
                    } else if (typeTickets.equals("Normal")){
                        priceTickets = expenses-(people*249.99);
                    }
                } else if (people>=50){
                    expenses = budget-(budget*0.25);
                    if (typeTickets.equals("VIP")){
                        priceTickets = expenses-(people*499.99);
                    } else if (typeTickets.equals("Normal")){
                        priceTickets = expenses-(people*249.99);
                    }
                }
                if (priceTickets >0){


                    System.out.printf("Yes! You have %.2f leva left.",priceTickets );
                } else if (priceTickets <0){
                    priceTickets = Math.abs(priceTickets);
                    System.out.printf("Not enough money! You need %.2f leva.",priceTickets);
                }
            }
        }
