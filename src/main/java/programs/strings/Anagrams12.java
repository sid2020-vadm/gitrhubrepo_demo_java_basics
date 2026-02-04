package programs.strings;

import java.util.Arrays;

public class Anagrams12 {
    public static void main(String[] args){
        String s1 = "listen";
        String s2 = "silent";
        s1= s1.toLowerCase().replaceAll("\\s+","");
        s2= s2.toLowerCase().replaceAll("\\s+","");
        if(s1.length() != s2.length()){
            System.out.println("not anagram");
        }
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if(Arrays.equals(ch1,ch2)){
            System.out.println("anagrams");
        }else {
            System.out.println("not anagrams");
        }
    }
}
