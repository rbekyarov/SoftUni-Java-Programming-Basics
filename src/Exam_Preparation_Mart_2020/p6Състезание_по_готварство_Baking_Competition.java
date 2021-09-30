package Exam_Preparation_Mart_2020;

import java.util.Scanner;

public class p6Състезание_по_готварство_Baking_Competition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        int totalCount = 0;
        double totalSum = 0;

        double priceCookies = 1.50;
        double priceCakes = 7.80;
        double priceWaffles = 2.30;

        for (int i = 0; i < count; i++) {
            int countCookies = 0;
            int countCakes = 0;
            int countWaffles = 0;

            String name = scanner.nextLine();
            String typeMeal = scanner.nextLine();

            while (!typeMeal.equals("Stop baking!")) {
                int countMeal = Integer.parseInt(scanner.nextLine());

                switch (typeMeal) {
                    case "cookies":
                        countCookies += countMeal;
                        break;
                    case "cakes":
                        countCakes += countMeal;
                        break;
                    case "waffles":
                        countWaffles += countMeal;
                        break;
                }

                typeMeal = scanner.nextLine();
            }

            System.out.printf("%s baked %d cookies, %d cakes and %d waffles.", name, countCookies, countCakes, countWaffles);

            totalCount += countCookies + countCakes + countWaffles;
            totalSum += (countCookies * priceCookies) + (countCakes * priceCakes) + (countWaffles * priceWaffles);
        }
        System.out.printf("All bakery sold: %d\n", totalCount);
        System.out.printf("Total sum for charity: %.2f lv.", totalSum);
    }
}