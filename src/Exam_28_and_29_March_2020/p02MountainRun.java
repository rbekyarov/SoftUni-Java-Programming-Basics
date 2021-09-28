package Exam_28_and_29_March_2020;

import java.util.Scanner;

public class p02MountainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double rekord = Double.parseDouble(scanner.nextLine());
        double razstoyanieM = Double.parseDouble(scanner.nextLine());
        double sekundi = Double.parseDouble(scanner.nextLine());

        double puti = razstoyanieM/50;
        double vremezakusnenie = Math.floor(puti)*30;
        double totalvreme = sekundi*razstoyanieM+vremezakusnenie;
        double razlika = totalvreme-rekord;
        if (totalvreme<rekord){
            System.out.printf("Yes! The new record is %.2f seconds.",totalvreme);
        } else{
            System.out.printf("No! He was %.2f seconds slower.",razlika);
        }


    }
}
