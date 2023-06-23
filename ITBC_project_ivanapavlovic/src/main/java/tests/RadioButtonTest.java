package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonTest extends BaseTest{

    @Test
    public void verifyRadioButtonPageLoads(){
        getRadioButtonPage().openRadioButtonPage();

        Assert.assertTrue(getDriver().getCurrentUrl().contains("/radio-button"));
    }

    @Test
    public void verifyYesBtnIsClickable(){
        getRadioButtonPage().openRadioButtonPage()
                .clickBtn(getRadioButtonPage().getYesBtn());

        Assert.assertTrue(getRadioButtonPage().getConfirmYesBtn().getText().contains("Yes"));
    }

    @Test
    public void verifyImpressiveBtnIsClickable(){
        getRadioButtonPage().openRadioButtonPage()
                .clickBtn(getRadioButtonPage().getImpressiveBtn());

        Assert.assertTrue(getRadioButtonPage().getConfirmImpressiveBtn().isDisplayed());
    }

    @Test
    public void verifyNoBtnIsNotClickable(){
        getRadioButtonPage().openRadioButtonPage()
                .clickBtn(getRadioButtonPage().getNoBtn());

        Assert.assertTrue(!getRadioButtonPage().getNoBtn().isSelected());
    }
}
