import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.time.Duration;

public class MaineTests extends BaseUI {

    By registrationButton = By.cssSelector("button[id='show-registration-block']");
    By textFieldEmail = By.cssSelector("input[id='email']");
    By textFieldPassword = By.cssSelector("input[id='password']");
    By nextButton = By.xpath("//button[@data-action='next-page'][text()='Next']");
    By getTextFieldUsername = By.cssSelector("input[name='data[nickname]']");
    By dayDropDawn = By.xpath("//div[@id='daySelect']");
    By date24 = By.xpath("//ul[@class='dropdown-menu show']//a[@data-value='24']");
    By dayDropDawn1 = By.xpath("//div[@id='monthSelect']");
    By monthSEP = By.xpath("//ul[@class='dropdown-menu show']//a[@data-value='8']");
    By dayDropDawn2 = By.xpath("//div[@id='yearSelect']");
    By year = By.xpath("//ul[@class='dropdown-menu show']//a[@data-value='1997']");
    By phoneone = By.cssSelector("input[name='data[phone]']");
    //By location = By.xpath("//input[@name='region_name']");
    //By city2 = By.xpath("//li[text()='Kharkiv, Ukraine']");
    //By city1 = By.xpath("//div[contains(@id, 'region_select')]");
    By tap = By.cssSelector("input[data-action='validation']");
    //By nextButtonzero = By.xpath("//button[@data-action='update-profile'][text()='Next']");

    String email = "ukrainemyhome@gmail.com";
    String password = "12345677654321";
    String username = "VladlenSafaniyuk";
    String phone = "+380953595621";
    //String city = "Kharkiv,";


    @Test
    public void Registration1() {
        driver.findElement(registrationButton).click();
        driver.findElement(textFieldEmail).sendKeys(email);
        driver.findElement(textFieldPassword).sendKeys(password);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(nextButton).click();
        driver.findElement(nextButton).click();
        driver.findElement(getTextFieldUsername).sendKeys(username);
        driver.findElement(dayDropDawn).click();
        driver.findElement(date24).click();
        driver.findElement(dayDropDawn1).click();
        driver.findElement(monthSEP).click();
        driver.findElement(dayDropDawn2).click();
        driver.findElement(year).click();
        driver.findElement(phoneone).sendKeys(phone);
        //driver.findElement(location).clear();
        //driver.findElement(location).sendKeys(city);
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //wait.until(ExpectedConditions.visibilityOf(driver.findElement(city1)));
        //driver.findElement(city2).click();
        driver.findElements(tap).get(4).click();
        //driver.findElement(nextButtonzero).click();
    }

    By clickPW = By.cssSelector("a[href='https://romanceabroad.com/users/search']");
    By minage = By.xpath("//select[contains(@name, 'age_min')]//option[text()='18']");
    By maxage = By.xpath("//select[contains(@name, 'age_max')]//option[text()='24']");
    By search = By.xpath("//input[@name='main_search_button']");
    By NAME = By.xpath("//select[contains(@id, 'sorter-select')]//option[@value='name']");
    By listview = By.xpath("//a[contains(@title, 'List view')]");

    @Test
    public void TestsPrettyWomen() {
        driver.findElement(clickPW).click();
        driver.findElement(minage).click();
        driver.findElement(maxage).click();
        driver.findElement(search).click();
        driver.findElement(NAME).click();
        driver.findElement(listview).click();

    }

    By YouTubeFramwlocator = By.xpath("//Iframe[@src='https://www.youtube.com/embed/RRECuJzm3IY?start=85']");
    By playYouTubeButton = By.xpath("//button[@aria-label='Смотреть']");
    
    @Test
    public void TestsIframe(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        WebElement YouTubeIframe = driver.findElement(YouTubeFramwlocator);
        driver.switchTo().frame(YouTubeIframe);
        driver.findElement(playYouTubeButton).click();
    }


}
