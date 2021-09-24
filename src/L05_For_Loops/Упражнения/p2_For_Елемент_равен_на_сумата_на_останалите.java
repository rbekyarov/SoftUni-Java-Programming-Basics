package L05_For_Loops.Упражнения;

/*
Елемент, равен на сумата на останалите
        Да се напише програма, която чете n-на брой цели числа, въведени от потребителя,
         и проверява дали сред тях съществува число, което е равно на сумата на всички останали.
         Ако има такъв елемент, печата "Yes", "Sum = "  + неговата стойност;
         иначе печата "No", "Diff = " + разликата между най-големия елемент и сумата на останалите (по абсолютна стойност).
*/


import java.util.Scanner;

public class p2_For_Елемент_равен_на_сумата_на_останалите {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int max = Integer.MIN_VALUE;
        int sumOutmax = 0;
        int sum=0;
        for (int i = 1; i <=n; i++) {
            int num = scanner.nextInt();
            if (num>max){
                max=num;
            }
            sum +=num;
            sumOutmax = sum - max;

        }
        if (sumOutmax==max){
            System.out.println("Yes");
            System.out.println("Sum = "+max);
       } else {
            System.out.println("No");
           System.out.println("Diff = "+Math.abs(max-sumOutmax));
       }

    }
}

