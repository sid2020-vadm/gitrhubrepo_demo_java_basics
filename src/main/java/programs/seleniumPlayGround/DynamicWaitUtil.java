package programs.seleniumPlayGround;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class DynamicWaitUtil {
    private WebDriver driver;
    private WebDriverWait wait;

    public DynamicWaitUtil(WebDriver driver,int timeOutInterval){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(timeOutInterval));
    }

    // wait for visibility
    public WebElement waitForVisibility(By locator){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    //    wait for clickable
    public WebElement waitForClickable(By locator){
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }


    //    wait for invisiblity
    public boolean waitForInvisibility(By locator){
        return wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    //    click and retry
    public void clickWithRetry(By locator, int maxAttempts){
        int attempts = 0;
        while(attempts<maxAttempts){
            try{
                WebElement element = waitForClickable(locator);
                element.click();
                return;
            }catch (StaleElementReferenceException | ElementClickInterceptedException exception){
                attempts++;
                if(attempts==maxAttempts){
                    throw exception;
                }
            }
        }
    }
}
