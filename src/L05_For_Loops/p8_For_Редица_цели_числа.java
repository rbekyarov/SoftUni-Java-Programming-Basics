package L05_For_Loops;
//Пример: най-голямо и най малкото число
//Да се напише програма, която въвежда n цели числа (n > 0) и намира най-голямото и най малкото измежду тях.
// На първия ред на входа се въвежда броят числа n. След това се въвеждат самите числа, по едно на ред.
// Примери:
//Примерен вход и изход Вход Изход Вход Изход Вход Изход 2 100 99 100 3 -10 20 -30 20 4 45 -20 7 99 99
import java.util.Scanner;

public class p8_For_Редица_цели_числа {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            int num = scanner.nextInt();

            if (num<min){
                min=num;
            }if (num>max){
                max=num;
            }

        }System.out.println("Max number "+max);
        System.out.println("Min number "+min);
    }
}
