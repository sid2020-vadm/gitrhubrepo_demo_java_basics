package day19_exception;

public class FinallyBlockdemo {
    public static void main(String[] args){
        String s =null;
        try{
            System.out.println(s.length());
        }catch (NumberFormatException e){
            System.out.println("exception handled..");
        }finally {
            System.out.println("finally block..");
        }
    }
}
