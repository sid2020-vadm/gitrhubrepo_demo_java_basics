package day12_Method_overloading_and_constructor_overloading;

public class OverloadMainMethod {
    void main(int a){
        System.out.println(a);
    }
    void main(int a,int b){
        System.out.println(a+b);
    }

    public static void main(String [] args){
        OverloadMainMethod ov = new OverloadMainMethod();
        ov.main(100);
        ov.main(100,200);
    }
}
