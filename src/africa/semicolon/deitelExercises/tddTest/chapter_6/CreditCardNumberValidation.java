package africa.semicolon.deitelExercises.tddTest.chapter_6;

public class CreditCardNumberValidation {
    public static int getDigit(int number) {
        String numberString = Integer.toString(number);
        if(numberString.length() == 1)
            return number;
        else {
             return  convertNumber(number);
        }


    }

    private static int convertNumber(int number) {
        String numberString = Integer.toString(number);
        return (Integer.parseInt(numberString.substring(numberString.length()-1))+Integer.parseInt(numberString.substring(numberString.length()-2,numberString.length()-1)));
    }

    public static int getSize(long number) {
        return Long.toString(number).length();
    }

    public static int[] productOfSecondDigitsFromLeft(long numbers) {
        String numberString = Long.toString(numbers);
        int [] numbersProduct = new int[numberString.length()/2];
        String [] numberArray = numberString.split("");
        for(int i=numberArray.length-2, j=0; i>=0; i-=2,j++ ){
            int product = Integer.parseInt(numberArray[i]) *2;
            int digitSum = getDigit(product);
            numbersProduct[j] = digitSum;
        }
        return numbersProduct;

    }

    public static int sumOfDoubleEvenPlace(long number) {
        int [] products = productOfSecondDigitsFromLeft(number);
        int sum = 0;
        for(int i=0; i<products.length; i++)
            sum += products[i];
        return sum;
    }

    public static int sumOfOddPlace(long numbers) {
        int sum =0;
        String numberString = Long.toString(numbers);
        String [] numberArray = numberString.split("");
        for(int i = numberArray.length-1; i>0; i-=2){
            sum += Integer.parseInt(numberArray[i]);
        }
        return sum;
    }

    public static boolean prefixMatched(long number, int prefix) {
        String numberString = Long.toString(number);
        int oneDigitNumber = Integer.parseInt(numberString.substring(0,1));
         int twoDigitNumber  = Integer.parseInt(numberString.substring(0,2));
        if(oneDigitNumber == prefix) {
            System.out.println(oneDigitNumber);
            return true;
        }
        else if(twoDigitNumber == prefix) {
            System.out.println(twoDigitNumber);
            return true;
        }
        else
            return false;

    }

    public static int addOddAndEvenPlaces(long number) {
        return sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);
    }

    public static boolean isValid(long number) {
        if(isPrefix(number)) {
            int sum = addOddAndEvenPlaces(number);
            if (sum % 10 == 0)
                return true;
        }
        return false;
    }

    private static boolean isPrefix(long number) {
        String numberString = Long.toString(number);
        int oneDigitNumber = Integer.parseInt(numberString.substring(0,1));
        int twoDigitNumber  = Integer.parseInt(numberString.substring(0,2));
        if(oneDigitNumber == 4||oneDigitNumber ==5||oneDigitNumber==6) {
            System.out.println(oneDigitNumber);
            return true;
        }
        else if(twoDigitNumber == 37) {
            System.out.println(twoDigitNumber);
            return true;
        }
        else
            return false;
    }


    public static long getPrefix(long number, int position) {
        String numberString = Long.toString(number);
        if(numberString.length() < Integer.toString(position).length())
            return number;
        int oneDigitNumber = Integer.parseInt(numberString.substring(0,position));
            return oneDigitNumber;
    }
}
