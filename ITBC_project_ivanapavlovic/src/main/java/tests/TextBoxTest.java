package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TextBoxTest extends BaseTest{

    @Test
    public void verifyTextBoxPageIsOpen(){

        getTextBoxPage().openTextBoxPage();

        Assert.assertTrue(getDriver().getCurrentUrl().contains("/text-box"));
    }

    @Test
    public void verifyRepeatedDataBoxShowsUpAfterSubmitWithValidData(){

        getTextBoxPage().openTextBoxPage()
                .scroll(200)
                .getFakeName()
                .getFakeEmail()
                .getFakeCurrentAddress()
                .getFakePermanentAddress()
                .scroll(100)
                .getSubmitBtn().click();

       Assert.assertTrue(getTextBoxPage().getCheckAllDataPresence().isDisplayed());
    }

    @Test
    public void verifyNoSubmitWithAllEmptyFields(){

        getTextBoxPage().openTextBoxPage()
                .scroll(350)
                .getSubmitBtn().click();

       Assert.assertTrue(getTextBoxPage().visibilityOfelement());
    }

    @Test
    public void verifyEmailFieldGetRedEdgesAfterSubmitingWithInvalidEmail(){

        getTextBoxPage().openTextBoxPage()
                .scroll(250)
                .getFakeName()
                .getInvalidEmail()
                .getFakePermanentAddress()
                .scroll(100)
                .getSubmitBtn().click();

        Assert.assertTrue(getTextBoxPage().getINVALIDemailBox().isDisplayed());
    }
}
