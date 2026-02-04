package day11;

public class Greetings {
//    1) no params no return value
    void m1(){
        System.out.println("hello...");
    }
//    2) no params,  return value
    String m2(){
        return("hello how are you");
    }
//    3) takes params no return value
    void m3(String name){
        System.out.println(name);
    }

//    4) takes params return value
    int m4(int a, int b){
        return a+b;
    }

}
