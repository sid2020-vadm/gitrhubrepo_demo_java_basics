package day9_String_part2;

public class StringComparision {
    public static void main(String[] args){
//        case1
//        String s1="welcome";
//        String s2="welcome";
//        System.out.println(s1==s2); //true
//        System.out.println(s1.equals(s2));//true

//        case2
//        String s1 = new String("welcme");
//        String s2 = new String("welcome");
//       System.out.println(s1==s2); //false , == is used for comparing objects
//       System.out.println(s1.equals(s2));//true //equals() used for comparing values

//        case3
        String s3 = "welcome";
        String s4 = new String("welcome");
        System.out.println(s3==s4); //false
        System.out.println(s3.equals(s4)); //true




    }
}
