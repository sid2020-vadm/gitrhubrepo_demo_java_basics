package day15_method_overriding_super_final_keyword;

public class OverridingDemo {
    public static void main(String[] args){
    ICICI icici = new ICICI();
    System.out.println(icici.roi());

    SBI sbi = new SBI();
    System.out.println(sbi.roi());
    }

}
