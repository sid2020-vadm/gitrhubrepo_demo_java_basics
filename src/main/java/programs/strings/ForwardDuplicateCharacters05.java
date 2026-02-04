package programs.strings;

public class ForwardDuplicateCharacters05 {
    public static void main(String[] args){
        String str = "programming";
        int strLen=str.length();

        for(int i=0;i<strLen;i++){
            char ch = str.charAt(i);
            int count =1;

            if(ch==' '){
                continue;
            }

            for(int j=i+1;j<strLen;j++){
                if(ch== str.charAt(j)){
                    count++;
                }
            }

            boolean alreadyCounted = false;
            for (int k=0;k<i;k++){
                if(str.charAt(k)==ch){
                    alreadyCounted = true;
                    break;
                }
            }
            if(!alreadyCounted && count >1){
                System.out.println(ch+" -> "+count+" times");
            }
        }
    }
}
