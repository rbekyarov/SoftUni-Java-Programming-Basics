package L05_For_Loops;

import java.util.Scanner;

public class p5_For_Поток_от_символи {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();


        for (int i=0  ; i<=text.length() -1  ;i=i+1){
            System.out.println(text.charAt(i));
        }

    }
}
