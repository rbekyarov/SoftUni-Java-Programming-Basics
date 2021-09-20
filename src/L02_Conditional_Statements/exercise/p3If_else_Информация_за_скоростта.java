package Kurs5Проверки.Упражнения;//Задача: информация за скоростта
//Да се напише програма, която въвежда скорост (десетично число) и отпечатва информация за скоростта.
//• При скорост до 10 (включително), отпечатайте "slow".
//• При скорост над 10 и до 50, отпечатайте "average".
//• При скорост над 50 и до 150, отпечатайте "fast".
//• При скорост над 150 и до 1000, отпечатайте "ultra fast".
//• При по-висока скорост, отпечатайте "extremely fast".
//Примерен вход и изход Вход Изход Вход Изход Вход Изход 8 slow 126 fast 3500 extremely fast
import java.util.Scanner;

public class p3If_else_Информация_за_скоростта {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num = Double.parseDouble(scanner.nextLine());

        if (num<=10){
            System.out.println("slow");
        } else if (num<=50){
            System.out.println("average");
        } else if (num<=150){
            System.out.println("fast");
        } else if (num<=1000){
            System.out.println("ultra fast");
        }  else if (num>1000){
            System.out.println("extremely fast");

    }
}
}