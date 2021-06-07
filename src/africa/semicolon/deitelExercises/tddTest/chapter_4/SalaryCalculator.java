package africa.semicolon.deitelExercises.tddTest.chapter_4;

public class SalaryCalculator {
    public static final int OFFICIAL_HOUR = 40;
    private String name;
    private int hourlySalary;
    private int hoursWorked;

    public SalaryCalculator(String name) {
        this.name = name;
    }

    public void setHourlysalary(int hourlysalary) {
        if(hourlysalary >0)
        this.hourlySalary = hourlysalary;
        else
            System.out.println("Invalid Amount");
    }

    public int getHourlySalary() {
        return hourlySalary;
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

    public double getGrossPay(String payType) {
        if(payType.equalsIgnoreCase("official"))
           return officialHourPay();
        if (payType.equalsIgnoreCase("overtime"))
            return officialAndExtraHoursGrossPay()+ officialHourPay();
        else{
            System.out.println("Pay time not indicated");return 0;}
    }

    private double officialAndExtraHoursGrossPay() {
        int overTime = hoursWorked - OFFICIAL_HOUR;
        return (overTime * hourlySalary)/1.5;
    }

    private double officialHourPay() {
        int ordinaryHour = hoursWorked;
        if(ordinaryHour> OFFICIAL_HOUR)
            ordinaryHour = OFFICIAL_HOUR;
        int hour = 1;
        //double salary = hourlySalary;
        while(hour <=ordinaryHour) {
            hourlySalary+=hourlySalary;
            hour++;
        }
        return hourlySalary;
    }
}
