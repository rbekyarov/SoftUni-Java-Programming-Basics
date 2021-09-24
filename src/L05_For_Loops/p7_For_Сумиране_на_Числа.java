package L05_For_Loops;//Пример: сумиране на числа Да се напише програма, която въвежда n цели числа и ги сумира. •
// От първия ред на входа се въвежда броят числа n. • От следващите n реда се въвежда по едно число.
//• Числата се сумират и накрая се отпечатва резултатът.
//Вход Изход Вход Изход Вход Изход 2 10 20 30
import java.util.Scanner;

public class p7_For_Сумиране_на_Числа {
    public static void main(String[] args) {
       /* Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 1; i <= n ; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            sum = sum+number;

        }System.out.println(sum);*/
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = 0; i <=n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            sum= sum+number;
        }
        System.out.println(sum);
    }
}
