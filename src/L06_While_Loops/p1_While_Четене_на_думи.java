package L06_While_Loops;

import java.util.Scanner;

public class p1_While_Четене_на_думи {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            String text = scanner.nextLine();
            if (text.equals("Stop")){
                break;
            } System.out.println(text);
        }


    }
}


