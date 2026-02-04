package day4_conditional_statements;

public class LargestOfThreeNumbers {
    public static void main(String[] args){
        int a=50, b=80, c=90;
        if(a>b && a>c){
            System.out.println("a is largest");
        } else if (b>a && b>c) {
            System.out.println("b is largest");
        }
        else {
            System.out.println("c is largest");
        }
    }
}
