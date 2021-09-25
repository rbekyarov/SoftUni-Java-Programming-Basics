package L06_While_Loops;

import java.util.Scanner;

public class p2_While_Име_и_Парола {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String pass = scanner.nextLine();

        String inputPass = scanner.nextLine();

        while (!inputPass.equals(pass)){
            inputPass = scanner.nextLine();

        }System.out.printf("Welcom %s!", name);
    }
}
