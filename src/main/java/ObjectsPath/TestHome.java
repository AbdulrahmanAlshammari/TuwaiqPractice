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

    public  static final By selectCourse = By.xpath("/html/body/main/section[1]/div/section[1]/div/div[3]/div[1]/div/div[2]/a");

    public static final By category = By.xpath("/html/body/main/section[1]/div/section[1]/div/div[1]/div[2]/button[2]");

    public static final By registering = By.xpath("/html/body/main/section[1]/div/div[2]/div[2]/div[7]/a/span[1]");

    public static final By idField = By.xpath("//*[@id='Input_Username']");

    public static final By passwordField = By.xpath("//*[@id='Input_Password']");

    public static final By checkbox = By.xpath("//*[@id='account']/div/div[3]");

    public static final By signInButton = By.xpath("//*[@id='account']/div/div[5]/button");
}
