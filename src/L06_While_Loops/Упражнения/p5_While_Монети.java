package L06_While_Loops.Упражнения;
/*
5.	Монети
   Производителите на вендинг машини искали да направят машините си да връщат възможно най-малко монети ресто.
   Напишете програма, която приема сума - рестото, което трябва да се върне и изчислява с колко най-малко монети
   може да стане това.
*/
import java.util.Scanner;

public class p5_While_Монети {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = Double.parseDouble(scanner.nextLine());
        int count= 0;
        double coins = 100*sum;
        while (coins >0){
                if (coins >= 200)
                {
                    count++;
                    coins -= 200;
                }
                else if (coins >= 100)
                {
                    count++;
                    coins -= 100;
                }
                else if (coins >= 50)
                {
                    count++;
                    coins -= 50;
                }
                else if (coins >= 20)
                {
                    count++;
                    coins -= 20;
                }
                else if (coins >= 10)
                {
                    count++;
                    coins -= 10;
                }
                else if (coins >= 5)
                {
                    count++;
                    coins -= 5;
                }
                else if (coins >= 2)
                {
                    count++;
                    coins -= 2;
                }
                else if (coins >= 1)
                {
                    count++;
                    coins -= 1;
                }
                else
                {
                    break;
                }
        }System.out.println(count);

    }
}
