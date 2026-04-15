package programs.seleniumPlayGround;

import java.util.Arrays;

public class SecondAndLastButOneChar07 {
    public static void main(String[] args){
        String[] arr = {"apple", "orange", "banana", "mango"};
        String[] ouput = new String[arr.length];
        for(int i=0;i<arr.length;i++){
            String word = arr[i];
            int len = word.length();
            char secondChar = word.charAt(1);
            char lastButOneChar = word.charAt(len-1);
            ouput[i]=""+secondChar+lastButOneChar;
        }
        System.out.println("array --> "+ Arrays.toString(ouput));
    }
}
