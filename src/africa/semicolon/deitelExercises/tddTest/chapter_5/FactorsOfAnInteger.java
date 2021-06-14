package africa.semicolon.deitelExercises.tddTest.chapter_5;

public class FactorsOfAnInteger {
    /*
    Define as the sum of the factorials of the digits of . For example,

.

Define
as the sum of the digits of . So

.

Define
to be the smallest positive integer such that . Though is , is also , and it can be verified that is

.

Define
as the sum of the digits of . So

.

Further, it can be verified that
is and is

.

What is
? As the number can be large, print it modulo

.

Input Format

The first line of each test file contains a single integer
, which is the number of queries per test file. lines follow, each containing two integers separated by a single space: and

of the corresponding query.

Constraints

Output Format

Print exactly

lines, each containing a single integer, which is the answer to the corresponding query.

Sample Input 0

2
3 1000000
20 1000000

Sample Output 0

8
156

     */
   // public static String useRecursion(){

    //}
    public  static String printFactors(int integer){
        String factors = "";
        int divisor = 2;
        while (integer >1){
            if(integer % divisor == 0){
                factors += divisor+" ";
                integer = integer / divisor;
            }
            else
                divisor++;
        }
        return factors;
    }
    public static void main(String[] args) {
        System.out.println( printFactors(120));
    }
}
