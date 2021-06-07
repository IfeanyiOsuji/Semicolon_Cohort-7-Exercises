package africa.semicolon.deitelExercises.tddTest.chapter_4;

public class SalaryCalculator {
    public static final int OFFICIAL_HOUR = 40;
    private String name;
    private double salary;
    private int hoursWorked;

    public SalaryCalculator(String name) {
        this.name = name;
    }

    public void setHourlysalary(int hourlysalary) {
        if(hourlysalary >0)
        this.salary = hourlysalary;
        else
            System.out.println("Invalid Amount");
    }

    public double getHourlySalary() {
        return salary;
    }

    public void setNumberOfHoursWorked(int hours) {
        if(hours >0)
        this.hoursWorked = hours;
        else
            System.out.println("Invalid Time");
    }

    public int getHoursWorked() {
        return hoursWorked;
    }


    public double getGrossPay(int hours) {
                double payment =0;
                double overTimePayment = 0;
        for(int i=1;i<=hours; i++ ){
            if(i <=OFFICIAL_HOUR)
                payment = salary * i;
            else
                overTimePayment = salary * (i-OFFICIAL_HOUR)/1.5;
        }
        System.out.println(payment);
        System.out.println(overTimePayment);
        if(hours <=OFFICIAL_HOUR) {
            return payment;
        }
        else
            return payment + overTimePayment;
    }
}
