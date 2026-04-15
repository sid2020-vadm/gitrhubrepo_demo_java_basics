package programs.strings;

public class SumNumbersInString13 {
    public static void main(String[] args){
        String s = "name surname224 surname 2011";
        long sum =0;
        for(String token : s.split("\\D+")){
            if(!token.isEmpty()){
                sum += Long.parseLong(token);
            }
        }
        System.out.println(sum);
    }
}
