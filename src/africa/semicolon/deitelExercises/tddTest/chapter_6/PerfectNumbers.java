package africa.semicolon.deitelExercises.tddTest.chapter_6;

public class PerfectNumbers {

    public static String findFactors(int integer, int divisor) {
        String factors = "1,";
        //int divisor = 2;
        while (integer >1){
            if(integer % divisor == 0){
                factors += divisor+",";
                integer = integer / divisor;
            }
            else
                divisor++;
        }
        factors = factors.substring(0, factors.length()-1);
        return factors;

    }

    public static boolean isPerfect(int number,int divisor) {
        int numberStore = number;
        boolean isPerfect = false;
        int factor = 1;
        while (number >1){
            if(number % divisor == 0){
                factor += divisor;
                number = number / divisor;
            }
            else divisor++;
        }
        if(numberStore == factor)
            isPerfect = true;
        return isPerfect;
    }

    public static String printHeader() {
        String header = """
        Number                  Factors                 IsPerfectNumber?                
                """;
    return header;
    }
    public static String generateTable(int number){
        String table = """
        %d                      %20s%20b
                """.formatted(number, findFactors(number,2), isPerfect(number, 2));
        return table;
    }

    public static void main(String[] args) {
        System.out.println(printHeader());
        for(int i=2; i<=1000; i++){
            System.out.println(generateTable(i));
        }
    }
}
