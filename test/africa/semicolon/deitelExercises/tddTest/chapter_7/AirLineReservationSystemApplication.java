package africa.semicolon.deitelExercises.tddTest.chapter_7;

import java.util.Arrays;
import java.util.Scanner;

public class AirLineReservationSystemApplication {
    static boolean [] isOccupied = new boolean[10];

    public static  int count = 0;
    public static void main(String[] args) {
        AirlineReservationSystem system = new AirlineReservationSystem();
        String info = """
        Please type 1 for First Class
                and 2 for Economy 
                """;

        Scanner input = new Scanner(System.in);
        Scanner secondInput = new Scanner(System.in);


        while(true){
            System.out.println("Number of seats taken is "+ count);
            if(count == 10) {
                System.out.println("All seats are taken " + Arrays.toString(isOccupied));
                break;
            }
            System.out.println(info);
            int choice = input.nextInt();
            if(choice == 1) {
                if(system.getFirstClass().size()==5){
                    System.out.println("First Class seat is occupied \n Will you accept to be placed in the Economy Section? ");
                    System.out.println("Reply Y for yes and N for No");
                    String reply = secondInput.nextLine();
                    if(reply.equalsIgnoreCase("y"))
                        fillEconomySeat(system, count);
                    else
                    { System.out.println("Next flight leaves in 3 hours");}
                }
                else
                fillFirstClassSeat(system, count);


            }
            if(choice == 2){
                if(system.getEconomy().size()==5){
                    System.out.println("Economy seat is occupied \n Will you accept to be placed in the First-Class Section? ");
                    System.out.println("Reply Y for yes and N for No");
                    String reply = secondInput.nextLine();
                    if(reply.equalsIgnoreCase("y"))
                        fillFirstClassSeat(system, count);
                    else {
                        System.out.println("Next flight leaves in 3 hours");
                    }
                }
                else
                fillEconomySeat(system, count);
            }
        }

    }

    private static void fillFirstClassSeat(AirlineReservationSystem system, int countSeat) {

        Scanner input = new Scanner(System.in);
        if((system.getFirstClass().size() <=4)) {
            System.out.println("Choosing a seat.......");
                int seat = input.nextInt();
            if(!system.getFirstClass().contains(seat)) {
                system.addFirstClassSeat(seat);
                count = countSeat;
                if(seat >0 && seat <=5) {
                    isOccupied[count] = true;
                    ++count;
                }
            }
            else
                System.out.println("Seat has been taken");
        }
        System.out.println(system.getFirstClass().toString());

    }

    private static void fillEconomySeat(AirlineReservationSystem system, int countSeat) {

        Scanner input = new Scanner(System.in);
        if(system.getEconomy().size() <= 4) {
            System.out.println("Choosing a seat.......");
            int seat = input.nextInt();
            if(!system.getEconomy().contains(seat)) {
                system.addEconomySeat(seat);
                count = countSeat;
                if(seat >5 && seat <=10) {
                    isOccupied[count] = true;
                    ++count;
                }
            }
            else
                System.out.println("Seat has been taken");
        }
        System.out.println(system.getEconomy().toString());
    }
}
