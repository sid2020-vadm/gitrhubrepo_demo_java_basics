package day13_encapsulation_setters_getters_static_keyword;

public class StaticDemo {
    static int a=10;
    int b =20;
    static void m1(){
        System.out.println("this is m1  static method");
    }
    void  m2(){
        System.out.println("this is m2 not static method");
    }
//    non-static
    void m(){
        System.out.println(a);
        System.out.println(b);
        m1();
        m2();
    }
//    public static void main(String[] args){
//    System.out.println(a);
//    m1();
////    System.out.println(b); //error because b is non-static
////    m2(); // error because m2 is non-static
//
//        StaticDemo staticDemo = new StaticDemo();
//        staticDemo.m2();
//        System.out.println(staticDemo.b);
//        staticDemo.m();
//    }
}
