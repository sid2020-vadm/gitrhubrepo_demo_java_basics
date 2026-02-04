package day7_String_part1;

import java.util.Arrays;

public class ObjectTypeArray {
    public static void main(String[] args){
        Object a[] = new Object[5];
        a[0]=11;
        a[1]="sid";
        a[2]=234;
        a[3]="amit";
        a[4]='A';
        System.out.println(Arrays.toString(a));

        for(Object x:a){
            System.out.println(x);
        }
    }
}
