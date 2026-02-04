package day14_inheritance_types;

public class InheritanceTypes {
    public static void main(String[] args){
        B objB = new B();
        objB.a=10;
        objB.b=20;
        objB.display();
        objB.show();

        C objc = new C();
        objc.c=20;
        objc.a=10;
        objc.b=25;
        objc.print();
        objc.show();
        objc.display();
    }
}


