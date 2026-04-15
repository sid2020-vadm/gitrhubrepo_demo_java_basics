package programs.seleniumPlayGround;

public class ReplaceString13 {
    public static void main(String[] args) {
        String str = "i love abc because i work in pabc";
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            // Check if "abc" starts at current position
            if (i <= str.length() - 3 &&
                    str.charAt(i) == 'a' &&
                    str.charAt(i + 1) == 'b' &&
                    str.charAt(i + 2) == 'c') {
                result += "wipro";
                i = i + 2;   // Skip next 2 characters (b & c)
            } else {
                result += str.charAt(i);
            }
        }
        System.out.println("Modified String: " + result);
    }
}
