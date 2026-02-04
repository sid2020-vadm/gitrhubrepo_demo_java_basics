package day12_Method_overloading_and_constructor_overloading;

public class BoxMain {
    public static void main(String[] args){
        Box b = new Box();
        double d = b.volume();
        System.out.println(d);
        Box b1 = new Box(5.0,5.0,5.0);
        System.out.println(b1.volume());
        Box b3 =new Box(10.5);
        System.out.println(b3.volume());
    }
}
