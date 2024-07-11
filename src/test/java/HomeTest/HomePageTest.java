package HomeTest;

import Base.BaseClass;
import Pages.TestPages;
import org.testng.annotations.Test;

public class HomePageTest extends BaseClass {


    @Test
    public void TuwaiqTestMethod() throws InterruptedException {
        TestPages homepage = new TestPages(driver);
        homepage.OpenUrl();
       homepage.ChangeLanguage();
       Thread.sleep(2000);
       homepage.PressBootcamp();
       Thread.sleep(2000);
       homepage.Filtering();
       Thread.sleep(2000);
       homepage.Searching();
       Thread.sleep(2000);
       homepage.EnterCourseName();
       Thread.sleep(2000);
       homepage.ClickOnRegion();
       Thread.sleep(2000);
       homepage.SelectFromRegion();
        Thread.sleep(2000);
        homepage.ClickOnCategory();
//        homepage.ClickOnDate();
        Thread.sleep(2000);
    }


    @Test
    public void BootcampTestMethod() throws InterruptedException {
        TestPages homepage = new TestPages(driver);
        homepage.OpenUrl();
        homepage.ChangeLanguage();
        Thread.sleep(2000);
        homepage.PressBootcamp();
        homepage.scrollToPosition(0, 600);
        Thread.sleep(2000);

    }
}






