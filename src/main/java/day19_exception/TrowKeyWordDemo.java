package day19_exception;

import day13_encapsulation_setters_getters_static_keyword.ThisKeyword;

public class TrowKeyWordDemo {

    void chcekSum(int num){
        if(num<1){
            throw new ArithmeticException("Number is -ve. Cannot calculate square..");
        }else {
            System.out.println(num*num);
        }

    }

    public static void main(String[] args){
        TrowKeyWordDemo trowKeyWordDemo = new TrowKeyWordDemo();
        try {
            trowKeyWordDemo.chcekSum(-1);
        }catch (ArithmeticException e){
            System.out.println("data is not valid...");
        }
    }

}
