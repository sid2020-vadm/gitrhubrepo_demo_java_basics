package programs.numbers;

public class LargestAndSecondLargest09 {
    public static void main(String[] args){
        int[] numbers= {12,45,67,23,89,45};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int num:numbers){
            if(num > largest){
                secondLargest =largest;
                largest = num;
            }
        }
        System.out.println(largest + " "+secondLargest);
    }
}
