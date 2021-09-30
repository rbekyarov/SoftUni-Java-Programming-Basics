
package Exam_Preparation_Noemvri_2020;


import java.util.Scanner;

public class p5Филмов_рейтинг {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int movies = Integer.parseInt(scanner.nextLine());
        String nameMovie = "";
        double ratingMovie = 0;
        double maxRating = Double.NEGATIVE_INFINITY;
        double minRating = Double.POSITIVE_INFINITY;
        String movieMaxRating = "";
        String movieMinRating = "";
        double averageRating = 0;

        for (int i = 0; i < movies; i++) {
            nameMovie = scanner.nextLine();
            ratingMovie = Double.parseDouble(scanner.nextLine());
            if (ratingMovie > maxRating) {
                maxRating = ratingMovie;
                movieMaxRating = nameMovie;
            }
            if (ratingMovie < minRating) {
                minRating = ratingMovie;
                movieMinRating = nameMovie;
            }
            averageRating += ratingMovie;
        }
        System.out.printf("%s %.1f\n", movieMaxRating, maxRating);
        System.out.printf("%s %.1f\n", movieMinRating, minRating);
        System.out.printf("Average rating: %.1f", averageRating / movies);
    }
}