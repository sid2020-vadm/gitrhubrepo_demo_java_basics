package programs.seleniumPlayGround;

public class CleanString06 {
    public static void main(String[] args){
        String str = "i am@ inte#1rsted& in te@st3in$g";
        String output =str.replaceAll("[^a-zA-Z ]","");
        System.out.println(output);

    }
}
