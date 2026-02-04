package day14_inheritance_types;

public class HierarchyInheritance {
    public static void main(String[] args){
        Child1 child1 = new Child1();
        child1.display(100);
        child1.show(200);


        Child2 child2 = new Child2();
        child2.display(300);
        child2.print(400);
    }
}
