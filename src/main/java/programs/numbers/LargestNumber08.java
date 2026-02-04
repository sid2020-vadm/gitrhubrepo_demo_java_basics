package programs.numbers;

public class LargestNumber08 {
    public static void main(String[] args){
        int[] numbers = {10, 25, 85, 42, 99, 18};

        int largest = numbers[0];
        for (int i =1;i<numbers.length;i++){
            if(numbers[i]> largest){
                largest = numbers[i];
            }
        }
        System.out.println(largest);
    }
}
