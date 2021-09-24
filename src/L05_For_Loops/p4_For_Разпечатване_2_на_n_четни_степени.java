package L05_For_Loops;

import java.util.Scanner;

/*public class p4_For_Разпечатване_2_на_n_четни_степени {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= Integer.parseInt(scanner.nextLine());

        for (int i = 0; i<=n; i+=2) {

            System.out.printf("%.0f\n",Math.pow(2,i));//Math.pow - степенуване

            
        }
    }
}*/
// ВТОРИ НАЧИН без Math.pow
import java.util.Scanner;

class LOOP_Разпечатване_2_на_n_четни_степени {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n= Integer.parseInt(scanner.nextLine());
        int num = 1;
        for (int i = 0; i<=n; i+=2) {

            System.out.println(num);
            num = num *2*2;


        }
   }
}
