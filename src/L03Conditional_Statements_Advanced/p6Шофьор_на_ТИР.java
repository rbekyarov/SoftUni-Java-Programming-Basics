package L03Conditional_Statements_Advanced;

import java.util.Scanner;

public class p6Шофьор_на_ТИР {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        double kmMount = Double.parseDouble(scanner.nextLine());
        double price = 0;

        if (season.equals("Spring") ||season.equals("Autumn") ){
            if (kmMount<=5000){
                price = kmMount*4*0.75;
            }else if  (kmMount>5000 && kmMount<=10000){
                price = kmMount*4*0.95;
            }else if (kmMount>10000 && kmMount<=20000){
                price = kmMount*4*1.45;
            }
        }else if (season.equals("Summer")){
            if (kmMount<=5000){
                price = kmMount*4*0.9;
            }else if  (kmMount>5000 && kmMount<=10000){
                price = kmMount*4*1.10;
            }else if (kmMount>10000 && kmMount<=20000){
                price = kmMount*4*1.45;
            }
        }else if (season.equals("Winter")){
            if (kmMount<=5000){
                price = kmMount*4*1.05;
            }else if  (kmMount>5000 && kmMount<=10000){
                price = kmMount*4*1.25;
            }else if (kmMount>10000 && kmMount<=20000){
                price = kmMount*4*1.45;
            }
        }
        price = price - price*0.1;
        System.out.printf("%.2f",price);


    }
}
