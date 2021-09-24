package L05_For_Loops.Упражнения;//Задача: хистограма
//Дадени са n цели числа в интервала [1 … 1000]. От тях някакъв процент p1 са под 200, процент p2 са от 200 до 399,
// процент p3 са от 400 до 599, процент p4 са от 600 до 799 и останалите p5 процента са от 800 нагоре. Да се напише програма,
// която изчислява и отпечатва процентите p1, p2, p3, p4 и p5.
//Пример: имаме n = 20 и числа: 53, 7, 56, 180, 450, 920, 12, 7, 150, 250, 680, 2, 600, 200, 800, 799, 199, 46, 128, 65.
// Получаваме следното разпределение и визуал-изация:
//Входни данни
//На първия ред от входа стои цялото число n (1 ≤ n ≤ 1000), което представлява броя редове с числа, които ще ни бъдат подадени.
// На следващите n реда стои по едно цяло число в интервала [1 … 1000] – числата, върху които да бъде изчислена хистограмата.
//Изходни данни
//Да се отпечата на конзолата хистограма от 5 реда, всеки от които съдържа число между 0% и 100%,
// форматирано с точност две цифри след десетичния знак (нап-ример 25.00%, 66.67%, 57.14%).
import java.util.Scanner;

public class p4_For_Хистограма {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;

        for (int num = 1; num <=n ; num++) {

            int value = Integer.parseInt(scanner.nextLine());

            if (value <200){
                count1= count1+1;
            } else if (value<=399){
                count2 ++;
            } else if (value<=599) {
                count3++;
            }else if (value<=799){
                count4++;
            }else{
                count5++;
            }

        } double group1 = count1*1.0/n*100;
        double group2=  count2*1.0/n*100;
        double group3 = count3*1.0/n*100;
        double group4 = count4*1.0/n*100;
        double group5 = count5*1.0/n*100;
        System.out.printf("%.2f",group1);
        System.out.println("%");
        System.out.printf("%.2f",group2);
        System.out.println("%");
        System.out.printf("%.2f",group3);
        System.out.println("%");
        System.out.printf("%.2f",group4);
        System.out.println("%");
        System.out.printf("%.2f",group5);
        System.out.println("%");


    }
}
