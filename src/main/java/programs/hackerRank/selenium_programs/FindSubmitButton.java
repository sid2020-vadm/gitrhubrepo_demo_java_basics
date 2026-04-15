package programs.hackerRank.selenium_programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//program to return button elements having type 'submit'
// assume there can be only one submit type button element inside form
public class FindSubmitButton {
    @Test
    public void verifyFindButton(){
          WebDriver driver = new ChromeDriver();
        String url = "https://example.com/login";
        WebElement  submitButton =Utils.getSubmitButton(driver,url);

        if(submitButton!= null){
            System.out.println("Submit button found "+submitButton.getText());
        }else {
            System.out.println("Submit button not found ");
        }
        driver.quit();
    }
}
