package day12_Method_overloading_and_constructor_overloading;

public class CallByValue {
    public static void main(String[] args){
        Test t = new Test();
//        pass copy of the variable
        int num = 100;
        System.out.println(num); //100
//       t.m1(num);             //110
        System.out.println(num); //100
    }
}
