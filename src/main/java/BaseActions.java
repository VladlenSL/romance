import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseActions {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public BaseActions(WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }

    public void selectDropDawnByText(By dropDawnList, String text){
        WebElement element = driver.findElement(dropDawnList);
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }

    public void selectDropDawnByText(WebElement element, String text){
        Select select = new Select(element);
        select.selectByVisibleText(text);
    }

    public void selectDropDawnByIndex(By dropDawnList, int index){
        WebElement element = driver.findElement(dropDawnList);
        Select select = new Select(element);
        select.selectByIndex(index);
    }

    public void selectDropDawnByIndex(WebElement element, int index){
        Select select = new Select(element);
        select.selectByIndex(index);
    }

    public void selectDropDawnByValue(By dropDawnList, String value){
        WebElement element = driver.findElement(dropDawnList);
        Select select = new Select(element);
        select.selectByValue(value);
    }

    public void selectDropDawnByValue(WebElement element, String value){
        Select select = new Select(element);
        select.selectByValue(value);
    }

    public void mouseClick(By locator) {
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(locator);
        new Actions(driver)
                .moveToElement(element)
                .click()
                .perform();

    }

    public void mouseScroll(By locator) {
        WebElement element = driver.findElement(locator);
        new Actions(driver)
                .scrollToElement(element)
                .perform();

    }

    public void jsClick(By locator){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        WebElement element = driver.findElement(locator);
        js.executeScript("arguments[0].click();", element);
    }
    public void jsScrollDawn(){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,600)");
    }

    public void jsScroll(By locator){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        WebElement element = driver.findElement(locator);
        js.executeScript("arguments[0].scrollIntoView();", element);
    }
}
