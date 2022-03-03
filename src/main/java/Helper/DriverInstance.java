package Helper;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverInstance
{

    /*** instance of singleton class ***/
    private static DriverInstance instanceOfSingletonBrowserClass=null;
    private ChromeDriver driver;

    private DriverInstance()
    {
        System.setProperty("webdriver.chrome.driver" ,"./drivers/chromedriver");
        ChromeOptions option = new ChromeOptions();
        option.setExperimentalOption("w3c", false);
        driver= new ChromeDriver(option);
    }

    /*** Creating instance of class ***/
    public static DriverInstance getInstanceOfSingletonBrowserClass()
    {
        if(instanceOfSingletonBrowserClass==null){
            instanceOfSingletonBrowserClass = new DriverInstance();
        }
        return instanceOfSingletonBrowserClass;
    }

    /*** method for geting available driver for all pages ***/
    public ChromeDriver getDriver()
    {
        return driver;
    }

}