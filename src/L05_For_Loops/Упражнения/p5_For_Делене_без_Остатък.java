package L05_For_Loops.Упражнения;

import java.util.Scanner;

public class p5_For_Делене_без_Остатък {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      int n = Integer.parseInt(scanner.nextLine());
      int grupa1 =0;
      int grupa2 =0;
      int grupa3 =0;

        for (int num= 1; num <=n ; num++) {
            int stoinostN = Integer.parseInt(scanner.nextLine());
           if (stoinostN %2 ==0) {
               grupa1++;
           }if (stoinostN %3 ==0) {
               grupa2++;
            }if (stoinostN %4 ==0) {
               grupa3++;
            }
        }
        double grupa11 = grupa1*1.0/n*100;
        double grupa22=  grupa2*1.0/n*100;
        double grupa33 = grupa3*1.0/n*100;
        System.out.printf("%.2f",grupa11);
        System.out.println("%");
        System.out.printf("%.2f",grupa22);
        System.out.println("%");
        System.out.printf("%.2f",grupa33);
        System.out.println("%");

    }
}