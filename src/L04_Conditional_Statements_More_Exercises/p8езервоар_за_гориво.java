package L04_Conditional_Statements_More_Exercises;

import java.util.Scanner;

public class p8езервоар_за_гориво {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        double liters = Double.parseDouble(scanner.nextLine());
        if (type.equals("Diesel") || type.equals("Gasoline") || type.equals("Gas")) {
            if (type.equals("Diesel")) {
                if(liters >= 25){
                    System.out.println("You have enough diesel.");
                }else if (liters <= 25) {
                    System.out.println("Fill your tank with diesel!");
                }
            } if (type.equals("Gasoline")) {
                if(liters >= 25){
                    System.out.println("You have enough gasoline.");
                }else if (liters <= 25) {
                    System.out.println("Fill your tank with gasoline!");
                }
            }if (type.equals("Gas")) {
                if(liters >= 25){
                    System.out.println("You have enough gas.");
                }else if (liters <= 25) {
                    System.out.println("Fill your tank with gas!");
                }
            }
        } else {
            System.out.println("Invalid fuel!");
        }

    }
}
