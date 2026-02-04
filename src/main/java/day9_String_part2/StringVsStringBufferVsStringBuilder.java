package day9_String_part2;

public class StringVsStringBufferVsStringBuilder {
    public static void main(String[] args){
        //String -- immutable -- cannot change
//        String s ="welcome";
//        s.concat("to java");
//        System.out.println(s); //welcome

//        StringBuffer -- mutable -- can change
//        StringBuffer sb = new StringBuffer("welcome");
//        sb.append(" to java course");
//        System.out.println(sb); //welcome to java course

//        StringBuilder -- mutable
        StringBuilder sb = new StringBuilder("welcome");
        sb.append(" to java course");
        System.out.println(sb); //welcome to java course

    }
}
