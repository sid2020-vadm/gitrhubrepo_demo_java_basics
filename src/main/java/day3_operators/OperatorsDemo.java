package day3_operators;

public class OperatorsDemo {
    public static void main(String[] args){
        double a =60,b=30;
        System.out.println("sum of a and b is "+(a+b));
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
//        Relational / compariosn operators >  >=  <  <=  !=  ==

        System.out.println(a>b); // o/p is true
        System.out.println(a<b); // o/p is false
        System.out.println(a>=b); // o/p is true
        System.out.println(a<=b); // o/p is false
        System.out.println(a!=b); // o/p is true
        System.out.println(a==b); // o/p is false

        boolean b1= 10>20;
        System.out.println("b1 is "+b1);

        boolean b2= 20>10;
        System.out.println("b2 is "+b2);

        System.out.println( b1 && b2);
        System.out.println( b1 || b2);
        System.out.println((30>20) && (20>10));

        System.out.println((30>20) && (20<10));


//4) Increment & Decrement operators  ++  --



    }
}
