package Basic_Syntax;

import java.util.Scanner;

public class p3Passed_or_Failed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double grade = Double.parseDouble(scanner.nextLine());
        if (grade<3){
            System.out.println("Failed!");
        } else{
            System.out.println("Passed!");
        }
    }
}
