package day6_array_part_1;

import java.util.Scanner;

public class DuplicatesInArray {
    public static void main(String[] args){
        int a[]={1,3,2,6,3,4};
        int count =0;
        System.out.println("enter number ");
        Scanner sc = new Scanner(System.in);
        int search_num=sc.nextInt();
        for(int x:a){
            if(search_num==x){
                count++;
            }
        }
        System.out.println(search_num+" repeated  for  "+count);
    }
}
