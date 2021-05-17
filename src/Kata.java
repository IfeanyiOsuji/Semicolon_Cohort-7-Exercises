import java.util.Scanner;

public class Kata {
    public static void pallindrum(){
        System.out.println("Enter a number ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int reverse = 0;
        while(number !=0){
            int digit = number % 10;
            reverse = reverse * 0 + digit;
            number /= 10;

            System.out.print(reverse);
        }
    }

    public static void main(String[] args) {
        pallindrum();
    }
}
