package programs.seleniumPlayGround;

/*
🔥 Difference Between return and break
| Feature              | return                       | break      |
| -------------------- | ---------------------------- | ---------- |
| Exits Method?        | ✅ Yes                        | ❌ No       |
| Exits Loop?          | ✅ Yes (because method exits) | ✅ Yes      |
| Used in Switch?      | ❌ No                         | ✅ Yes      |
| Returns Value?       | ✅ Yes (optional)             | ❌ No       |
| Used for validation? | ✅ Very Common                | ❌ Not Used |
 */
public class ReturnBreakEx08 {
//  Example1
    public static int add(int a, int b) {
        return a + b;   // returns value and exits method
    }

//    Example2
public static void login(String username) {
    if (username == null) {
        System.out.println("Invalid username");
        return;   // exits method immediately , print statement will not execute
    }
    System.out.println("Login successful");
}

//  Example3
public static boolean containsNumber(int[] arr, int target) {
    for (int num : arr) {
        if (num == target) {
            return true;   // exits entire method
        }
    }
    return false;
}

//  Example4
    public static void loopex(int target){
        for (int i = 1; i <= target; i++) {
            if (i == 5) {
                break;   // stops loop
            }
            System.out.println(i);
        }
    }

//    Example5
    public static void loopex1(){
        int[] arr = {10, 20, 30, 40};

        for (int num : arr) {
            if (num == 30) {
                System.out.println("Found");
                break;   // exit loop only
            }
        }
        System.out.println("Search completed");

    }
//    example6
    public static void loopex3(){
        int day = 1;

        switch(day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Invalid");
        }

        System.out.println("End of Switch");

    }

    public static void main(String[] args){
//        System.out.println(add(3,4));

        login(null);

//        int[] arr1 = {1,2,3,4};
//        System.out.println(containsNumber(arr1,5));

//        loopex(10);

//        loopex1();

//        loopex3();

    }
}
