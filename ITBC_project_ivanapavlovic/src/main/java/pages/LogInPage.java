package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogInPage extends BasePage{

    private WebElement userName;
    private WebElement password;
    private WebElement logInBtn;
    private WebElement errorMessage;
    private WebElement alreadyLoggedInMessage;

    public LogInPage(WebDriver driver, WebDriverWait wait, JavascriptExecutor js, Actions actions) {
        super(driver, wait, js, actions);
    }

    public WebElement getUserName() {
        userName = getDriver().findElement(By.id("userName"));
        return userName;
    }

    public WebElement getPassword() {
        password = getDriver().findElement(By.id("password"));
        return password;
    }

    public WebElement getLogInBtn() {
        logInBtn = getDriver().findElement(By.id("login"));
        return logInBtn;
    }

    public WebElement getErrorMessage() {
        errorMessage = getDriver().findElement(By.id("name"));
        return errorMessage;
    }
    public WebElement getAlreadyLoggedInMessage() {
        alreadyLoggedInMessage = getDriver().findElement(By.id("loading-label"));
        return alreadyLoggedInMessage;
    }

    public LogInPage enterUsername(String text){
        getUserName().sendKeys(text);
        return this;
    }

    public LogInPage enterPassword(String text){
        getPassword().sendKeys(text);
        return this;
    }

    public LogInPage clickBtn(WebElement element){
        getActions().click(element).perform();
        return this;
    }

    public LogInPage scroll(int pixel){
        getJs().executeScript("window.scrollBy(0," + pixel + ")");
        return this;
    }

    public LogInPage openLogInPage(){
        getDriver().get("https://demoqa.com/login");
        return this;
    }
}
