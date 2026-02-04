package programs.strings;

import java.util.HashMap;
import java.util.Map;

public class WordOccurrenceMap09 {
    public static void main(String[] args){
        String input = "java is fun and java is interesting";
        String[] words = input.split("\\W+");
        Map<String,Integer> countMap = new HashMap<>();
        for(String word: words){
            countMap.put(word,countMap.getOrDefault(word,0)+1);
        }

        for (Map.Entry<String,Integer> entry: countMap.entrySet()){
            if (entry.getValue()>1){
                System.out.println(entry.getKey()+" count is "+entry.getValue());
            }
        }

    }
}
