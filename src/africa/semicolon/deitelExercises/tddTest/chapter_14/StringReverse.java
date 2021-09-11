package africa.semicolon.deitelExercises.tddTest.chapter_14;

public class StringReverse {
    public static void main(String[] args) {
        String x = "68573565 432+";
        //int count = 0;
        for(int i=x.length()-1; i>=0; i--){
            System.out.printf("%c", x.charAt(i));
            if(i<8 && ((i+1)%3==0))
                    System.out.print(" ");
            //System.out.printf("%c", x.charAt(i));
        }
    }

}
