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
        homepage.scrollToPosition(0, 600);
        Thread.sleep(2000);
        homepage.ClickOnCourse();
        Thread.sleep(2000);
        homepage.scrollToPosition(0, 700);
        Thread.sleep(2000);
        homepage.Registring();
        Thread.sleep(2000);
       // homepage.ID();
        Thread.sleep(2000);
        homepage.EnterID();
        Thread.sleep(2000);
        homepage.EnterPassword();
        Thread.sleep(2000);
        homepage.Checkbox();
        Thread.sleep(2000);
        homepage.SignInButton();
        Thread.sleep(3000);

    }
}






