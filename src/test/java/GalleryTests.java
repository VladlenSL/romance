import org.testng.annotations.Test;

public class GalleryTests extends BaseUI {

    @Test
    public void testSortPictures1() {
        mainPage.clickGalleryLink();
        galleryPage.selectDropDawnByText(Locators.SORT_DROP_DAWN, Data.registrationdate);
    }

    public void testSortPictures2() {
        mainPage.clickGalleryLink();
        galleryPage.selectDropDawnByIndex(Locators.SORT_DROP_DAWN, 3);
    }

    public void testSortPictures3() {
        mainPage.clickGalleryLink();
        galleryPage.selectDropDawnByValue(Locators.SORT_DROP_DAWN, Data.registrationdateValue);
    }
}
