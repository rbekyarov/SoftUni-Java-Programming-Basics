package Exam_6_and_7_April_2019;

import java.util.Scanner;

public class p03Oscars_week_in_cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameFilm = scanner.nextLine();
        String typeZala = scanner.nextLine();
        int bileti = Integer.parseInt(scanner.nextLine());
        double price = 0;
        if (nameFilm.equals("A Star Is Born")) {
            if (typeZala.equals("normal")) {
                price = 7.50 * bileti;
            } else if (typeZala.equals("luxury")) {
                price = 10.50 * bileti;
            } else if (typeZala.equals("ultra luxury")) {
                price = 13.50 * bileti;
            }
        } else if (nameFilm.equals("Bohemian Rhapsody")) {
            if (typeZala.equals("normal")) {
                price = 7.35 * bileti;
            } else if (typeZala.equals("luxury")) {
                price = 9.45 * bileti;
            } else if (typeZala.equals("ultra luxury")) {
                price = 12.75 * bileti;
            }
        } else if (nameFilm.equals("Green Book")) {
            if (typeZala.equals("normal")) {
                price = 8.15 * bileti;
            } else if (typeZala.equals("luxury")) {
                price = 10.25 * bileti;
            } else if (typeZala.equals("ultra luxury")) {
                price = 13.25 * bileti;
            }
        } else if (nameFilm.equals("The Favourite")) {
            if (typeZala.equals("normal")) {
                price = 8.75 * bileti;
            } else if (typeZala.equals("luxury")) {
                price = 11.55 * bileti;
            } else if (typeZala.equals("ultra luxury")) {
                price = 13.95 * bileti;
            }
        }
        System.out.printf("%s -> %.2f lv.", nameFilm, price);
    }
}
