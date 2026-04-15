package programs.numbers;

public class Wrapper {
    public static void main(String[] args){
        Integer i = new Integer(257);
        Short s = i.shortValue();
        Integer b = s.intValue();
        System.out.println(b);
    }
}
