package StepDefination;

import Helper.GeneralMethods;
import PageObjects.LoginPageObject;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class SignIn_StepTest
{
    LoginPageObject loginPageObject;
    GeneralMethods generalMethods;

    public  SignIn_StepTest()
    {
        loginPageObject = new LoginPageObject();
        generalMethods = new GeneralMethods();
    }

    @And("Fill email {string}")
    public void fillEmail(String email)
    {
        loginPageObject.FillEmail(email);

    }

    @And("Fill password {string}")
    public void fillPassword(String password)
    {
        loginPageObject.FillPassword(password);
    }

    @Then("Should see {} element text equal to {}")
    public void shouldSee(String accountText,String expectedText) {
        generalMethods.ShouldSee(accountText,expectedText);
    }
}

