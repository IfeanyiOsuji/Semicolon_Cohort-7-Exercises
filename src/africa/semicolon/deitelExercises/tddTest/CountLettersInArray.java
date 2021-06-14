package africa.semicolon.deitelExercises.tddTest;

public class CountLettersInArray {
    public static void main(String[] args) {
        char [] chars = createArray();

        displayArray(chars);
        countChars(chars);

        int [] count = countChars(chars);
        displayCount(count);
    }

    private static void displayCount(int[] count) {
        for(int i=0; i<count.length; i++ ){
            if((1 + i) % 10 ==0){
                System.out.println(count[i] + " "+ (char)(i +'a'));
            }
            else
                System.out.print(count[i] + " "+ (char)(i +'a') +" ");
        }
    }

    private static int[] countChars(char[] chars) {
        int [] count = new int[26];
        for(int i=0; i<chars.length; i++)
            count[chars[i] - 'a']++;
        return count;
    }

    private static void displayArray(char[] chars) {
        for (int i=0; i<chars.length; i++){
            if((i+1) % 20 ==0)
                System.out.println(chars[i]);
            else System.out.print(chars[i]);
        }
    }

    private static char[] createArray() {
        char [] chars = new char[100];
        for(int i=0; i< chars.length; i++)
            chars[i] = GeneratingRandomCharacters.generateRandomLowerCaseLetters();
        return chars;
    }
}
