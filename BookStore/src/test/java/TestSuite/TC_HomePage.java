package TestSuite;

import Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_HomePage extends BaseClass{
HomePage homePage=new HomePage(driver);

    @Test
    public void validateSearchBoxIsDisplayed() {
        Assert.assertTrue(homePage.isSearchBoxDisplayed(), "Search box is not displayed!");
    }
}
