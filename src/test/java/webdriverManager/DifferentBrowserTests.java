package webdriverManager;

import base.BaseTests;
import org.openqa.selenium.By;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class DifferentBrowserTests extends BaseTests {

    private By txtAbout = By.cssSelector("span[itemprop = 'about']");

    @Test
    public void testParametersWithXML() throws InterruptedException{

        driver.navigate().to("https://github.com/bonigarcia/webdrivermanager/");
        assertTrue(driver.findElement(txtAbout).isDisplayed());
    }
}
