package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RadioButtonPage extends BasePage{

    private WebElement yesBtn;
    private WebElement impressiveBtn;
    private WebElement noBtn;

    private WebElement confirmYesBtn;
    private WebElement confirmImpressiveBtn;

    public RadioButtonPage(WebDriver driver, WebDriverWait wait, JavascriptExecutor js, Actions actions) {
        super(driver, wait, js, actions);
    }

    public WebElement getYesBtn() {
        yesBtn = getDriver().findElement(By.id("yesRadio"));
        return yesBtn;
    }

    public WebElement getImpressiveBtn() {
        impressiveBtn = getDriver().findElement(By.id("impressiveRadio"));
        return impressiveBtn;
    }

    public WebElement getNoBtn() {
        noBtn = getDriver().findElement(By.id("noRadio"));
        return noBtn;
    }

    public WebElement getConfirmYesBtn(){
        confirmYesBtn = getDriver().findElement(By.xpath("//p[@class='mt-3']"));
        return confirmYesBtn;
    }

    public WebElement getConfirmImpressiveBtn(){
        confirmImpressiveBtn = getDriver().findElement(By.xpath("//p[@class='mt-3']"));
        return confirmImpressiveBtn;
    }

    public RadioButtonPage clickBtn(WebElement element){
        getActions().click(element).perform();
        return this;
    }

    public RadioButtonPage openRadioButtonPage(){
        getDriver().get("https://demoqa.com/radio-button");
        return this;
    }
}
