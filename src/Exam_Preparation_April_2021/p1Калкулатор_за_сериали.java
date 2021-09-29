package Exam_Preparation_April_2021;

import java.util.Scanner;

public class p1Калкулатор_за_сериали {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameSerial = scanner.nextLine();
        int broiSeason = Integer.parseInt(scanner.nextLine());
        double broiEpizodi = Double.parseDouble(scanner.nextLine());
        double vremeEpizod = Double.parseDouble(scanner.nextLine());

        vremeEpizod += vremeEpizod * 0.2;
        double oneSeasontime = vremeEpizod * broiEpizodi + 10;
        double totalTime = oneSeasontime * broiSeason;


        System.out.printf("Total time needed to watch the %s series is %.0f minutes.", nameSerial, Math.floor(totalTime));
    }
}
