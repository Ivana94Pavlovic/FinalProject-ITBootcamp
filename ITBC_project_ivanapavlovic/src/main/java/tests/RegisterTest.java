package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends BaseTest{

    @Test
    public void verifyRegisterPageLoads(){
        getRegisterPage().openRegisterPage();

        Assert.assertTrue(getDriver().getCurrentUrl().contains("/register"));
    }

    @Test
    public void verifyUserCanNotRegisterWithoutCaptcha(){

        getRegisterPage().openRegisterPage()
                .enterFirstName("Susan")
                .enterLastNime("Banson")
                .scroll(400)
                .enterUserName("Sussy")
                .enterPassword("Susan*1994")
                .clickBtn(getRegisterPage().getRegisterBtn());

        Assert.assertEquals(getRegisterPage().getErrorMessage().getText(), "Please verify reCaptcha to register!");
    }

    @Test
    public void verifyPasswordIsRequiredForRegistration(){

        getRegisterPage().openRegisterPage()
                .enterFirstName("Susan")
                .enterLastNime("Banson")
                .scroll(400)
                .enterUserName("Sussy")
                .clickBtn(getRegisterPage().getRegisterBtn());

    }
}
