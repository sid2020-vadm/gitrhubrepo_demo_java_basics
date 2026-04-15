package programs.seleniumPlayGround;

public class AlternateUppercase13 {
    public static void main(String[] args) {
        String input = "Siddeshwar Hiremath";
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (i % 2 == 0 && ch != ' ') {
                result.append(Character.toUpperCase(ch));
            } else {
                result.append(ch);
            }
        }
        System.out.println(result.toString());
    }
}
