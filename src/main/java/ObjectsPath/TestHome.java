package ObjectsPath;

// Import necessary classes from Selenium
import org.openqa.selenium.By;


// Define the TestHome class
public class TestHome {

    public static final By language = By.xpath("/html/body/main/div/nav[2]/div[2]/button[1]");

    public static final By bootcamp = By.xpath("/html/body/main/div/nav[2]/div[1]/div/div/ul/li[2]/a");

    public static final By filter = By.xpath("/html/body/main/section[1]/div/section[1]/div/div[1]/div[1]/button/img");

    public static final By search = By.xpath("/html/body/main/section[1]/div/section[1]/div/div[2]/div/div/div[3]/input");

    public static final By region = By.xpath("//*[@id='regionSelect']");

    public static final By selectRegion = By.xpath("//*[@id='regionSelect']/option[2]");

    public  static final By date = By.xpath("/html/body/main/section[1]/div/section[1]/div/div[2]/div/div/div[1]/input");

    public static final By category = By.xpath("/html/body/main/section[1]/div/section[1]/div/div[1]/div[2]/button[2]");
}
