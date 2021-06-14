package africa.semicolon.deitelExercises.tddTest;

import africa.semicolon.deitelExercises.tddTest.chapter_3.Date;

import java.util.Scanner;

public class Calender {
    public static void main(String[] args) {
        System.out.print("Enter full year (e.g..2012): ");
        Scanner dateInput = new Scanner(System.in);
        int year = dateInput.nextInt();

        System.out.print("Enter month as a number between 1 and 12 ");
        int month = dateInput.nextInt();

        printMonth(year, month);
        printMonthBody(year, month);
    }

    private static void printMonth(int year, int month) {
        printMonthTitle(year, month);
    }

    private static void printMonthTitle(int year, int month) {
        System.out.println("        "+getMonthName(month)+" "+year);
        System.out.println("------------------------------");
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
    }

    public static void printMonthBody(int year, int month) {
        int startDay = getStartDay(year, month);
        int numberOfDaysInMonth = getNumberOfDaysInMonth(year, month);
        // pad space before the first day in month;
        int i=0;
        for(i=0; i<startDay; i++)
            System.out.print("    ");
        for(i=1; i<=numberOfDaysInMonth; i++){
            System.out.printf("%4d", i);
            if((i+startDay) % 7 == 0)
                System.out.println();
        }
        System.out.println();
    }

    public static String getMonthName(int month) {
        String monthName ="";
        switch (month){
            case 1 -> monthName = "January";
            case 2 -> monthName = "February";
            case 3 -> monthName = "March";
            case 4 -> monthName = "April";
            case 5 -> monthName = "May";
            case 6 -> monthName = "June";
            case 7 -> monthName = "July";
            case 8 -> monthName = "August";
            case 9 -> monthName = "September";
            case 10 -> monthName = "October";
            case 11 -> monthName = "November";
            case 12 -> monthName = "December";
            default -> monthName = "Invalid month";
        }
        return monthName;

    }

    public static int getNumberOfDaysInMonth(int year, int month) {
        if(month==1 || month ==3||month==5||month==7||month==8||month==10||month==12)
            return 31;
        if(month==4||month==6||month==9||month==11)
            return 30;
        if(month==2 && isLeapYear(year))
            return 29;
        else return 28;

    }
    private static boolean isLeapYear(int year) {
        return year % 400==0 || (year % 4==0 && year%100 !=0);
    }

    public static int getTotalNumberOfDaysFrom1800(int year, int month) {
        int total = 0;
        for(int i=1800; i<year; i++) {
            if (isLeapYear(i))
                total += 366;
            else total += 365;
        }
        for(int i=1; i<month; i++)
            total += getNumberOfDaysInMonth(year, i);
        return total;
    }

    public  static int  getStartDay(int year, int month) {
        final int START_DAY_FOR_JAN_1800 = 3;
        int totalNumberOfDays = getTotalNumberOfDaysFrom1800(year, month);
        return (totalNumberOfDays +START_DAY_FOR_JAN_1800) %7;
    }
}
