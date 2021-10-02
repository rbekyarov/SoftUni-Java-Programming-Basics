package While_Loop_More_Exercises;

import java.util.Scanner;

public class p3StreamOfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String symbol = scanner.nextLine();

        int countC = 0;
        int countO = 0;
        int countN = 0;
        String word = "";
        String secredWord = "";

        while (!symbol.equals("End")) {

            char letter = symbol.charAt(0);

            if (letter >= 'a' && letter <= 'z' || letter >= 'A' && letter <= 'Z') {
                if (symbol.equals("c") && countC == 0) {
                    countC++;
                } else if (symbol.equals("o") && countO == 0) {
                    countO++;
                } else if (symbol.equals("n") && countN == 0) {
                    countN++;
                } else {
                    word += letter;
                }
                if (countC + countN + countO == 3) {
                    secredWord += word;
                    secredWord += ' ';
                    word = "";
                    countO = 0;
                    countC = 0;
                    countN = 0;
                }
            }
            symbol = scanner.nextLine();
        }
        System.out.println(secredWord);
    }
}

