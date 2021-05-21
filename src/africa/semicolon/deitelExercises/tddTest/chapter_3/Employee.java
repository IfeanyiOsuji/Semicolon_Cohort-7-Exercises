package africa.semicolon.deitelExercises.tddTest.chapter_3;

public class Employee {
    public static final int MINIMUM_ALLOWABLE_DEPOSIT = 0;
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        if(invoiceSalaryIsNotNegative(monthlySalary))
        this.monthlySalary += monthlySalary;
    }

    private boolean invoiceSalaryIsNotNegative(double monthlySalary) {
        return monthlySalary >= MINIMUM_ALLOWABLE_DEPOSIT;
    }

    public double getMonthlySalary() {
        return
                monthlySalary;
    }

    public double yearlySalary() {
        System.out.println(monthlySalary * 12);
        return  monthlySalary * 12;
    }

    public double percentageRaiseInSalary(double percentageRaise) {
          monthlySalary += (monthlySalary * percentageRaise)/100;
          return monthlySalary;
    }
}
