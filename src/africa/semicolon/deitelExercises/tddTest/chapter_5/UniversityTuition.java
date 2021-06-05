package africa.semicolon.deitelExercises.tddTest.chapter_5;
/*
(Financial application: compute future tuition) Suppose
that the tuition for a university is $10,000 this year
and increases 5% every year. In one year, the tuition
will be $10,500. Write a program that computes the tuition in ten years and the
total cost of four years’ worth of tuition after the tenth year.
 */
public class UniversityTuition {
    public static void useForLoop(){
        double tuition = 10000;
        int noOfYear = 1;
        double sum = 0;
        double tuitionAfterTenYears = 0;
        for(noOfYear=1;noOfYear<=14; noOfYear++ ){
            tuition = 0.05 *tuition +tuition;
            if(noOfYear ==10)
                tuitionAfterTenYears = tuition;
            if(noOfYear > 10)
                sum+=tuition;
        }
        System.out.println("Tuition after 10 years = "+tuitionAfterTenYears);
        System.out.println("Total tuition from 11 years to 14 years " +sum);
    }
    public static void useWhileLoop(){
        double tuition = 10000;
        int noOfYear = 1;
        double sum = 0;
        double tuitionAfterTenYears = 0;
        while(noOfYear <=14){
            tuition = ((5*tuition)/100) +tuition;
            if(noOfYear ==10)
                tuitionAfterTenYears = tuition;
            if(noOfYear >10)
                sum+=tuition;
            noOfYear++;
        }
        System.out.println("Tuition after 10 years = "+tuitionAfterTenYears);
        System.out.println("Total tuition from 11 years to 14 years " +sum);
    }
        public static double determineTuitionOverTime(int numberOfYears, double tuition, int rate){
        double tuitionAfterTheNumberOfyear = tuition * Math.pow((1 +(rate*1.0/100)),numberOfYears);
        return tuitionAfterTheNumberOfyear;
    }
        public static double determineTotalTuitionOverARangeOfTime(int numberOfYear, double tuitionOfStartingYear, double tuitionOfLastYear){
            double totalTuition = numberOfYear*1.0/2 *(tuitionOfStartingYear + tuitionOfLastYear);
            return totalTuition;
        }
        public static void main(String[] args) {
        double tuitionAfter10years = determineTuitionOverTime(10,10000,5);
        double tuitionAfter11Years = determineTuitionOverTime(11, 10000, 5);
        double tuitionAfter14Years = determineTuitionOverTime(14, 10000, 5);
            System.out.println("Tuition after 10 years = "+tuitionAfter10years);
            System.out.println("Total tuition of 4 years after 10th year to 14th year = "+determineTotalTuitionOverARangeOfTime(4,tuitionAfter11Years,tuitionAfter14Years));
        useWhileLoop();;
        useForLoop();
    }

}
