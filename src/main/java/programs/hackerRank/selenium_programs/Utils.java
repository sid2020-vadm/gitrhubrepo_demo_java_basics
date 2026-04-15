package programs.hackerRank.selenium_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class Utils {
    public static boolean isValidPassword(String password){
        // Rule 1: must be exactly 5 characters
        if(password.length()!=5){
            return false;
        }
        // Rule 2: cannot be only letters or only digits
        boolean onlyLetters = password.matches("[a-zA-Z]+");
        boolean onlyDigits = password.matches("[0-9]+");
        return !(onlyLetters||onlyDigits);
    }

    public static String getValidPassword(List<String> password){
        StringBuilder result = new StringBuilder();
        for(String pwd:password){
            if (pwd.length()==5&&
            !pwd.matches("[a-zA-Z]+")&&
            !pwd.matches("[0-9]+")){
             if (result.length()>0){
                 result.append(" ");
             }
             result.append(pwd);
            }
        }
        return result.toString();
    }
// Utility method to return the submit button inside a form
    public static WebElement getSubmitButton(WebDriver driver, String url){
        driver.get(url);
        return  driver.findElement(By.xpath("//form//button[@type='button']"));
    }

//    Returns a list of input elements inside forms whose type is NOT "text"
    public static List<WebElement> getNonTextInputs(WebDriver driver,String url){
        driver.get(url);

        List<WebElement> inputs =driver.findElements(By.xpath("//form//input[not(@type='text')]"));
        return inputs;
    }
//     Returns a list of input elements whose name or id starts with 'contact' inside forms.
    public static List<WebElement> getContactInputs(WebDriver driver,String  url){
        driver.get(url);
        List<WebElement> inputs = driver.findElements(By.xpath("//form//input[starts-with(@name,'contact') or starts-with(@id,'contact')]"));
        return inputs;
    }
}
