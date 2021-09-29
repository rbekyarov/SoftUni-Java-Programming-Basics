package Exam_Preparation_April_2021;

import java.util.Scanner;

public class p4_Фитнес_център {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int visitors = Integer.parseInt(scanner.nextLine());

        int back = 0;
        int chest = 0;
        int legs = 0;
        int abs = 0;
        int proteinShake = 0;
        int proteinBar = 0;

        for (int i = 0; i < visitors; i++) {
            String activity = scanner.nextLine();

            if (activity.equals("Back")) {
                back++;
            }

            if (activity.equals("Chest")) {
                chest++;
            }

            if (activity.equals("Legs")) {
                legs++;
            }

            if (activity.equals("Abs")) {
                abs++;
            }

            if (activity.equals("Protein shake")) {
                proteinShake++;
            }

            if (activity.equals("Protein bar")) {
                proteinBar++;
            }
        }

        int peopleForWorkOut = back + chest + legs + abs;
        int peopleForProtein = proteinShake + proteinBar;

        double percentWorkOut = peopleForWorkOut * 1.0 / visitors * 100;
        double percentProtein = peopleForProtein * 1.0 / visitors * 100;

        System.out.println(back + " - back");
        System.out.println(chest + " - chest");
        System.out.println(legs + " - legs");
        System.out.println(abs + " - abs");
        System.out.println(proteinShake + " - protein shake");
        System.out.println(proteinBar + " - protein bar");
        System.out.printf("%.2f%% - work out\n", percentWorkOut);
        System.out.printf("%.2f%% - protein", percentProtein);
    }
}

