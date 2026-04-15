package programs.seleniumPlayGround;

public class MissingNumberWithoutFormula12 {
        public static void main(String[] args) {
            int[] arr = {1, 2, 4, 5};
            int n = arr.length + 1;
            int expectedSum = 0;
            int actualSum = 0;
            // Calculate expected sum using loop
            for (int i = 1; i <= n; i++) {
                expectedSum += i;
            }
            // Calculate actual sum
            for (int num : arr) {
                actualSum += num;
            }
            System.out.println("Missing number is: " + (expectedSum - actualSum));
        }
}
