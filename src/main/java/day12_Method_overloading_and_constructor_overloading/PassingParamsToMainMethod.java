package day12_Method_overloading_and_constructor_overloading;

public class PassingParamsToMainMethod {

    public static void main(String[] args){
        for (String x:args){
            System.out.println(x);
        }

        System.out.println(args.length);

    }
}
