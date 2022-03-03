import Helper.DriverInstance;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


@RunWith(Cucumber.class)
@CucumberOptions(features = "./src/test/java/Features", glue = "StepDefination")
public class Runner
{
    public WebDriver driver;
    public String baseUrl;

    @Before
    public void init(){
        driver = DriverInstance.getInstanceOfSingletonBrowserClass().getDriver();
        baseUrl = "https://www.hepsiburada.com/";
        driver.get(baseUrl);
    }

    @After
    public void finish(){
        driver.quit();
    }

}