package While_Loop_More_Exercises;

import java.util.Scanner;

public class p4_Числа_от_1_до_100_които_се_делят_на_3_без_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int num = 1; num <100 ; num++) {
            if(num %3 == 0){
                System.out.println(num);
            }
        }

    }
}
