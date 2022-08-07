import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.time.Duration;

public class MaineTests extends BaseUI {

    By registrationButton = By.cssSelector("button[id='show-registration-block']");
    By textFieldEmail = By.cssSelector("input[id='email']");
    By textFieldPassword = By.cssSelector("input[id='password']");
    By getTextFieldUsername = By.cssSelector("input[name='data[nickname]']");
    By nextButton = By.xpath("//button[@data-action='next-page'][text()='Next']");
    By Birthdate = By.cssSelector("a[class='btn btn-default dropdown-toggle btn-lg btn-block']");
    By date = By.cssSelector("a[data-value='19']");
    By month = By.cssSelector("a[class='btn btn-default dropdown-toggle btn-lg btn-block']");
    By monthone = By.xpath("//a[@data-action='change-datepicker'][text()='Sep']");
    By year = By.cssSelector("a[class='btn btn-default dropdown-toggle btn-lg btn-block']");
    By yearone = By.xpath("//a[@data-action='change-datepicker'][text()='1997']");
    By phoneone = By.cssSelector("input[name='data[phone]']");
    By locationone = By.cssSelector("input[name='region_name']");
    By codeone = By.cssSelector("input[id='g-recaptcha-response']");
    By tap = By.cssSelector("input[data-action='validation']");
    By nextButtonzero = By.xpath("//button[@data-action='update-profile'][text()='Next']");
    String email = "ukrainemyhome@gmail.com";
    String password = "12345677654321";
    String username = "VladlenSafaniyuk";
    String phone = "+380953595621";
    String location = "Kharkiv, Ukraine";
    String code = "8234";


    @Test
    public void mainePageTests1() {
        driver.findElement(registrationButton).click();
        driver.findElement(textFieldEmail).sendKeys(email);
        driver.findElement(textFieldPassword).sendKeys(password);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(nextButton).click();
        driver.findElement(getTextFieldUsername).sendKeys(username);
        driver.findElement(Birthdate).click();
        driver.findElements(date).get(0).click();
        driver.findElements(month).get(1).click();
        driver.findElement(monthone).click();
        driver.findElements(year).get(2).click();
        driver.findElement(yearone).click();
        driver.findElement(phoneone).sendKeys(phone);
        driver.findElement(locationone).sendKeys(location);
        driver.findElement(codeone).sendKeys(code);
        driver.findElements(tap).get(4).click();
        driver.findElement(nextButtonzero).click();
    }
    
    @Test
    public void mainePageTests2() {
        driver.findElement(registrationButton).click();
        driver.findElement(textFieldEmail).sendKeys(email);
        driver.findElement(textFieldPassword).sendKeys(password);
        wait.until(ExpectedConditions.elementToBeClickable(nextButton));
        driver.findElement(nextButton).click();
        driver.findElement(getTextFieldUsername).sendKeys(username);
        driver.findElement(Birthdate).click();
        driver.findElements(date).get(0).click();
        driver.findElements(month).get(1).click();
        driver.findElement(monthone).click();
        driver.findElements(year).get(2).click();
        driver.findElement(yearone).click();
        driver.findElement(phoneone).sendKeys(phone);
        driver.findElement(locationone).sendKeys(location);
        driver.findElement(codeone).sendKeys(code);
        driver.findElements(tap).get(4).click();
        driver.findElement(nextButtonzero).click();
    }



}