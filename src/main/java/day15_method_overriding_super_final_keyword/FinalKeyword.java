package day15_method_overriding_super_final_keyword;

public class FinalKeyword {
    public static void main(String[] args){
        Test test = new Test();
//        test.x =200; // 'x' is final variable, cannot change value of 'x'
        System.out.println(test.x);
    }

}
