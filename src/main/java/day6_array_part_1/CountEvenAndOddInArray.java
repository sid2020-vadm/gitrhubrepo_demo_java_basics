package day6_array_part_1;

public class CountEvenAndOddInArray {
    public static void main(String[] args){
        int a[] = {12,14,15,16,23,13,13,13};
        int even =0;
        int odd = 0;
        for(int value: a){
            if(value%2==0){
                even++;
            }else {
                odd++;
            }
        }
        System.out.println("even number "+even);
        System.out.println("odd number "+odd);

    }
}
