import org.testng.annotations.Test;

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
    public void testsIframe(){
        registrationForm.iframe();
        mainPage.clickplayyoutube();
    }
}
