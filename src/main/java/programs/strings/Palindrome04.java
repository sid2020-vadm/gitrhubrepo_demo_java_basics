package programs.strings;

public class Palindrome04 {
    public static void main(String[] args){
        String sentence = "Madam speaks Malayalam but not Java";
        //      1st approach
//        String[] words = sentence.split("\\W+");
//        for(int i=0;i<words.length;i++){
//            String word = words[i];
//            int len = word.length();
//            boolean isPalindrome = true;
//
//            for (int j=0 ; j<len/2;j++){
//                if(Character.toLowerCase(word.charAt(i))!= Character.toLowerCase(word.charAt(len-1-i))){
//                    isPalindrome =false;
//                    break;
//                }
//            }
//            if(isPalindrome){
//                System.out.println(word +" is Pallindrome");
//            }else {
//                System.out.println(word+ " is Not pallindrome");
//            }
//        }
//      2nd approach
        String sentense = "Madam speaks Malayalam but not Java";
        String[] words = sentense.toLowerCase().split("\\W+");
        for(String word :words){
            StringBuilder sb = new StringBuilder(word);
            String reverse =sb.reverse().toString();
            if(word.equals(reverse)){
                System.out.println(word+ " is pallindrome");
            }else{
                System.out.println(word+" is not pallindrome");
            }
        }
    }
}
