package day12_Method_overloading_and_constructor_overloading;

public class AdderMain {
    public static void main(String[] args){
        Adder adder = new Adder();
        adder.sum();
        adder.sum(2,3);
        adder.sum(2,3.3);
        adder.sum(3.3,2.2);
    }
}
