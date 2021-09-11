package africa.semicolon.deitelExercises.tddTest.chapter_7;

import java.util.ArrayList;

public class AirlineReservationSystem {



    private ArrayList<Integer>firstClass;
       private  ArrayList<Integer>economy;
       public AirlineReservationSystem(){
           firstClass = new ArrayList<>();
           economy = new ArrayList<>();
       }
    public void addFirstClassSeat(int seat) {
        if(!firstClass.contains(seat)) {
            if (firstClass.size() <= 4)
                if(seat >0 && seat<=5)
                firstClass.add(seat);
        }
    }

    public void addEconomySeat(int seat) {
        if(economy.size() <=4){
            if(!economy.contains(seat)){
               if(seat >5 && seat <=10)
                   economy.add(seat);
            }
        }
    }
    public ArrayList<Integer> getFirstClass() {
        return firstClass;
    }

    public ArrayList<Integer> getEconomy() {
        return economy;
    }
}
