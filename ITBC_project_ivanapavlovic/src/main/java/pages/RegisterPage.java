package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage extends BasePage{

    private WebElement firstName;
    private WebElement lastName;
    private WebElement userName;
    private WebElement password;
    private WebElement captchaBtn;
    private WebElement registerBtn;
    private WebElement errorMessage;
    private WebElement passwordRequired;

    public RegisterPage(WebDriver driver, WebDriverWait wait, JavascriptExecutor js, Actions actions) {
        super(driver, wait, js, actions);
    }
    public WebElement getFirstName() {
        firstName = getDriver().findElement(By.id("firstname"));
        return firstName;
    }
    public WebElement getLastName() {
        lastName = getDriver().findElement(By.id("lastname"));
        return lastName;
    }
    public WebElement getUserName() {
        userName = getDriver().findElement(By.id("userName"));
        return userName;
    }
    public WebElement getPassword() {
        password = getDriver().findElement(By.id("password"));
        return password;
    }
    public WebElement getPasswordRequired() {
        passwordRequired = getDriver().findElement(By.xpath("//input[@class='mr-sm-2 is-invalid form-control']"));
        return passwordRequired;
    }
    public WebElement getRegisterBtn() {
        registerBtn = getDriver().findElement(By.id("register"));
        return registerBtn;
    }
    public WebElement getErrorMessage() {
        errorMessage = getDriver().findElement(By.id("name"));
        return errorMessage;
    }

    public RegisterPage enterFirstName(String text){
        getFirstName().sendKeys(text);
        return this;
    }
    public RegisterPage enterLastNime(String text){
        getLastName().sendKeys(text);
        return this;
    }
    public RegisterPage enterUserName(String text){
        getUserName().sendKeys(text);
        return this;
    }
    public RegisterPage enterPassword(String text){
        getPassword().sendKeys(text);
        return this;
    }

    public RegisterPage clickBtn(WebElement element){
        getActions().click(element).perform();
        return this;
    }

    public RegisterPage scroll(int pixel){
        getJs().executeScript("window.scrollBy(0," + pixel + ")");
        return this;
    }

    public RegisterPage openRegisterPage(){
        getDriver().get("https://demoqa.com/register");
        return this;
    }
}
