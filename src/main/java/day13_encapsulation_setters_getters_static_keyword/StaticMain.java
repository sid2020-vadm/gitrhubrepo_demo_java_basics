package day13_encapsulation_setters_getters_static_keyword;



public class StaticMain {
    public static void main(String [] args){
        System.out.println(StaticDemo.a); // access static variables and methods with class-name.variable-name
        StaticDemo.m1();
//    System.out.println(b); //error because b is non-static
//    m2(); // error because m2 is non-static

        StaticDemo staticDemo = new StaticDemo();
        staticDemo.m2();
        System.out.println(staticDemo.b);
        staticDemo.m();
    }
}
