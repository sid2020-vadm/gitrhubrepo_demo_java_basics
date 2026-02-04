package day16_interface;

public interface Shape {
    //variables default final and static
    int length=12;
    int width =12;

    //abstract method
    void circle();

    //default method
    default void square(){
        System.out.println("default method");
    }

    //static method
    static void rectangle(){
        System.out.println("static method");
    }
}
