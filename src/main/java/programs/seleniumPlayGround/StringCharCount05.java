package programs.seleniumPlayGround;

public class StringCharCount05 {
    public static void main(String[] args){
        String input = "abbccc";
        StringBuilder result = new StringBuilder();
        int len = input.length();
        int count =1;
        for(int i=0;i<len;i++){
        if(i<len-1 && input.charAt(i)==input.charAt(i+1)){
            count++;
        }else {
            result.append(input.charAt(i)).append(count);
            count =1; // reset count
        }
        }
        System.out.println(result);
    }
}
