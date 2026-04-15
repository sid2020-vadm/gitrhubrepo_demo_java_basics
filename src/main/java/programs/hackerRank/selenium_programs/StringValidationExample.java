package programs.hackerRank.selenium_programs;

import java.util.ArrayList;
import java.util.List;

public class StringValidationExample {
    public static void main(String[] args){
        List<String> words = new ArrayList<>();
        words.add("Java123");
        words.add("HelloWorld");
        words.add("Python_3");   // invalid (underscore)
        words.add("C++");        // invalid (+ symbols)
        words.add("GoLang99");

        for(String word:words){
            if (word.matches("^[a-zA-Z0-9]+$")){
                System.out.println(word+" matches validation");
            }else {
                System.out.println(word+" not matches validation");
            }
        }
    }
}
