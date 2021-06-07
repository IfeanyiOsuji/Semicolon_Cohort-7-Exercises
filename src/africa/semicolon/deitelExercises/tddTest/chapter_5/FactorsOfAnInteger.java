package africa.semicolon.deitelExercises.tddTest.chapter_5;

public class FactorsOfAnInteger {
    public static void printFactors(int integer){
        int divisor = 2;
        while (integer >0){
            if(integer % divisor == 0){
                System.out.print(divisor + " ");
                integer = integer / divisor;
            }
            else
                divisor++;
        }
    }
    public static void main(String[] args) {
        printFactors(120);
    }
}
