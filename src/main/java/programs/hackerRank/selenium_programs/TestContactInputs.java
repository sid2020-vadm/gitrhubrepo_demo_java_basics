package programs.hackerRank.selenium_programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TestContactInputs {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
     
        String url = "https://example.com/formpage";
        List<WebElement> inputs =Utils.getContactInputs(driver,url);

        if(!inputs.isEmpty()){
            for (WebElement input:inputs){
                System.out.println("Tag: " + input.getTagName() +
                        ", Name: " + input.getAttribute("name") +
                        ", ID: " + input.getAttribute("id"));
            }
        }else {
            System.out.println("No input elements starting with 'contact' found.");
        }
        driver.quit();

    }
}
