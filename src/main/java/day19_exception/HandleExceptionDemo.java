package day19_exception;

import java.util.Scanner;

public class HandleExceptionDemo {
    public static void main(String[] args){
        System.out.println("program started...");
        Scanner sc = new Scanner(System.in);

//        example1
//        System.out.println("enter a number");
//        int a =sc.nextInt();
//        try{
//            System.out.println("devision "+(100/a));
//        }
//        catch (ArithmeticException e){
//            System.out.println("invalid data provided ");
//            System.out.println(e.getMessage());
//        }

//              Example2
        int[] a= new int[5];
        System.out.println("enter the position (0-4): ");
        int pos = sc.nextInt();
        System.out.println("enter the value :");
        int val = sc.nextInt();

        try{
            a[pos]=val;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("invalid position");
            System.out.println(e.getMessage());
        }
        System.out.println(a[pos]);

        System.out.println("program is completed....");
        sc.close();

    }
}
