package L03_Conditional_Statements_Advanced;

import java.util.Scanner;

public class p8Умножение_по_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num = Double.parseDouble(scanner.nextLine());
        double result = 0;
       while (num>=0){

           result=num*2;
           System.out.printf("Result: %.2f\n",result);
           num = Double.parseDouble(scanner.nextLine());

       } if(num<0)
        System.out.println("Negative number!");

    }
}
