package day9_String_part2;

public class ReverseString {
    public static void main(String[] args){
//        method1
//        String s = "welcome";
//        String reverse ="";
//        for(int i=s.length()-1;i>=0;i--){
//            reverse+=s.charAt(i);
//        }
//        System.out.println(reverse);

//        method2
//        String s= "welcome";
//        char a[]=s.toCharArray();
//        String rev ="";
//        for(int i=a.length-1;i>=0;i--){
//            rev+=a[i];
//        }
//        System.out.println(rev);

//        method3
        StringBuffer sb= new StringBuffer("welcome");
        System.out.println(sb.reverse());

//       method4
        StringBuilder sbb= new StringBuilder("welcome");
        System.out.println(sbb.reverse());

    }
}
