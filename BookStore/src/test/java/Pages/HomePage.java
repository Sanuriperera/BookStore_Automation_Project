package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    public WebDriver driver;
    public By searchBox= By.id("searchBox");
    public By loginBtn=By.id("login");


//    Constructor that will be automatically called as soon as the object of the class is created
    public HomePage (WebDriver driver){

        this.driver = driver;
    }

    // Method to check if the search box is displayed
    public boolean isSearchBoxDisplayed() {
        System.out.println("isSearchBoxDisplayed method");
        return driver.findElement(searchBox).isDisplayed();
    }

    public boolean isSearchBtnDisplayed(){
        return driver.findElement(loginBtn).isDisplayed();
    }

}
