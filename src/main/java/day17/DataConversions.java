package day17;

public class DataConversions {
public static void main(String[] args){
    String s ="welcome";
//    String --> int
    String s1="123";
    String s2="123";
    System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));

//    String to double
    String s3="10.23";
    String s4="11.11";
    System.out.println(Double.parseDouble(s3)+Double.parseDouble(s4));

//    String to boolean
    String s5= "true";
    String s6= "false";
    System.out.println(Boolean.parseBoolean(s5)+ " "+Boolean.parseBoolean(s6));

//    String to 'char' not possible
    String s7 = "A";

//    scenario2  int,double,bool,char --->String
    int x=100;
    String a =String.valueOf(x);

    double d =2.23;
    String a1= String.valueOf(d);

    boolean b =true;
    String a3 = String.valueOf(b);

    char c  ='A';
    String a4 = String.valueOf(c);

//    scenario3
    int a5 =123;
    double y =a5;
    System.out.println(y);

    double a7= 10.23;
    int a8=(int)a7; //type cast
    System.out.println(a8); // o/p -- 10
}

}
