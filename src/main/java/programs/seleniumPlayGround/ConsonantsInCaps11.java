package programs.seleniumPlayGround;

public class ConsonantsInCaps11 {
    public static void main(String[] args) {
        String str = "WIpROinTeRVieW";
        for(char ch:str.toCharArray()){
            // uppercase letter
            if(Character.isUpperCase(ch)){
                //consonants
                if(!vowel(ch)){
                    System.out.println(ch);
                }
            }
        }
    }
    public static boolean vowel(char ch){
        ch = Character.toLowerCase(ch);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            return true;
        }
        return false;
    }
}
