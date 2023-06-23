package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ButtonsTest extends BaseTest{

    @Test
    public void verifyButtonsPageLoads(){
        getButtonsPage().openButtonsPage();

        Assert.assertTrue(getDriver().getCurrentUrl().contains("/buttons"));
    }

    @Test
    public void verifyDoubleClickMeBtn(){

        getButtonsPage().openButtonsPage()
                .actionDoubleClick(getButtonsPage().getDoubleClickBtn());

        Assert.assertTrue(getButtonsPage().getConfirmDoubleClick().getText().contains("double click"));
    }

    @Test
    public void verifyRightClickMeBtn(){

        getButtonsPage().openButtonsPage()
                .actionRightClick(getButtonsPage().getRightClickMeBtn());

        Assert.assertTrue(getButtonsPage().getConfirmRightClick().isDisplayed());
    }

    @Test
    public void verifyClickMeBtn(){

        getButtonsPage().openButtonsPage()
                .actionRegularClick(getButtonsPage().getClickMeBtn());

        Assert.assertTrue(getButtonsPage().getConfirmClickMe().getText().contains("done a dynamic"));
    }
}
