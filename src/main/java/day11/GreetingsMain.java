package day11;

public class GreetingsMain {
    public static void main(String[] args){
        Greetings gr = new Greetings();
        gr.m1();

        String s= gr.m2();
        System.out.println(s);

        gr.m3("amit");

        int c =gr.m4(3,4);
        System.out.println(c);

    }
}
