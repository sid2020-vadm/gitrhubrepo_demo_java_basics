package day5_loop_jum_statements;

public class BreakAndContinueDemo {
    public static void main(String[] args){
//     for(int i=1; i<=10; i++){
//         System.out.println(i);
//         if(i==5){
//             break;
//         }
//     }
        for(int i=1; i<=10; i++){
            if(i==5){
                continue;
            }
            System.out.println(i); // o/p 1 2 3 4 6 7 8 9 10
        }

    }
}
