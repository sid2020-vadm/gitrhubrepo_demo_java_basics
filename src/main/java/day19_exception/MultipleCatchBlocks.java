package day19_exception;

public class MultipleCatchBlocks {
    public static void main(String[] args){
        System.out.println("program started ...");

        String s = null;
        try{
            System.out.println(s.length());
        }catch (ArithmeticException e){
            System.out.println("handle arithmetic exceptipon");
        }catch (NullPointerException e){
            System.out.println("null pointer exception handled");
        }catch (NumberFormatException e){
            System.out.println("number format exception handled");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("program completed..");
    }
}
