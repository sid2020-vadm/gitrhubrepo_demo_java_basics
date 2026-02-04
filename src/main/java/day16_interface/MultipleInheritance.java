package day16_interface;

public class MultipleInheritance implements I1,I2{

    @Override
    public void mi() {
        System.out.println("I1");
    }

    @Override
    public void m2() {
        System.out.println("I2");
    }

    public static void main(String [] args){
        MultipleInheritance multipleInheritance = new MultipleInheritance();
        multipleInheritance.m2();
        multipleInheritance.mi();
        System.out.println(I1.x+" "+I2.y);
    }
}
