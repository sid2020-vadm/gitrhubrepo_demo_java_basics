package day3_operators;

public class IncrementOperator {
    public static void main(String[] args){
//        4) Increment & Decrement operators  ++  --
        int a=10;
//        a=a+1;
        a+=1;
        System.out.println(a);
        int res= a++; // post increment
        System.out.println(res);
        int res1=++a; // pre increment
        System.out.println(res1);
        a++;
        System.out.println(a);
        ++a;
        System.out.println(a);
        int res3= a--; // post decrement
        System.out.println(res3);
        int res4=--a; // pre decrement
        System.out.println(res1);

    }
}
