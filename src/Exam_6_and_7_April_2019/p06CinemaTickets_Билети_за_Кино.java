package Exam_6_and_7_April_2019;

import java.util.Scanner;

public class p06CinemaTickets_Билети_за_Кино {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        String nameFilm = "";
        double ticket = 0;
        while (true) {
            nameFilm = command;
            int studentTicket = 0;
            int standardTicket = 0;
            int kidTicket = 0;
            int totalTicket = 0;
            double busy = 0;
            if (!command.equals("Finish")) {
                int places = Integer.parseInt(scanner.nextLine());
                for (int i = 1; i <= places; i++) {
                   command = scanner.nextLine();
                    if (command.equals("student")) {
                        studentTicket++;

                    } else if (command.equals("standard")) {
                        standardTicket++;

                    } else if (command.equals("kid")) {
                        kidTicket++;

                    } if (command.equals("End")) {
                        break;
                    }
                    ticket = kidTicket+studentTicket+standardTicket;

                }

                totalTicket +=ticket;
                busy = ticket/places*100;
                System.out.println(nameFilm+ " - " +busy+"% full.");

                command = scanner.nextLine();
                System.out.println(totalTicket);
            }


        }
    }

}