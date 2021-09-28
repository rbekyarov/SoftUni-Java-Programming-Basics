/*double quantity = Double.parseDouble(scanner.nextLine());
   String size = scanner.nextLine();
   String delivery = scanner.nextLine();
   double priceOneQuantity = 0;
   double price = 0;
   double totalPrice = 0;
   if (quantity<10){
       System.out.println("Invalid order");
       return;
   }

   if (size.equals("90X130")) {
       priceOneQuantity = 110;
       price = priceOneQuantity*quantity;
       if (quantity >= 30 && quantity <60) {
           totalPrice = price - price * 0.05;
       }else if (quantity >= 60) {
           totalPrice = price - price * 0.08;
       } else{
           totalPrice = price;
       }
   }
   if (size.equals("100X150")) {
       priceOneQuantity = 140;
       price = priceOneQuantity*quantity;
       if (quantity >= 40 && quantity < 80) {
           totalPrice = price - price * 0.06;
       }else if (quantity >= 80) {
           totalPrice = price - price * 0.1;
       }else{
           totalPrice = price;
       }
   }
   if (size.equals("130X180")) {
       priceOneQuantity = 190;
       price = priceOneQuantity*quantity;
       if (quantity >= 20 && quantity <50) {
           totalPrice = price - price * 0.07;
       }else if (quantity >= 50) {
           totalPrice = price - price * 0.12;
       }else{
           totalPrice = price;
       }
   }
   if (size.equals("200X300")) {
       priceOneQuantity = 250;
       price = priceOneQuantity*quantity;
       if (quantity >= 25 && quantity < 50) {
           totalPrice = price - price * 0.09;
       }else if (quantity >= 50) {
           totalPrice = price - price * 0.14;
       }else{
           totalPrice = price;
       }
   }

   if (delivery.equals("With delivery")){
       totalPrice= totalPrice+60;
       if (quantity>99){
           totalPrice= totalPrice - totalPrice*0.04;
       }

   }
   System.out.printf("%.2f BGN",totalPrice);
*/

package Exam_18_and_19_July_2020;

import java.util.Scanner;

public class p03AluminumJoinery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int numberOfDogrami = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String wayOfDelivery = scanner.nextLine();
        double pricePerNum = 0;
        double price = 0;

        switch (type) {
            case "90X130":
                pricePerNum = 110;
                price = numberOfDogrami * pricePerNum;
                if (numberOfDogrami >= 30 && numberOfDogrami < 60) {
                    price -= price * 0.05;
                } else if (numberOfDogrami >= 60) {
                    price -= price * 0.08;
                }
                break;

            case "100X150":
                pricePerNum = 140;
                price = numberOfDogrami * pricePerNum;
                if (numberOfDogrami >= 40 && numberOfDogrami < 80) {
                    price -= price * 0.06;
                } else if (numberOfDogrami >= 80) {
                    price -= price * 0.1;
                }
                break;

            case "130X180":
                pricePerNum = 190;
                price = numberOfDogrami * pricePerNum;
                if (numberOfDogrami > 20 && numberOfDogrami < 50) {
                    price -= price * 0.07;
                } else if (numberOfDogrami > 50) {
                    price -= price * 0.12;
                }
                break;

            case "200X300":
                pricePerNum = 250;
                price = numberOfDogrami * pricePerNum;
                if (numberOfDogrami > 25 && numberOfDogrami < 50) {
                    price -= price * 0.09;
                } else if (numberOfDogrami > 50) {
                    price -= price * 0.14;
                }
                break;
        }
        if (wayOfDelivery.equals("With delivery")) {
            price += 60;
        }
        if (numberOfDogrami < 10) {
            System.out.println("Invalid order");
            return;
        } else if (numberOfDogrami > 99) {
            price -= price * 0.04;
        }


        System.out.printf("%.2f BGN", price);
    }
}
