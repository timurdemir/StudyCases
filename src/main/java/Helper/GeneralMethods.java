package Helper;

import PageObjects.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class GeneralMethods extends BasePage
{
    ChromeDriver driver;

    @FindBy(className = "desktopOldAutosuggestTheme-input")
    private WebElement searchProduct;


    public GeneralMethods()
    {
        driver =DriverInstance.getInstanceOfSingletonBrowserClass().getDriver();
        driver.manage().window().maximize();
    }

    public void waitForDocumentLoad()
    {
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
    }

    public WebElement findElement(String locator)
    {
        if(locator.contains("//"))
        {
            return driver.findElement(By.xpath(locator));
        }
        else if(locator.contains("."))
        {
            return driver.findElement(By.cssSelector(locator));
        }
        else
        {
            return driver.findElement(By.id(locator));
        }
    }

    public void Click(String locator)
    {
        findElement(locator).click();
    }

    public void Hover(String locator)
    {
        Actions actions = new Actions(driver);
        actions.moveToElement(findElement(locator)).click().build().perform();
    }


    public void ShouldSee(String locator, String expectedText)
    {
        Assert.assertEquals(findElement(locator).getText(),expectedText);
    }
    public void FillProduct(String productTxt){
        searchProduct.sendKeys(productTxt);
    }

    public void switchtoNewTab(){
        ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
        //switch to new tab
        driver.switchTo().window(newTb.get(1));
    }


}
