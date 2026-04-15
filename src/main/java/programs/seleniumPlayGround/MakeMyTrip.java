package programs.seleniumPlayGround;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class MakeMyTrip {
    public static void main(String[] args){
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.makemytrip.com/");
        driver.findElement(By.cssSelector("img[alt='minimize']")).click();
        driver.findElement(By.cssSelector(".commonModal__close")).click();
        selectLink(driver,"Flights");
//        selectLink(driver,"Hotels");
        driver.quit();
    }

    public static void selectLink(WebDriver driver, String element) {
        By menuLocator = By.xpath(
                "//ul[@class='makeFlex font12 headerIconsGap']//span[@class='headerIconTextAlignment chNavText darkGreyText']");
//xpath --> ul[@class='makeFlex font12 headerIconsGap']/child::li
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        int maxAttempts = 3;
        int attempt = 0;
        while (attempt < maxAttempts) {
            try {
                wait.until(ExpectedConditions.visibilityOfElementLocated(menuLocator));
                List<WebElement> listLinks = driver.findElements(menuLocator);
                for (int i = 0; i < listLinks.size(); i++) {
                    List<WebElement> freshList = driver.findElements(menuLocator);
                    WebElement link = freshList.get(i);
                    if (element.equalsIgnoreCase(link.getText().trim())) {
                        wait.until(ExpectedConditions.elementToBeClickable(link)).click();
//                        link.click();
                        return;   // success → exit method
                    }
                }

                throw new NoSuchElementException("Element not found: " + element);

            } catch (StaleElementReferenceException |
                     ElementClickInterceptedException |
                     TimeoutException e) {

                attempt++;
                System.out.println("Retrying... Attempt " + attempt);

                if (attempt == maxAttempts) {
                    throw e;  // rethrow after max retries
                }
            }
        }
    }




}
