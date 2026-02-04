package programs.numbers;

import java.util.Scanner;

public class Fibonacci02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the maximum number for Fibonacci series: ");
        int max = sc.nextInt();

        int a = 0;
        int b = 1;

        System.out.println("Fibonacci series up to " + max + ":");
        System.out.print(a + " " + b + " ");
        int next = a+b;
        while (next<max){
            System.out.println(next);
            a=b;
            b=next;
            next=a+b;
        }
        sc.close();
    }
}
