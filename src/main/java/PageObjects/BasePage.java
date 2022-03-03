package PageObjects;

import Helper.DriverInstance;
import org.openqa.selenium.support.PageFactory;

public class BasePage
{
    public BasePage()
    {
        PageFactory.initElements(DriverInstance.getInstanceOfSingletonBrowserClass().getDriver(), this);
    }
}
