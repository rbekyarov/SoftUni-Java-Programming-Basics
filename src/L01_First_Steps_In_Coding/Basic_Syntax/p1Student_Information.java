package L01_First_Steps_In_Coding.Basic_Syntax;

import java.util.Scanner;

public class p1Student_Information {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        double grade = Double.parseDouble(scanner.nextLine());

        System.out.printf("Name: %s, Age: %d, Grade: %.2f", name,age,grade);

    }
}
