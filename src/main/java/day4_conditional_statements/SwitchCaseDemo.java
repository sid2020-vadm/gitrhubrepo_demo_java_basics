package day4_conditional_statements;

public class SwitchCaseDemo {
    public static void main(String[] args){
        int weekNum = 8;
        switch (weekNum){
            case 1: System.out.println("sunday"); break;
            case 2:System.out.println("Monday");break;
            case 3:System.out.println("tuesday");break;
            default: System.out.println("invalid weeknumber");
        }
    }
}
