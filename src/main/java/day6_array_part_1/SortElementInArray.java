package day6_array_part_1;

import java.util.Arrays;

public class SortElementInArray {
    public static void main(String[] args){
        int a[] ={12,1,34,2,99,23};
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
