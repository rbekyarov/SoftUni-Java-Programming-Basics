package Exam_Preparation_Mart_2020;

import java.util.Scanner;

public class p5Круизни_игри_Cruise_Games {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int games = Integer.parseInt(scanner.nextLine());

        int volleyballCount = 0;
        int tennisCount = 0;
        int badmintonCount = 0;
        int volleyballScore = 0;
        int tennisScore = 0;
        int badmintonScore = 0;

        for (int i = 0; i < games; i++) {

            String game = scanner.nextLine();
            int points = Integer.parseInt(scanner.nextLine());

            if (game.equals("volleyball")) {
                volleyballCount += 1;
                volleyballScore += points * 1.07;
            } else if (game.equals("tennis")) {
                tennisCount += 1;
                tennisScore += points * 1.05;
            } else if (game.equals("badminton")) {
                badmintonCount += 1;
                badmintonScore += points * 1.02;
            }
        }
        int totalScore = volleyballScore + tennisScore + badmintonScore;

        if ((volleyballScore / volleyballCount) >= 75 && (tennisScore / tennisCount) >= 75
                && (badmintonScore / badmintonCount) >= 75) {
            System.out.printf("Congratulations, %s! You won the cruise games with %d points.", name, totalScore);
        } else {
            System.out.printf("Sorry, %s, you lost. Your points are only %d.", name, totalScore);
        }

    }
}