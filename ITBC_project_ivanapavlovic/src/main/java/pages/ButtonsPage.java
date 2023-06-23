package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ButtonsPage extends BasePage{

    private WebElement doubleClickBtn;
    private WebElement rightClickMeBtn;
    private WebElement clickMeBtn;

    //Messages
    private WebElement confirmDoubleClick;
    private WebElement confirmRightClick;
    private WebElement confirmClickMe;

    public ButtonsPage(WebDriver driver, WebDriverWait wait, JavascriptExecutor js, Actions actions) {
        super(driver, wait, js, actions);
    }
    public WebElement getDoubleClickBtn() {
        doubleClickBtn = getDriver().findElement(By.id("doubleClickBtn"));
        return doubleClickBtn;
    }
    public WebElement getRightClickMeBtn() {
        rightClickMeBtn = getDriver().findElement(By.id("rightClickBtn"));
        return rightClickMeBtn;
    }
    public WebElement getClickMeBtn() {
        clickMeBtn = getDriver().findElement(By.xpath("//div[@class='col-12 mt-4 col-md-6']/div[position()=2]/div[position()=3]/button[@type='button']"));
        return clickMeBtn;
    }
    public WebElement getConfirmDoubleClick() {
        confirmDoubleClick = getDriver().findElement(By.id("doubleClickMessage"));
        return confirmDoubleClick;
    }
    public WebElement getConfirmRightClick() {
        confirmRightClick = getDriver().findElement(By.id("rightClickMessage"));
        return confirmRightClick;
    }
    public WebElement getConfirmClickMe() {
        confirmClickMe = getDriver().findElement(By.id("dynamicClickMessage"));
        return confirmClickMe;
    }

    public ButtonsPage actionDoubleClick(WebElement element){
        getActions().doubleClick(element).perform();
        return this;
    }
    public ButtonsPage actionRightClick(WebElement element){
        getActions().contextClick(element).perform();
        return this;
    }
    public ButtonsPage actionRegularClick(WebElement element){
        getActions().click(element).perform();
        return this;
    }

    public ButtonsPage openButtonsPage() {
        getDriver().get("https://demoqa.com/buttons");
        return this;
    }
}
