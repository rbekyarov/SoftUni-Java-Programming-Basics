package Exam_Preparation_Mart_2020;

import java.util.Scanner;

public class p3Круизен_кораб_Cruise_Ship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cruiseType = scanner.nextLine();
        String cabinType = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        double price = 0;

        switch (cruiseType) {
            case "Mediterranean":
                switch (cabinType) {
                    case "standard cabin":
                        price = nights * 27.5;
                        break;
                    case "cabin with balcony":
                        price = nights * 30.2;
                        break;
                    case "apartment":
                        price = nights * 40.5;
                        break;
                }
                break;
            case "Adriatic":
                switch (cabinType) {
                    case "standard cabin":
                        price = nights * 22.99;
                        break;
                    case "cabin with balcony":
                        price = nights * 25;
                        break;
                    case "apartment":
                        price = nights * 34.99;
                        break;
                }
                break;
            case "Aegean":
                switch (cabinType) {
                    case "standard cabin":
                        price = nights * 23.0;
                        break;
                    case "cabin with balcony":
                        price = nights * 26.6;
                        break;
                    case "apartment":
                        price = nights * 39.8;
                        break;
                }
                break;
        }
        if (nights > 7) {
            price = price * 0.75;
        }
        System.out.printf("Annie's holiday in the %s sea costs %.2f lv.", cruiseType, price * 4);
    }
}
