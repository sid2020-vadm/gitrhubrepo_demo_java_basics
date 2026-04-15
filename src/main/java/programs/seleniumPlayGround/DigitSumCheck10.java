package programs.seleniumPlayGround;
/*
Find and print sum of individual integer given array
 int[ ] a={7814,5912,4125,3234}
 is divisible by 3 and once it is divided should be divisible by 2
 */
public class DigitSumCheck10 {
    public static void main(String[] args) {
        int[] a = {7814, 5912, 4125, 3234};

        for (int num : a) {
            int sum = getDigitSum(num);

            if (sum % 3 == 0 && (sum / 3) % 2 == 0) {
                System.out.println("Number: " + num +
                        ", Digit Sum: " + sum +
                        ", After /3: " + (sum / 3));
            }
        }
    }

    private static int getDigitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
