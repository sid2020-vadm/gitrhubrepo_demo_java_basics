package programs.strings;

public class ReverseStringUsingStringBuilder01 {
    public static void main(String[] args){
        String word = "Hello World";
        StringBuilder sb = new StringBuilder(word);
        System.out.println(sb.reverse().toString());
    }
}
