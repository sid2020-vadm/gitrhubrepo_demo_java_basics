package programs.strings;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharactersUsingMap06 {
    public static void main(String[] args){
        String str = "programming";
        str = str.toLowerCase();
        int lenStr = str.length();
        Map<Character,Integer> countDuplicates = new HashMap<>();
        for (char ch:str.toCharArray()){
            countDuplicates.put(ch,countDuplicates.getOrDefault(ch,0)+1);
        }
        for(Map.Entry<Character,Integer> entry:countDuplicates.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey() +" count is "+entry.getValue());
            }
        }
    }
}
