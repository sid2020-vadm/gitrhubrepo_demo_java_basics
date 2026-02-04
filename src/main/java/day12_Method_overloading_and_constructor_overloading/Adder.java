package day12_Method_overloading_and_constructor_overloading;

public class Adder {
    int a=10, b=20;
    void sum(){
        System.out.println((a+b));
    }
    void sum(int x, int y){
        System.out.println((x+y));
    }
    void sum(int x, double y){
        System.out.println((x+y));
    }
    void sum(double x, double y){
        System.out.println((x+y));
    }
}
