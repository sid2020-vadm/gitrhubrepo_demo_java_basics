package day12_Method_overloading_and_constructor_overloading;

public class Test {
    int number;
//    void m1(int number){
//        number+=10;
//        System.out.println("value in the method "+number);
//    }

    void m2(Test test){
        test.number+=10;
        System.out.println(test.number);
    }
}
