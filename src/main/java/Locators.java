import org.openqa.selenium.By;

public class Locators {

    //MainPage__
    public static final By GALLERY_LINK = By.xpath("//a[@href = 'https://romanceabroad.com/users/search']");
    public static final By PHONE_LINK = By.xpath("//a[@href = 'callto:18885997816']");

    //Registration__

    public static final By REGISTRATION_BUTTON = By.cssSelector("button[id='show-registration-block']");
    public static final By TEXT_FIELED_EMAIL = By.cssSelector("input[id='email']");
    public static final By TEXT_FIELED_PASSWORD = By.cssSelector("input[id='password']");
    public static final By NEXT_BUTTON = By.xpath("//button[@data-action='next-page'][text()='Next']");
    public static final By GET_TEXT_FIELED_USER_NAME = By.cssSelector("input[name='data[nickname]']");
    public static final By DAY_DROP_DAWN = By.xpath("//div[@id='daySelect']");
    public static final By DATE_24 = By.xpath("//ul[@class='dropdown-menu show']//a[@data-value='24']");
    public static final By DAY_DROP_DAWN1 = By.xpath("//div[@id='monthSelect']");
    public static final By MONTH_SEP = By.xpath("//ul[@class='dropdown-menu show']//a[@data-value='8']");
    public static final By DAY_DROP_DAWN2 = By.xpath("//div[@id='yearSelect']");
    public static final By YEAR = By.xpath("//ul[@class='dropdown-menu show']//a[@data-value='1997']");
    public static final By PHONE_ONE = By.cssSelector("input[name='data[phone]']");
    //public static final By LOCATION = By.xpath("//input[@name='region_name']");
    //public static final By CITY2 = By.xpath("//li[text()='Kharkiv, Ukraine']");
    //public static final By CITY1 = By.xpath("//div[contains(@id, 'region_select')]");
    public static final By TAP = By.cssSelector("input[data-action='validation']");
    //public static final By NEXT_BUTTON_ZERO = By.xpath("//button[@data-action='update-profile'][text()='Next']");

    //TestsPrettyWomen__

    public static final By CLICK_PW = By.cssSelector("a[href='https://romanceabroad.com/users/search']");
    public static final By MIN_AGE = By.xpath("//select[contains(@name, 'age_min')]//option[text()='18']");
    public static final By MAX_AGE = By.xpath("//select[contains(@name, 'age_max')]//option[text()='24']");
    public static final By SEARCH = By.xpath("//input[@name='main_search_button']");
    public static final By NAME = By.xpath("//select[contains(@id, 'sorter-select')]//option[@value='name']");
    public static final By LIST_VIEW = By.xpath("//a[contains(@title, 'List view')]");

    //FRAME__

    public static final By YOUTUBE_FRAME_LOCATOR = By.xpath("//Iframe[@src='https://www.youtube.com/embed/RRECuJzm3IY?start=85']");
    public static final By PLAY_YOUTUBE_BUTTON = By.xpath("//button[@aria-label='Смотреть']");

   //GALLERY
    public static final By SORT_DROP_DAWN = By.xpath("//select[contains(@id, 'sorter-select')]");
}
