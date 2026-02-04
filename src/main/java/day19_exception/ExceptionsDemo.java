package day19_exception;

import java.util.Scanner;

public class ExceptionsDemo {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("program started...");
//        example1
//        System.out.println("enter a number");
//        int a =sc.nextInt();
//        System.out.println("devision "+(100/a));

//        Example2
//        int[] a= new int[5];
//        System.out.println("enter the position (0-4): ");
//        int pos = sc.nextInt();
//        System.out.println("enter the value :");
//        int val = sc.nextInt();
//        a[pos]=val;
//        System.out.println(a[pos]);

//        Example3
//        String s="12345";
//        String s ="welcome";
//        int x = Integer.parseInt(s); // Number Format Exception
//        System.out.println(x);

//        example4
        String s=null;
        System.out.println(s.length()); // Null pointer exception



        System.out.println("program completed");
        sc.close();
    }

}
