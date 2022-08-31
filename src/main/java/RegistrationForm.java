import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegistrationForm extends BaseActions {

    public RegistrationForm(WebDriver driver, WebDriverWait wait){
        super(driver, wait);
    }

//Registration

    public void registration(){
        driver.findElement(Locators.TEXT_FIELED_EMAIL).sendKeys(Data.EMAIL);
        driver.findElement(Locators.TEXT_FIELED_PASSWORD).sendKeys(Data.PASSWORD);
    }

    public void GET(){
        driver.findElement(Locators.GET_TEXT_FIELED_USER_NAME).sendKeys(Data.USER_NAME);
    }

    public void phone(){
        driver.findElement(Locators.PHONE_ONE).sendKeys(Data.PHONE);
    }

    public void iframe(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        WebElement YouTubeIframe = driver.findElement(Locators.YOUTUBE_FRAME_LOCATOR);
        driver.switchTo().frame(YouTubeIframe);
    }

}
