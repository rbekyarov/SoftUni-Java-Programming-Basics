package Kurs5Проверки.Упражнения;

//Дадено е цяло число – брой точки. Върху него се начисляват бонус точки по правилата, описани по-долу. Да се напише програма, която пресмята бонус точките за това число и общия брой точки с бонусите.
//• Ако числото е до 100 включително, бонус точките са 5.
//• Ако числото е по-голямо от 100, бонус точките са 20% от числото.
//• Ако числото е по-голямо от 1000, бонус точките са 10% от числото.
//• Допълнителни бонус точки (начисляват се отделно от предходните):
//o За четно число → + 1 т.
//o За число, което завършва на 5 → + 2 т.

import java.util.Scanner;
public class p2If_else_Бонус_Точки {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.next());
       // double bon2 = bonus*0.2;
        double bonus = 0;
        if (num<=100)  {
            bonus = 5;

        }else if (num<=1000)  {
            bonus = num*0.2;

    }else if (num>1000)  {
            bonus = num*0.1;

        }
        if (num % 2 ==0){
            bonus = bonus +1;
        }
        if(num % 10==5){
            bonus = bonus+2;
        }
        double totalResult = num+bonus;
        System.out.println(bonus);
        System.out.println(totalResult);

}
}