package tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class LogInTest extends BaseTest{

    @Test
    public void verifyLogInPageLoads(){
        getLogInPage().openLogInPage();

        Assert.assertTrue(getDriver().getCurrentUrl().contains("/login"));
    }

    @Test
    public void verifyErrorLogInWithNoRegistration(){

        getLogInPage().openLogInPage()
                .enterUsername("John")
                .enterPassword("john123")
                .scroll(400)
                .clickBtn(getLogInPage().getLogInBtn())
                .getDriver().manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);

        Assert.assertTrue(getLogInPage().getErrorMessage().isDisplayed());
    }

    @Test
    public void verifyLogInWithRegisteredUser(){

        getLogInPage().openLogInPage()
                .enterUsername("Sussy")
                .enterPassword("Susan*1994")
                .scroll(350)
                .clickBtn(getLogInPage().getLogInBtn())
                .getWait().until(ExpectedConditions.urlMatches("https://demoqa.com/profile"));

        Assert.assertTrue(getDriver().getCurrentUrl().contains("/profile"));
    }

    @Test
    public void verifyUserCanNotLogInAgainBeforeLogOut(){

        getLogInPage().openLogInPage()
                .enterUsername("Sussy")
                .enterPassword("Susan*1994")
                .scroll(350)
                .clickBtn(getLogInPage().getLogInBtn())
                .getWait().until(ExpectedConditions.urlMatches("https://demoqa.com/profile"));
        getLogInPage().openLogInPage()
                .getWait().until(ExpectedConditions.urlContains("/login"));

        Assert.assertEquals(getLogInPage().getAlreadyLoggedInMessage().getText(), "You are already logged in. View your profile.");
    }
}
