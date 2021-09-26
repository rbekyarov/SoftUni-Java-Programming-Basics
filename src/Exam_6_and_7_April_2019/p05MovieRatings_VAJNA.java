package Exam_6_and_7_April_2019;

import java.util.Scanner;

public class p05MovieRatings_VAJNA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valueFilmi = Integer.parseInt(scanner.nextLine());
        String nameFilm = "";
        String Filmmax = "";
        String Filmmin = "";
        double rating = 0;
        double momentRating = 0;
        double sumRating = 0;
        double AverageRating = 0;
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        for (int i = 1; i <= valueFilmi; i++) {
            nameFilm = scanner.nextLine();
            rating = Double.parseDouble(scanner.nextLine());
            sumRating += rating;
            AverageRating = sumRating / valueFilmi;
            if (rating > max) {
                max = rating;
                Filmmax = nameFilm;
            }
            if (rating < min) {
                min = rating;
                Filmmin = nameFilm;
            }
        }
        System.out.println(Filmmax + " is with highest rating: " + max);
        System.out.println(Filmmin + " is with lowest rating: " + min);
        System.out.printf("Average rating: %.1f",AverageRating);

    }
}