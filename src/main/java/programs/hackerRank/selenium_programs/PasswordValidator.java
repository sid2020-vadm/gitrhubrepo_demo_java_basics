package programs.hackerRank.selenium_programs;

public class PasswordValidator {
    public static void main(String[] args){
        String[] passwords = {
                "abcde",   // ❌ only letters
                "12345",   // ❌ only digits
                "ab123",   // ✅ valid
                "a1b2c",   // ✅ valid
                "abcd1",   // ✅ valid
                "abc123",  // ❌ length > 5
                "a1"       // ❌ length < 5
        };
        for(String pwd:passwords){
            if(Utils.isValidPassword(pwd)){
                System.out.println(pwd+ " valid");
            }else {
                System.out.println(pwd+" not valid");
            }
        }

    }
}
