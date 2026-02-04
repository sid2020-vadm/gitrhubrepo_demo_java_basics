package programs.strings;

import java.util.HashMap;
import java.util.Map;

public class VowelsConsonantsSentenceMap11 {
    public static void main(String[] args){
        String input = "Siddeshwar Hiremath";
        Map<String,Integer> countMap = new HashMap<>();
        countMap.put("vowels",0);
        countMap.put("consonants",0);
        input = input.toLowerCase();
        for (char ch:input.toCharArray()){
            if("aeiou".indexOf(ch) != -1){
                countMap.put("vowels",countMap.get("vowels")+1);
            }else {
                countMap.put("consonants",countMap.get("consonants")+1);
            }
        }
        System.out.println("vowels : "+countMap.get("vowels") );
        System.out.println("consonants : "+countMap.get("consonants"));
    }
}
