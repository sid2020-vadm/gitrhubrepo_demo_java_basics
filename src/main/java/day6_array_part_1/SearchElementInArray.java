package day6_array_part_1;

import java.util.Scanner;

public class SearchElementInArray {
    public static void main(String[] args){
        int a[]={10,20,30,40,50};
        System.out.println("enter search number ");
        Scanner sc= new Scanner(System.in);
        int search_num = sc.nextInt();
        boolean status = false;
        for(int x:a){
            if(search_num==x){
                System.out.println("match found "+search_num );
                status = true;
                break;
            }
        }
        if(status==false){
            System.out.println("number not found "+search_num);
        }

    }
}
