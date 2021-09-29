package L07_Nested_Loops;//4. Сума от две числа
//Напишете програма която проверява всички възможни комбинации от двойка числа в интервала от две Дадени числа.
//На изхода се отпечатва, коя поред е комбинацията чиито сбор от числата е равен на дадено магическо число.
//Ако няма нито една комбинация отговаряща на условието се отпечатва съобщение, че не е намерено.
//Вход
//Входът се чете от конзолата и се състои от три реда:
//Първи ред-начало на интервала - цяло число в интервала [1...999]
//Втори ред - край на интервала - цяло число в интервала [по-голямо от първото
//Трети ред-магическото число-цяло число в интервала [1...10000]
//Изход
//На конзолата трябва да се отпечата един ред, според резултата:
//Ако е намерена комбинация чиито сбор на числата е равен на магическото число
//"Combination N:{пореден номер} ({първото число) + {второ число} = {магическото число})"
//Ако не е намерена комбинация отговаряща на условието
//"{броят на всички комбинации} combinations - neither equals {магическото число}"
//Примерен вход и изход

import java.util.Scanner;

public class p4_VLOJEN_Сума_от_две_числа {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startNum = Integer.parseInt(scanner.nextLine());
        int endNum = Integer.parseInt(scanner.nextLine());
        int magicnum = Integer.parseInt(scanner.nextLine());

        int counter = 0;
        int sumN = 0;
        boolean valid = false;
        for (int n1 = startNum; n1 <= endNum; n1++) {

            for (int n2 = startNum; n2 <= endNum; n2++) {
                //System.out.println(n1 + "," + n2);
                counter++;
                sumN = n1 + n2;
                if (sumN == magicnum) {
                    valid = true;
                    System.out.printf("Combination N:%d (%d + %d = %d)", counter, n1, n2, magicnum);
                    break;
                }

            }if(valid){
                break;
            }
        }
        if (!valid){
            System.out.printf("%d combinations - neither equals %d", counter, magicnum);
        }
    }
}
