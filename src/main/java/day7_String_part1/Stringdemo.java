package day7_String_part1;

import java.util.Arrays;

public class Stringdemo {
    public static void main(String[] args){
        String name1 = "john";
        String name2 = new String("john");
        System.out.println("name is "+name1);
        System.out.println("name is "+name2);

        //length() -- returns length of the string
//        String s = "welcome";
//        int len =s.length();
//        System.out.println(len);
//        concat() -- Concatenates string
        String s1 = "abcd ";
        String s2 = "efgh";
        String s3 = " ijkl";
        String s4 = s1.concat(s2);
        System.out.println(s3);
        String s5 = s1.concat(s2).concat(s3);
        System.out.println(s5);
        System.out.println("hello".concat(" how are you? ").concat("ohh!!"));

//        trim()
        String s6= " hello ";
        System.out.println(s6);
        System.out.println(s6.length());
        String s7 = s6.trim();
        System.out.println(s7);
        System.out.println(s7.length());

//        charAt(int i) -- Returns character at index
        String s8 = "Hello";
        System.out.println(s8.charAt(4)); //o/p -- 0

//        contains() --Checks substring
        String s9 = "how are you";
        System.out.println(s9.contains("are")); //o/p --> true
        System.out.println(s9.contains("ARE")); // o/p -->false

//        equals() --Compares two strings (case-sensitive),
//        equalsIgnoreCase() -- Compares ignoring case
        String s10="welcome";
        String s11="WELCOME";
        System.out.println(s10.equals(s11)); //false
        System.out.println(s10.equalsIgnoreCase(s11)); //true

//        replace() -- replace single or sequence of chars
        String s12="welcome to java selenium automation";
        System.out.println(s12.replace('e','S'));
        System.out.println(s12.replace("java","python"));

//        substring() --Substring from index,range
        String s13 = "welcome to java automation course on udemy";
        System.out.println(s13.substring(0,7)); //o/p -- welcome

//        toUpperCase() toLowerCase()
        System.out.println(s13.toUpperCase());
        System.out.println(s13.toLowerCase());

//        split() -- Splits into array --
//        split/divide the string in to multiple parts based on delimiter
        String s = "abc@gmail";
        String a[]= s.split("@");
        System.out.println(a[0]+" "+a[1]);
        System.out.println(Arrays.toString(a));

        String amount = "$15,20,55";
        System.out.println(amount.replace("$","").replace(",",""));

        String c="abc,123@xyz";
        String x[] = c.split(",");
        String y[]=x[1].split("@");
        System.out.println(x[0]+" "+Arrays.toString(y));

//      Ex5
        String str1="abc 123 xyz";
        String arr[]= str1.split(" ");
        System.out.println(Arrays.toString(arr));

//
        String name = "John Kenedy";
        System.out.println(name.toLowerCase().contains("john")); // o/p-- true

        System.out.println(name.replace('J','j').contains("john")); // o/p-- true









    }
}
