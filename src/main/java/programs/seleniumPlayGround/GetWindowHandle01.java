package programs.seleniumPlayGround;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GetWindowHandle01 {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.get("https://manojkumar4636.github.io/Selenium_Practice_Hub/pages/Window.html");
//        parent window
        String parentWindowId=driver.getWindowHandle();

//        click on link
        driver.findElement(By.xpath("//button[contains(text(),'Open Multiple Windows')]")).click();

        Set<String> child_windows_list = driver.getWindowHandles();
        List<String> pageTitles = new ArrayList<>();
        for(String x:child_windows_list){
            boolean switchToChildWindow = !(x.equalsIgnoreCase(parentWindowId));
            if(switchToChildWindow){
                driver.switchTo().window(x);
                String pageTitle =driver.getTitle();
                pageTitles.add(pageTitle);
                boolean closeBasedOnWindows = pageTitle.contains("Buttons");
                if(closeBasedOnWindows){
                    driver.close();
                }
            }
        }

//        driver.quit();
        System.out.println("page titles "+pageTitles);
    }
}
