package L06_While_Loops;// Чете n на брой числа, които са вноски по банкова сметка до като не получи
//комндата "NoMoreMoney"
// При всяка вноска принтера: "Increase:сумата"
// Ако се въведе отрицателно число да се изпише "Invalid Operation!" и програмата да преклчи.
// Накрая програмата трябва да изпише : "Total: обща сума в сметката"
import java.util.Scanner;

public class p5_While_Баланс_по_сметка {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         double moneyInBank =0;
         String  input = scanner.nextLine();

         while (!input.equals("NoMoreMoney")) {
             double money = Double.parseDouble(input); //ВАЖНО !!! ПРЕОБРАЗУВАНЕ ОТ STRING В DOUBLE
             if (money<0){
                 System.out.println("Invalid operation!");
                 break;
             }
             moneyInBank+=money;
             System.out.printf("Increase: %.2f\n",money);
             input = scanner.nextLine();

         } System.out.printf("Total: %.2f\n",moneyInBank);

    }
}
