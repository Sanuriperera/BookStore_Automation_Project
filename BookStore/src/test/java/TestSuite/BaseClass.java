package TestSuite;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

    public WebDriver driver;
    public String baseURL = "https://demoqa.com/login";

    @BeforeClass
    public void beforeClass(){
        WebDriverManager.chromedriver().setup();

    }

    @BeforeMethod
    public void beforeMethod(){
        driver = new ChromeDriver();
        driver.get(baseURL);
        driver.manage().window().maximize();
    }

//    @AfterMethod
//    public void quit(){
//        driver.quit();
//    }

}