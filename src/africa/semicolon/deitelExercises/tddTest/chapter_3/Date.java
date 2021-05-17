package africa.semicolon.deitelExercises.tddTest.chapter_3;

public class Date {
    private  int day;
    private  int year;
    private  int month;

    public Date(int month, int day, int year) {
        if (month > 0 && month < 13)
        this.month = month;
        else
            System.out.println("Invalid Month");
        if(((day >0 && day <32)
                &&((month==1||month==3||month==5||month==7||month==8||month==10||month==12)))
                ||((day >0 && day <31)&&((month==4||month==6||month==9||month==11)))
                ||((day >0 && day<29) && (month==2))) {
            this.day = day;
        }
        else
            System.out.println("Invalid Day");
       String validYear = Integer.toString(year);
        if(validYear.length() ==4)
        this.year = Integer.parseInt(validYear);
        else
            System.out.println("Invalid Year");
    }

    public void setMonth(int month) {
        if (month > 0 && month < 13)
            this.month = month;
        else
            System.out.println("Invalid Month");

    }

    public int getMonth() {
        return month;
    }

    public void setDay(int day) {
        if(((day >0 && day <32)
                &&((month==1||month==3||month==5||month==7||month==8||month==10||month==12)))
                ||((day >0 && day <31)&&((month==4||month==6||month==9||month==11)))
                ||((day >0 && day<29) && (month==2))) {
            this.day = day;
        }
        else
            System.out.println("Invalid Day");

    }

    public int getDay() {
        return day;
    }

    public void setYear(int year) {
        String validYear = Integer.toString(year);
        if(validYear.length() ==4)
            this.year = Integer.parseInt(validYear);
        else
            System.out.println("Invalid Year");

    }

    public int getYear() {
        return year;
    }

    public String displayDate() {
        if(month ==0 || day==0||year==0){
            return "";
        }
        else
            System.out.println(month +"/"+day+"/"+year);
            return month +"/"+day+"/"+year;
    }
}
