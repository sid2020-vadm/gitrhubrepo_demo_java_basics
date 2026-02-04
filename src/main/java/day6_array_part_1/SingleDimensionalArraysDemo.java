package day6_array_part_1;

import java.util.Arrays;

/*
1. declare an array
2. add values into an array
3. find size of an array
4. read single value from an array
5. read multiple values from an array
 */
public class SingleDimensionalArraysDemo {
    public static void main(String[] args){
//        int x[] ={1,2,3,4,5,6,7,8,9,10};
//        for (int i=0;i<x.length;i++){
//            System.out.println(x[i]);
//        }

//        int a[] = new int[5]; // declaration ,array of size 5
//       a[0] =2; // assignment
//       a[1] =3;
//       a[2]=4;
//       a[3]=6;
//       a[4]=23;
//        int []a = new int[5];

        int c[] = {2,3,4,5,2,3}; // declaration and assignment in single line
//        System.out.println(c.length);
//        System.out.println(Arrays.toString(c)); // print all values from array [2, 3, 4, 5, 2, 3]
//      using for each loop
        for(int x :c){
            System.out.println(x);
        }


    }
}
