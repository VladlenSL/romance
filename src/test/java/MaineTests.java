import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static java.awt.SystemColor.text;

public class MaineTests extends BaseUI {

    @Test
    public void registration() {
        mainPage.registration1();
        registrationForm.registration();
        mainPage.nextbuttonclick();
        registrationForm.GET();
        mainPage.dropdawnclick();
        registrationForm.phone();
        mainPage.location();
    }

    @Test
    public void testsPrettyWomen() {
        mainPage.TestsPrettyWomen();
    }

    @Test
    public void testsIframe() {
        registrationForm.iframe();
        mainPage.clickplayyoutube();
    }
    public void testsFooter() {
        //mainPage.mouseScroll(Locators.PHONE_LINK);
        mainPage.jsScroll(Locators.PHONE_LINK);
        //mainPage.jsScrollDawn();
        mainPage.jsClick(Locators.PHONE_LINK);
    }

   @Test
   public void testMainTabs() {
        List<WebElement> tabs = driver.findElements(Locators.TAB_LINKS);
       for (int i = 1; i < tabs.size(); i++) {
           if(tabs.get(i).isDisplayed()) {
               String text = tabs.get(i).getText();
               tabs.get(i).click();
               System.out.println(text);
               driver.navigate().back();
               tabs = driver.findElements(Locators.TAB_LINKS);
           }
       }
   }
}
