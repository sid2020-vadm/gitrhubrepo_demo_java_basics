package programs.strings;

import java.util.Scanner;

public class WordOccurrenceNoMap07 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the sentense : ");
        String sentense = sc.nextLine();
        String[] words = sentense.toLowerCase().split("\\W+");
        int lenWords= words.length;
        boolean[] visited = new boolean[lenWords];
        for (int i=0;i<lenWords;i++){
            if(!visited[i]){
                int count =1;
                for (int j=i+1;j<lenWords;j++){
                    if (words[i].equals(words[j])){
                        count++;
                        visited[j] = true;
                    }
                }
                System.out.println(words[i]+"--> count is --> "+count);
            }


        }


    }
}
