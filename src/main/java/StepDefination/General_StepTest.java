package StepDefination;

import Helper.GeneralMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.ArrayList;

public class General_StepTest
{
    GeneralMethods generalMethods;

    public General_StepTest()
    {
        generalMethods = new GeneralMethods();
    }

    @And("Click {}")
    public void clickElement(String locator)
    {
        generalMethods.Click(locator);
        generalMethods.waitForDocumentLoad();
    }

    @Given("Clicked {}")
    public void givenClickElement(String locator)
    {
        generalMethods.Click(locator);
        generalMethods.waitForDocumentLoad();
    }

    @Given("Hover {}")
    public void hoverMyAccount(String locator)
    {
        generalMethods.Hover(locator);
        generalMethods.waitForDocumentLoad();
    }

    @And("Fill product {}")
    public void fillProduct(String productTxt) {
        generalMethods.FillProduct(productTxt);

    }

    @And("Switch to newtab")
    public void switchToNewtab() {
       generalMethods.switchtoNewTab();
    }
}
