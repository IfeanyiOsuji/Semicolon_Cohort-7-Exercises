package africa.semicolon.deitelExercises.tddTest;
/*
A character is coded using an integer. To generate a random character is to generate an integer.
Every character has a unique unicode between 0 and FFFF in hexadecimal and between 0 and 65535 in decimal.
To generate a random character is to generate a random integer between 0 and 65535 using the following expression

(int)(Math.random() * (65535 + 1)); 1 is added since 0<=Math.random() < 1;
    a random number between cha a and cha z is
    'a' + Math.random() * ('z' - 'a' +1))
    a random integer between char a and z is
    char('a' + Math.random() * (z - a + 1))

    A random integer between char a and char z is
    int((int) 'a' + Math.random() * ((int)'z' -(int)'a' + 1));
 */
public class GeneratingRandomCharacters {
    public static int generateRandomCharactersBetween0And65535(int firstNumber, int secondnumber){
      int charSymbol =  (int)( firstNumber + Math.random() * (secondnumber - firstNumber +1));
      return charSymbol;
    }
    public static char generateRandomCharacters(char firstChar, char secondChar){
        char symbol = (char)(firstChar + Math.random() *(secondChar -firstChar +1));
        return symbol;
    }
    public static char generateRandomLowerCaseLetters(){
        return generateRandomCharacters('a', 'z');
    }
    public static char generateRandomUpperCaseLetter(){
        return generateRandomCharacters('A', 'Z');
    }
    public static char getRandomCharacter(){
        return generateRandomCharacters('\u0000', '\uFFFF');
    }

    public static void main(String[] args) {
        System.out.println((int)((int)'a' + Math.random() *((int)'z' - (int)'a' +1)));
    }
}
