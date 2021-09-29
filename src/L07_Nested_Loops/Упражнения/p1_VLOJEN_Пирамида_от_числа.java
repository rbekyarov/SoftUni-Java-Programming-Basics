package L07_Nested_Loops.Упражнения;// Да се разпечата Пирамида от числа като в примераШ
//n=10
//1
//23
//456
//78910

import java.util.Scanner;

public class p1_VLOJEN_Пирамида_от_числа {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     int n = Integer.parseInt(scanner.nextLine());
     int count = 1;

        for (int i = 1; i <= n ; i++) {
            for (int j = 0; j < i ; j++) {
                System.out.print(count + " ");
                count++;
                if (count>n){
                    break;
                }
            }if (count>n){
                break;
        }
          System.out.println();
    }
}
}
