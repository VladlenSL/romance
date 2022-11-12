import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage extends BaseActions {
    public MainPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void registration1() {
        driver.findElement(Locators.REGISTRATION_BUTTON).click();
    }

    public void clickGalleryLink() {
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(Locators.GALLERY_LINK)));
        mouseClick(Locators.GALLERY_LINK);
    }

    public void nextbuttonclick() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(Locators.NEXT_BUTTON).click();
        driver.findElement(Locators.NEXT_BUTTON).click();
    }

    public void dropdawnclick() {
        driver.findElement(Locators.DAY_DROP_DAWN).click();
        driver.findElement(Locators.DATE_24).click();
        driver.findElement(Locators.DAY_DROP_DAWN1).click();
        driver.findElement(Locators.MONTH_SEP).click();
        driver.findElement(Locators.DAY_DROP_DAWN2).click();
        driver.findElement(Locators.YEAR).click();
    }

    public void location() {
        //driver.findElement(Locators.LOCATION).clear();
        //driver.findElement(Locators.LOCATION).sendKeys(Data.CITY);
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //wait.until(ExpectedConditions.visibilityOf(driver.findElement(CITY1)));
        //driver.findElement(Locators.CITY2).click();
        driver.findElements(Locators.TAP).get(4).click();
        //driver.findElement(Locators.NEXT_BUTTON_ZERO).click();
    }

    public void TestsPrettyWomen() {
        driver.findElement(Locators.CLICK_PW).click();
        driver.findElement(Locators.MIN_AGE).click();
        driver.findElement(Locators.MAX_AGE).click();
        driver.findElement(Locators.SEARCH).click();
        driver.findElement(Locators.NAME).click();
        driver.findElement(Locators.LIST_VIEW).click();
    }

    public void clickplayyoutube() {
        driver.findElement(Locators.PLAY_YOUTUBE_BUTTON).click();
    }
}
