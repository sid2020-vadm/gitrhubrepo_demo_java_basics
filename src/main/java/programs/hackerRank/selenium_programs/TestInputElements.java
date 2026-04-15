package programs.hackerRank.selenium_programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TestInputElements {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        String url = "https://example.com/formpage";
        List<WebElement> inputs =Utils.getNonTextInputs(driver,url);
        if (!inputs.isEmpty()){
            for (WebElement input:inputs){
                System.out.println("Tag: "+input.getTagName()+","+" Type "+input.getAttribute("type"));
            }
        }
        driver.quit();
    }
}
