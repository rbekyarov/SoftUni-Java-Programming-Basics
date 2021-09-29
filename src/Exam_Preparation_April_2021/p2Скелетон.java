package Exam_Preparation_April_2021;

import java.util.Scanner;

public class p2Скелетон {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minTargetKontrola = Integer.parseInt(scanner.nextLine());
        int sekKontrola = Integer.parseInt(scanner.nextLine());
        double duljinaM = Double.parseDouble(scanner.nextLine());
        int sekZa100m = Integer.parseInt(scanner.nextLine());

        int targetSekundi = minTargetKontrola * 60 + sekKontrola;
        double putiZakusnenie = duljinaM / 120;
        double obshtoNamalenoVreme = putiZakusnenie * 2.5;
        double vremeTotal = (duljinaM / 100) * sekZa100m - obshtoNamalenoVreme;

        if (vremeTotal <= targetSekundi) {
            System.out.println("Marin Bangiev won an Olympic quota!");
            System.out.printf("His time is %.3f.", vremeTotal);

        } else {
            System.out.printf("No, Marin failed! He was %.3f second slower.", vremeTotal - targetSekundi);
        }

    }
}
