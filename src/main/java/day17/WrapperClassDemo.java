package day17;

public class WrapperClassDemo {
    public static void main(String[] args){
        int i=10;
        double d=10.5;
        char c ='A';
        boolean b =false;

//        convert primitive to object type -- Auto boxing
        Integer integer = i;
        Double dobj = d;
        Character character = c;
        Boolean bobj = b;

        System.out.println(integer);
        System.out.println(dobj);
        System.out.println(character);
        System.out.println(bobj);

//        converting objects to primitive type -- Un-boxing

        int intvalue = integer;
        double dvalue = dobj;
        char cvalue = character;
        boolean bool = bobj;

        System.out.println(intvalue);
        System.out.println(dvalue);
        System.out.println(cvalue);
        System.out.println(bool);

//        int x=100;
        Integer x=100;



    }
}
