package L07_Nested_Loops.Упражнения;
/*
3.	Суми прости и непрости числа
        Напишете програма, която чете от конзолата цели числа в диапазона от -2,147,483,648 до 2,147,483,647,
        докато не се получи команда "stop". Да се намери сумата на всички въведени прости и сумата на всички въведени непрости числа.
        Тъй като по дефиниция от математиката отрицателните числа не могат да бъдат прости,
        ако на входа се подаде отрицателно число да се изведе следното съобщение "Number is negative.".
        В този случай въведено число се игнорира и не се прибавя към нито една от двете суми,
        а програмата продължава своето изпълнение, очаквайки въвеждане на следващо число.
        На изхода да се отпечатат на два реда двете намерени суми в следния формат:
        "Sum of all prime numbers is: {prime numbers sum}"
        "Sum of all non prime numbers is: {nonprime numbers sum}"
*/


import java.util.Scanner;

public class p3VLOJEN_Суми_прости_и_непрости_числа_ВАЖНА {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        boolean isPrime = false;
        int sumPrime = 0;
        int sumNoPrime = 0;

        while (!input.equals("stop")) {
            int n = Integer.parseInt(input);
            if (n < 0) {
                n = 0;
                System.out.println("Number is negative.");
            } else if (n == 1) {
                isPrime = false;
            }else if (n == 2) {
                isPrime = true;
            } else {
                for (int count = 2; count < n; count++) {
                    if (n % count != 0) {
                        isPrime = true;
                    } else if (n % count == 0 ) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                sumPrime += n;
            } else  {
                sumNoPrime += n;
            }
            input = scanner.nextLine();
        }

        System.out.printf("Sum of all prime numbers is: %d\n", sumPrime);
        System.out.printf("Sum of all non prime numbers is: %d", sumNoPrime);

    }
}
