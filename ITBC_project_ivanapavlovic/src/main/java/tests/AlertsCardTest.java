package tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertsCardTest extends BaseTest{

    @Test
    public void verifyClickMeBtnIsClickableAfterAlertClose(){
        getAlertsCardPage().openAlertsCardPage()
                .clickBtn(getAlertsCardPage().getFirstClickMeBtn())
                .getAlert().accept();

      Assert.assertTrue(getWait().until(ExpectedConditions.elementToBeClickable(getAlertsCardPage().getFirstClickMeBtn())).isEnabled());
    }

    @Test
    public void verifySecondClickMeBtn(){
        getAlertsCardPage().openAlertsCardPage()
                .clickBtn(getAlertsCardPage().getSecondClickMeBtn())
                .waitUntilAlertShowsUp()
                .getAlert().accept();

        Assert.assertTrue(getWait().until(ExpectedConditions.elementToBeClickable(getAlertsCardPage().getSecondClickMeBtn())).isEnabled());

    }

    @Test
    public void verifyConfirmMessageAfterConfirmThirdBtnAlert(){
        getAlertsCardPage().openAlertsCardPage()
                .clickBtn(getAlertsCardPage().getThirdClickMeBtn())
                .getAlert().accept();

        Assert.assertEquals(getAlertsCardPage().getThirdConfirmationText().getText(), "You selected Ok");
    }

    @Test
    public void verifyFourthClickMeBtn(){
        getAlertsCardPage().openAlertsCardPage()
                .scroll(150)
                .clickBtn(getAlertsCardPage().getFourthClickMeBtn())
                .getAlert().sendKeys("Ivana");
        getAlertsCardPage().getAlert().accept();

        Assert.assertEquals(getAlertsCardPage().getFourthConfirmationText().getText(), "You entered Ivana");
    }

}