package L07_Nested_Loops;//6. Сграда
//Напишете програма, която извежда на конзолата номерата на стаите в една сграда (в низходящ ред), като са
//изпълнени следните условия:
//На всеки четен етаж има само офиси
//На всеки нечетен етаж има само апартаменти
//Всеки апартамент се означава по следния начин : А{номер на етажа){номер на апартамента), номерата на апартаментите започват от 0.
//Всеки офис се означава по следния начин: О(номер на етажа}{номер на офиса), номерата на
//офисите също започват от 0.

import java.util.Scanner;

public class p6_VLOJEN_Сграда {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //етажите от последния към първия
        // за всеки един етаж -> стаите от 0 до последната
     int flours = Integer.parseInt(scanner.nextLine());
     int rooms = Integer.parseInt(scanner.nextLine());

        for (int flour = flours; flour >=1; flour--) {
            for (int room = 0; room < rooms ; room++) {
                // буква за типа на стаята - етаж -номер на стая
                if (flour == flours  ) {
                    System.out.printf("L%d%d ",flour,room);
                } else if (flour %2 == 1){
                    System.out.printf("A%d%d ",flour,room);

                } else if (flour %2 == 0){
                    System.out.printf("O%d%d ",flour,room);
            }
        } System.out.println(); // печата всеки етаж на нов ред

    }
}}
