package L04_Conditional_Statements_More_Exercises;

import java.util.Scanner;

public class p6Домашни_любимци {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int days = Integer.parseInt(scanner.nextLine());
        int kgHrana = Integer.parseInt(scanner.nextLine());
        double dogHrana = Double.parseDouble(scanner.nextLine());
        double catHrana = Double.parseDouble(scanner.nextLine());
        double kustenurkaHranaGram = Double.parseDouble(scanner.nextLine());

        double dog = days*dogHrana;
        double cat = catHrana*days;
        double kustinurka = days * kustenurkaHranaGram/1000;
        double hrana = dog+cat+kustinurka;
        double difference = Math.abs(kgHrana-hrana);

        if (kgHrana>=hrana){
            System.out.printf("%.0f kilos of food left.",Math.floor(difference));
        } else {
            System.out.printf("%.0f more kilos of food are needed.",Math.ceil(difference));
        }


    }
}
