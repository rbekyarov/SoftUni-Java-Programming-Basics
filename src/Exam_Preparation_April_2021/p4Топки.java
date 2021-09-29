package Exam_Preparation_April_2021;

import java.util.Scanner;

public class p4Топки {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countBalls = Integer.parseInt(scanner.next());

        double point = 0;
        int countRed =0;
        int countOrange =0;
        int countYellow =0;
        int countWhite =0;
        int countBlack =0;
        int coundUnknown =0;
        String cviat = scanner.nextLine();
        for (int i = 1; i <=countBalls ; i++) {
            cviat = scanner.nextLine();
            switch (cviat) {
                case "red":
                    point+=5;
                    countRed++;
                    break;
                case "orange":
                    point+=10;
                    countOrange++;
                    break;
                case "yellow":
                    point+=15;
                    countYellow++;
                    break;
                case "white":
                    point+=20;
                    countWhite++;
                    break;
                case "black":
                    point=point/2;
                    countBlack++;
                    break;
                default:
                    coundUnknown ++;
                    break;
            }
        }System.out.printf("Total points: %.0f\n",point);
        System.out.printf("Points from red balls: %d\n",countRed);
        System.out.printf("Points from orange balls: %d\n",countOrange);
        System.out.printf("Points from yellow balls: %d\n",countYellow);
        System.out.printf("Points from white balls: %d\n",countWhite);
        System.out.printf("Other colors picked: %d\n",coundUnknown);
        System.out.printf("Divides from black balls: %d\n",countBlack);

    }
}
