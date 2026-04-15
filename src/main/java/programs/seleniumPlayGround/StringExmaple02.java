package programs.seleniumPlayGround;

public class StringExmaple02 {
    public static void main(String[] args){
        String str = "AbCd";
        String str2 ="";
        for(char ch:str.toCharArray()){
            if(Character.isUpperCase(ch)){
               ch= Character.toLowerCase(ch);
            }else {
               ch=Character.toUpperCase(ch);
            }
            str2 = str2+ch;
        }
        System.out.println(str);
        System.out.println(str2);
    }
}
