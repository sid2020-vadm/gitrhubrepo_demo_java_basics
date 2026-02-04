package programs.strings;

import java.util.Scanner;

public class VowelsConsonantsSentence10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentense: ");
        String sentense = sc.nextLine();
        sentense = sentense.toLowerCase();
        int vowels = 0, consonants =0;
        for (int i=0;i<sentense.length();i++){
            char ch = sentense.charAt(i);
            if (ch >= 'a' && ch <='z'){
                if(ch=='a'|| ch=='e'|| ch=='i'||ch=='o'||ch=='u'){
                    vowels++;
                }else {
                    consonants++;
                }
            }
        }
        System.out.println("vowels "+vowels+ " consonants "+consonants);

    }
}
