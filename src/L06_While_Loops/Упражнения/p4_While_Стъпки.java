package L06_While_Loops.Упражнения;
/*
Габи иска да започне здравословен начин на живот и си е поставила за цел да върви 10 000 стъпки всеки ден.
Някои дни обаче е много уморена от работа и ще иска да се прибере преди да постигне целта си.
Напишете програма, която чете от конзолата по колко стъпки изминава тя всеки път
като излиза през деня и когато постигне целта си да се изписва "Goal reached! Good job!"
и колко стъпки повече е извървяла "{разликата между стъпките} steps over the goal!".
Ако иска да се прибере преди това, тя ще въведе командата "Going home" и ще въведе стъпките,
които е извървяла докато се прибира. След което, ако не е успяла да постигне целта си,
на конзолата трябва да се изпише: "{разликата между стъпките} more steps to reach goal."
*/




import java.util.Scanner;

public class p4_While_Стъпки {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*String command = scanner.nextLine();

        int target= 10000;
        int overTarget=0;
        int diff=0;
        int step=0;
        int stepSum=0;
        while (!(command.equals("Going home"))) {
            step = Integer.parseInt(command);
            stepSum+=step;
            overTarget = stepSum-target;

            if (stepSum>=target){
                System.out.println("Goal reached! Good job!");
                System.out.println(overTarget+" steps over the goal!");
                break;
            }
            command = scanner.nextLine();

        }  if (command.equals("Going home")){
            command = scanner.nextLine();
            int lastStep = Integer.parseInt(command);
            stepSum+=lastStep;
            if (stepSum>=target){
                overTarget = stepSum-target;
                System.out.println("Goal reached! Good job!");
                System.out.println(overTarget+" steps over the goal!");
            } else {
                diff = Math.abs(target - stepSum);
                System.out.println(diff+" more steps to reach goal.");
            }
        }
*/      int goal = 10000;
        int countAllSteps = 0;
        String command = scanner.nextLine();

        while (!command.equals("Going home")) {
            int steps = Integer.parseInt(command);
            countAllSteps += steps;
            if (countAllSteps >= goal) {
                System.out.printf("Goal reached! Good job!%n");
                System.out.printf("%d steps over the goal!", countAllSteps - goal);
                break;
            }
            command = scanner.nextLine();
        }

        if (command.equals("Going home")){
                int stepsHome = Integer.parseInt(scanner.nextLine());
                countAllSteps += stepsHome;
            }
        if (countAllSteps>=goal){
           int overTarget = countAllSteps-goal;
            System.out.println("Goal reached! Good job!");
            System.out.println(overTarget+" steps over the goal!");
        } else {
            int diff = Math.abs(goal - countAllSteps);
            System.out.println(diff+" more steps to reach goal.");
        }
        }
    }

