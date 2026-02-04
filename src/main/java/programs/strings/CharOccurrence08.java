package programs.strings;

import java.util.Scanner;

public class CharOccurrence08 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String word = sc.nextLine();
        char[] ch = word.toCharArray();
        int lenCh =ch.length;
        boolean[] visited = new boolean[lenCh];
        for(int i=0;i<lenCh;i++){
            if(!visited[i]){
                int count =1;
                char charcter = ch[i];
                for (int j=i+1;j<lenCh;j++){
                    if (charcter == ch[j]){
                        count++;
                        visited[j]=true;
                    }
                }
                System.out.println(charcter+" count--> "+count );
            }
        }
        sc.close();
    }
}
