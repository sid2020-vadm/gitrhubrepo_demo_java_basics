package day6_array_part_1;

import java.util.Scanner;

public class MulitpleInputDemo {
    public static void main(String[] args){
        System.out.println("enter first number ");
        Scanner sc1  = new Scanner(System.in);
        int num1 = sc1.nextInt();
        System.out.println("enter second number ");
        Scanner sc2 = new Scanner(System.in);
        int num2 = sc2.nextInt();

        System.out.println("addition "+(num1+num2));

    }
}
