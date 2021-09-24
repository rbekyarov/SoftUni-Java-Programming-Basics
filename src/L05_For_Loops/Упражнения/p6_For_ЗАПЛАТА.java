package L05_For_Loops.Упражнения;

import java.util.Scanner;

public class p6_For_ЗАПЛАТА {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tabs = Integer.parseInt(scanner.nextLine());
        double salary = Double.parseDouble(scanner.nextLine());

        for (int tab=1;tab<=tabs;tab++) {
         String name_tab = scanner.nextLine();
            switch (name_tab) {
                case "Facebook":
                    salary = salary - 150;break;
                case "Instagram":
                    salary = salary - 100;break;
                case "Reddit" :
                    salary = salary - 50;break;
            }
            if (salary<=0){
                System.out.println("You have lost your salary.");
                break;
            }

        } if(salary>0) {
            System.out.printf("%.0f",salary);
        }
}
}
