package day16_interface;

public class InterfaecDemo implements Shape{

    public void circle() {
        System.out.println("circle");

    }

    void triangle(){
        System.out.println("triangle");
    }

    public static void main(String[] args){
//        scenario1
//        InterfaecDemo interfaecDemo = new InterfaecDemo();
//        interfaecDemo.circle(); //abstract method
//        interfaecDemo.triangle();
//        interfaecDemo.square(); //default method

//        Shape.rectangle(); //static method
//        System.out.println(Shape.length+Shape.width); //variables

//        scenario2
        Shape shape = new InterfaecDemo();
        shape.circle(); //static method
        shape.square(); //default method
//        shape.triangle(); // cannot access

//        shape.rectangle(); // cannot access
        Shape.rectangle(); //static method


    }
}
