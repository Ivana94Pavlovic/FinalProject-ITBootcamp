package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AlertsCardPage extends BasePage {

    private WebElement firstClickMeBtn;
    private WebElement secondClickMeBtn;
    private WebElement thirdClickMeBtn;
    private WebElement fourthClickMeBtn;

    //Alerti

    private Alert alert;

    //confirmation text for 3rd and 4th "Click me"
    private WebElement thirdConfirmationText;
    private WebElement fourthConfirmationText;

    public AlertsCardPage(WebDriver driver, WebDriverWait wait, JavascriptExecutor js, Actions actions) {
        super(driver, wait, js, actions);
    }


    public WebElement getFirstClickMeBtn(){
        firstClickMeBtn = getDriver().findElement(By.id("alertButton"));
        return firstClickMeBtn;
    }

    public WebElement getSecondClickMeBtn() {
        secondClickMeBtn = getDriver().findElement(By.id("timerAlertButton"));
        return secondClickMeBtn;
    }

    public WebElement getThirdClickMeBtn() {
        thirdClickMeBtn = getDriver().findElement(By.id("confirmButton"));
        return thirdClickMeBtn;
    }

    public WebElement getFourthClickMeBtn() {
        fourthClickMeBtn = getDriver().findElement(By.id("promtButton"));
        return fourthClickMeBtn;
    }

    public WebElement getThirdConfirmationText(){
        thirdConfirmationText = getDriver().findElement(By.id("confirmResult"));
        return thirdConfirmationText;
    }

    public WebElement getFourthConfirmationText(){
        fourthConfirmationText = getDriver().findElement(By.id("promptResult"));
        return fourthConfirmationText;
    }

    public Alert getAlert(){
        alert = getDriver().switchTo( ).alert( );
        return alert;
    }

    public AlertsCardPage clickBtn(WebElement element){
        getActions().click(element).perform();
        return this;
    }

    public AlertsCardPage waitUntilAlertShowsUp (){
        getWait().until(ExpectedConditions.alertIsPresent());
        return this;
    }

    public AlertsCardPage scroll(int pixel){
        getJs().executeScript("window.scrollBy(0," + pixel + ")");
        return this;
    }

    public AlertsCardPage openAlertsCardPage(){
        getDriver().get("https://demoqa.com/alerts");
        return this;
    }
}
