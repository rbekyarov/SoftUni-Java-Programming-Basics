package L04_Conditional_Statements_More_Exercises;

import java.util.Scanner;

public class p9езервоар_за_гориво_част_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        double kolichestvo = Double.parseDouble(scanner.nextLine());
        String cart = scanner.nextLine();
        double price = 0;

     if (type.equals("Gasoline")){
         price = kolichestvo*2.22;
         if(cart.equals("Yes")){
             price = price  - kolichestvo* 0.18;
         }if (kolichestvo>=20 && kolichestvo<=25){
             price = price - price*0.08;
         } if (kolichestvo>25 ){
             price = price - price*0.1;
         }
     }if (type.equals("Diesel")){
            price = kolichestvo*2.33;
            if(cart.equals("Yes")){
                price = price  - kolichestvo* 0.12;
            }if (kolichestvo>=20 && kolichestvo<=25){
                price = price - price*0.08;
            } if (kolichestvo>25 ){
                price = price - price*0.1;
            }
        }if (type.equals("Gas")){
            price = kolichestvo*0.93;
            if(cart.equals("Yes")){
                price = price  - kolichestvo* 0.08;
            }if (kolichestvo>=20 && kolichestvo<=25){
                price = price - price*0.08;
            } if (kolichestvo>25 ){
                price = price - price*0.1;
            }
        }
        System.out.printf("%.2f lv.",price);


    }
}
