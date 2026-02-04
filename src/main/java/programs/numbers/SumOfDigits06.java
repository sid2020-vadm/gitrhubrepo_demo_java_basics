package programs.numbers;

import java.util.Scanner;

public class SumOfDigits06 {
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);

       int num = sc.nextInt();

       int n = Math.abs(num); // handle negative numbers
       int sum = 0;

       while(n > 0){
           int digit = n%10;
           sum = sum+digit;
           n= n/10;
       }

       System.out.println("Sum of digits of " + num + " is: " + sum);
       sc.close();
   }
}
