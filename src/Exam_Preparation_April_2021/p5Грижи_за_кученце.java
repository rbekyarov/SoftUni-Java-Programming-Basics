package Exam_Preparation_April_2021;

import java.util.Scanner;

public class p5Грижи_за_кученце {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int buyedFoodForDogInKg = Integer.parseInt(scanner.nextLine());
        buyedFoodForDogInKg = buyedFoodForDogInKg * 1000;
        String stop = "Adopted";
        int result = 0;

        for (int i = 0; i <= Integer.MAX_VALUE; i++) {
            String eatingFooodString = scanner.nextLine();


            if (eatingFooodString.equals(stop)) {
                break;
            } else {
                int kgEatingFood = Integer.parseInt(eatingFooodString);
                result += kgEatingFood;
            }
        }

        if (result < buyedFoodForDogInKg) {
            System.out.printf("Food is not enough. You need %d grams.", buyedFoodForDogInKg - result);
        } else {
            System.out.printf("Food is enough! Leftovers: %d grams.", result - buyedFoodForDogInKg);
        }


    }


}
