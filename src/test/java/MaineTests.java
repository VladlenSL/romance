import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.time.Duration;

public class MaineTests extends BaseUI {

    By registrationButton = By.cssSelector("button[id='show-registration-block']");
    By textFieldEmail = By.cssSelector("input[id='email']");
    By textFieldPassword = By.cssSelector("input[id='password']");
    By nextButton = By.cssSelector("button[data-action='next-page']");
    By getTextFieldUsername = By.cssSelector("input[name='data[nickname]']");
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
    //By nextButtonzero = By.xpath("//button[@data-action='update-profile'][text()='Next']");
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
        driver.findElements(nextButton).get(1).click();
        driver.findElements(nextButton).get(1).click();
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
        //driver.findElement(nextButtonzero).click();
    }
    By clickPW = By.cssSelector("a[href='https://romanceabroad.com/users/search']");
    By min = By.cssSelector("select[name='age_min']");
    By YEARS19 = By.cssSelector("option[value='20']");
    By max = By.cssSelector("select[name='age_max']");
    By YEARS24 = By.cssSelector("option[value='24']");
    By NAME = By.cssSelector("select[class='form-control']");
    By NAME1 = By.cssSelector("option[value='name']");
    By search = By.xpath("//input[@name='main_search_button']");
    By listview = By.cssSelector("a[title='List view']");

    @Test
    public void mainePageTests2() {
        driver.findElement(clickPW).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.findElement(min).click();
        driver.findElements(YEARS19).get(0).click();
        wait.until(ExpectedConditions.elementToBeClickable(max));
        driver.findElement(max).click();
        driver.findElements(YEARS24).get(0).click();
        driver.findElements(NAME).get(2).click();
        driver.findElement(NAME1).click();
        driver.findElement(search).click();
        driver.findElement(listview).click();


    }



}
