package africa.semicolon.deitelExercises.tddTest.chapter_6;

public class ParkingCharges {

    public static double calculateCharges(int hours) {
        double pay = 0;
        if(hours <= 3)
            pay = 2.00;
        if(hours == 24)
            pay = 10.00;
        else
            if(hours >3 && hours <24){

            }
            return pay;
    }
}
