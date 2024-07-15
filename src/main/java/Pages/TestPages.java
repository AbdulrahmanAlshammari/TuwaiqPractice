package Pages;

// Import necessary classes from Selenium and TestNG
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static ObjectsPath.TestHome.*; // Import all static fields (locators) from TestHome class

// Define the TestPages class
public class TestPages {
    WebDriver driver = null; // Declare WebDriver instance variable

    // Constructor to initialize WebDriver instance
    public TestPages(WebDriver driver) {
        this.driver = driver; // Assign WebDriver instance from parameter to local driver variable
    }

    // Method to open GitHub homepage
    public void OpenUrl() {
        driver.get("https://tuwaiq.edu.sa/"); // Navigate to GitHub URL
    }

    // Method to click on the login button on the home page
    public void ChangeLanguage() {
        WebElement english = driver.findElement(language); // Find login button element
        english.click(); // Click on the login button
    }


    public void PressBootcamp() {
        WebElement bootcamps = driver.findElement(bootcamp); // Find login button element
        bootcamps.click(); // Click on the login button
    }


    public void Filtering() {
        WebElement filters = driver.findElement(filter); // Find login button element
        filters.click(); // Click on the login button
    }


    public void Searching() {
        WebElement searches = driver.findElement(search);
        searches.click();
    }

    public void EnterCourseName() {
        driver.findElement(search).sendKeys("علم");

    }

    public void ClickOnRegion() {
        WebElement regions = driver.findElement(region);
        regions.click();
    }

    public void SelectFromRegion() {
        WebElement sregion = driver.findElement(selectRegion);
        sregion.click();
    }

    public void ClickOnCourse() {
        WebElement course = driver.findElement(selectCourse);
        course.click();
    }

    public void ClickOnCategory() {
        WebElement categories = driver.findElement(category);
        categories.click();
    }

    public void scrollToPosition(int x, int y) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(arguments[0], arguments[1]);", x, y);
    }

    public void Registring() {
        WebElement register = driver.findElement(registering);
        register.click();
    }

    public void ID() {
        WebElement ID = driver.findElement(idField);
        ID.click();
    }

    public void EnterID() {
        driver.findElement(idField).sendKeys("your ID");
    }

    public void Password() {
        WebElement Password = driver.findElement(passwordField);
        Password.sendKeys();
    }

    public void EnterPassword() {
        driver.findElement(passwordField).sendKeys("your Password");
    }

    public void Checkbox() {
        WebElement checkboxes = driver.findElement(checkbox);
        checkboxes.click();
    }

    public void SignInButton() {
        WebElement signin = driver.findElement(signInButton);
        signin.click();
    }
}
