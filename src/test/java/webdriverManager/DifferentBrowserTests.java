package webdriverManager;

import base.BaseTests;
import org.openqa.selenium.By;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class DifferentBrowserTests extends BaseTests {

    private By txtAbout = By.cssSelector("span[itemprop = 'about']");

    @Test
    public void testParametersWithXML() throws InterruptedException{

        driver.navigate().to("https://github.com/bonigarcia/webdrivermanager/");

        String expectedDescription = "Automatic management of Selenium WebDriver binaries";
        String actualDescription =  driver.findElement(txtAbout).getText();

        assertEquals(expectedDescription, actualDescription, "There is a mismatch between expected and actual values");
    }
}
