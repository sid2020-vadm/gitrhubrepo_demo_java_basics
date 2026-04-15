package programs.seleniumPlayGround;

public class SubArray09 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,7,9,5,6,2,1,4,4,8};
        int target = 9;
        for (int start = 0; start < arr1.length; start++) {
            int sum = 0;
            for (int end = start; end < arr1.length; end++) {
                sum += arr1[end]; //
                if (sum == target) {
                    System.out.print("Subarray: ");
                    for (int k = start; k <= end; k++) {
                        System.out.print(arr1[k] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
