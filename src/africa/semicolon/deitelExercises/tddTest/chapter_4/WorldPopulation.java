package africa.semicolon.deitelExercises.tddTest.chapter_4;

public class WorldPopulation {
    /*
    7,794,798,739 for 2020
2021

7,874,965,825

1.03%
 */
    public static void main(String[] args) {
        double rateOfGrowth = 1.03;
        double currentPopulation = 7874965825.0;
        double previousPopulation = 7794798739.0;
        int year = 75;
        int yearOfDoublePopulation = 0;
        String heading = """
     Year       Expected population         Numerical increase
                """;
        System.out.println(heading);
        for(int i=1; i<=75; i++){
            double expectedpopulation = currentPopulation + currentPopulation *rateOfGrowth/100;
            System.out.printf("%d\t\t\t%.4f\t\t\t\t%.4f\n", i,expectedpopulation,expectedpopulation-previousPopulation);
            if(expectedpopulation == 2* currentPopulation)
                yearOfDoublePopulation = i;
            previousPopulation = currentPopulation;
            currentPopulation = expectedpopulation;
        }
        System.out.println("Year of double population of our current population = "+yearOfDoublePopulation);
    }

}
