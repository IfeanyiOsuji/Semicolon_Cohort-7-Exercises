package africa.semicolon.deitelExercises.tddTest;

import java.util.Scanner;

public class Kata {
    public static void pallindrum(){
        System.out.println("Enter a number ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int pal = number + 0;
        int reverse = 0;
        while(number !=0){
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
        System.out.println(pal);
        if(reverse == pal)
            System.out.println("Number is Pallindrum");
    }


    public static void main(String[] args) {

        pallindrum();
    }

    public int determinePriceByQuantity(int quantity) {
        //double price = 0;
        if(quantity >= 200)
            return 800 * quantity;
            else
            if(quantity >= 100)
               return 900 * quantity;
            else
            if(quantity >= 50)
                return 1000 * quantity;
            else
             if(quantity >= 30)
                 return 1100 * quantity;
            else
              if(quantity >= 10)
                 return 1200 * quantity;
            else
              if(quantity >= 5)
                  return 1400 * quantity;
            else
              if(quantity >= 1)
                  return 1500 * quantity;
            else
                return 0;

          // return 0;
    }
}
