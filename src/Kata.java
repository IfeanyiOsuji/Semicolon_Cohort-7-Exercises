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
}
