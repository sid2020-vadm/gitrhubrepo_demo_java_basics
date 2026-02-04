package day4_conditional_statements;

public class DisplayWeek {
    public static void main(String[] args){
        int weekNum=7;
        if(weekNum==1){
            System.out.println("Monday");
        } else if (weekNum==2) {
            System.out.println("tuesday");
        } else if (weekNum==3) {
            System.out.println("wednesday");
        } else if (weekNum==4) {
            System.out.println("thrusday");
        } else if (weekNum==5) {
            System.out.println("friday");
        } else if (weekNum==6) {
            System.out.println("saturday");
        }else if (weekNum==7){
            System.out.println("sunday");
        }else {
            System.out.println("invalid week");
        }

    }
}
