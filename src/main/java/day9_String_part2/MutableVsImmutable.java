package day9_String_part2;

import java.util.Arrays;

public class MutableVsImmutable {
    public static void main(String[] args){
        int[] a ={20,30,50,10};

        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

    }
}
