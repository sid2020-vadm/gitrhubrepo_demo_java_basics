package programs.numbers;

import java.util.Scanner;

public class ReverseNumber07 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int n = Math.abs(num); // handle negative numbers
        int reversed = 0;
        while (n > 0) {
            int digit = n % 10;           // get last digit
            reversed = reversed * 10 + digit; // build reversed number
            n = n / 10;                   // remove last digit
        }
        System.out.println(reversed);
    }
}
