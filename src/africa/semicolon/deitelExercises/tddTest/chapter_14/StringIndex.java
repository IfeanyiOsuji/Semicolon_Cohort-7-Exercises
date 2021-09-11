package africa.semicolon.deitelExercises.tddTest.chapter_14;

public class StringIndex {
    public static int returnIndexOf(String sentence, String word){
        for(int i=0; i<sentence.length(); i++){
            if(i < sentence.length() - word.length()-2){
                if(sentence.substring(i, word.length()).equals(word))
                    return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(returnIndexOf("I am cooking and coming home", "coming"));
    }
}
