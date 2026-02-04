package day12_Method_overloading_and_constructor_overloading;

public class CallByReference {
    public static void main(String[] args){
        Test t = new Test();
        t.number=100;
        System.out.println(t.number); //100
        t.m2(t);                     //110
        System.out.println(t.number); //110
    }
}
