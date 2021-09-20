package Kurs5Проверки;

////Задача: число от 100 до 200
////Да се напише програма, която въвежда цяло число и проверява дали е под 100, между 100 и 200 или над 200. Да се отпечатат съответно съобщения, като в примерите по-долу.
////95 Less than 100
////120 Between 100 and 200
////210 Greater than 200
import java.util.Scanner;
public class p4If_else_Числло_от_1_до_200 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int num = Integer.parseInt(scanner.nextLine());

            if (num<100){
                System.out.println("Less than 100");
            } else if (num>=100 && num<=200){
                System.out.println("Between 100 and 200");
            } else{
                System.out.println("Greater than 200");
            }



}
    }