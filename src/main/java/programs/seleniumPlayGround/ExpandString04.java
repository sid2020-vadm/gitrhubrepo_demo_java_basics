package programs.seleniumPlayGround;

public class ExpandString04 {
    public static void main(String[] args){
//        String str = "u4v5";
//        StringBuilder result = new StringBuilder();
//        char previousChar = 0;
//        for(char ch:str.toCharArray()){
//            if(Character.isLetter(ch)){
//                previousChar =ch;
//            }else if (Character.isDigit(ch)){
//              int count =Integer.parseInt(String.valueOf(ch));
//                for(int j=0;j<count;j++){
//                    result.append(previousChar);
//                }
//            }
//        }
//        System.out.println(previousChar);

        String input = "u4v5";
        StringBuilder result = new StringBuilder();

        char prevChar = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isLetter(ch)) {
                prevChar = ch;
            } else if (Character.isDigit(ch)) {
//                int count = ch - '0'; // convert char to int
                int count =Integer.parseInt(String.valueOf(ch));
                for (int j = 0; j < count; j++) {
                    result.append(prevChar);
                }
            }
        }

        System.out.println(result.toString());
    }
}
