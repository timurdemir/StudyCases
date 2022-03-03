package PageObjects;

import Helper.GeneralMethods;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObject extends BasePage
{
    @FindBy(id="txtUserName")
    private WebElement email;

    @FindBy(id="btnLogin")
    private WebElement loginbutton;

    @FindBy(id="txtPassword")
    private WebElement password;

    @FindBy(className = "myAccount")
    private WebElement myAccount;




    public void FillEmail(String emailTxt)
    {
        email.sendKeys(emailTxt);
    }

    public void FillPassword(String passwordTxt){

        password.sendKeys(passwordTxt);
    }










}
