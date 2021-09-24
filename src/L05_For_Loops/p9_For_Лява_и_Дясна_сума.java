package L05_For_Loops;//Да се напише програма, която въвежда 2 * n цели числа и проверява
// дали сумата на първите n числа (лява сума) е равна на сумата на вторите n
// числа (дясна сума). При равенство се печата "Yes" + сумата, иначе се печата "No" +
// разликата. Разликата се изчислява като положително число (по абсолютна стойност).
// Форматът на изхода трябва да е като в примерите по-долу.
import java.util.Scanner;

public class p9_For_Лява_и_Дясна_сума {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i <2*n ; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if (i<n){
                sum1+=number;
            }else{
                sum2+=number;
            }

        }
        if (sum1 == sum2){
            System.out.println("Yes, sum = "+ sum1);
        } else {
            int dif = Math.abs(sum1 -sum2);
            System.out.println("No, diff = "+ dif);
        }
        }

    }
    /*for (int i = 1; i <= n; i++) {
             sum1 = sum1 + scanner.nextInt();
        }
        for (int i = 1; i <= n; i++) {
             sum2 = sum2 + scanner.nextInt();

        }
            if (sum1 == sum2){
                System.out.println("Yes, sum = "+ sum1);
            } else {
                int dif = Math.abs(sum1 -sum2);
                System.out.println("No, diff = "+ dif);
            }*/