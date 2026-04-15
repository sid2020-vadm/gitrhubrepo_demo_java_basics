package programs.seleniumPlayGround;

public class ArmstrongNumber03 {
    public static void main(String[] args){
        int originalNum = 153;
        int length=0;
        int digits=0;
        int sum =0;

        //length
        int temp = originalNum;
        while(temp!=0){
            length++;
            temp =temp/10;
        }
        //calculate armstrong
        temp = originalNum;
        while(temp!=0){
            int digit = temp%10;
            sum+= Math.pow(digit,length);
            temp = temp/10;
        }
        if (sum == originalNum) {
            System.out.println(originalNum + " is an Armstrong number");
        } else {
            System.out.println(originalNum + " is NOT an Armstrong number");
        }
    }
}
