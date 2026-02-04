package day11;

public class ConstructorDemo {

    int x,y;
    ConstructorDemo(){
        x=10;
        y=20;
    }
    ConstructorDemo(int a, int b){
        this.x = a;
        this.y = b;
    }

    void sum(){
        System.out.println((x+y));
    }

    public static void main(String[] args){
     ConstructorDemo cd = new ConstructorDemo();
     ConstructorDemo cd1 = new ConstructorDemo(2,4);
     cd.sum();
     cd1.sum();
    }
}
