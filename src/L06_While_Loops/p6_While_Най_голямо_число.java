package L06_While_Loops;// Прочита n последователни пъти числа, до като получи команда "Stop"
// Намира най голямото измежду тях
import java.util.Scanner;

public class p6_While_Най_голямо_число {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int max = Integer.MIN_VALUE;
        while ( !input.equals("Stop")) {
            int number = Integer.parseInt(input); // Пробразувна от Стринг в ИНТ
            if (number >max) {
                max = number;
            }

            input = scanner.nextLine();
        }
        System.out.println(max);
    }
}
