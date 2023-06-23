package pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextBoxPage extends BasePage {
    Faker faker = new Faker();
    private WebElement fullName;
    private WebElement  email;
    private WebElement currentAddress;
    private WebElement permanentAddress;
    private WebElement submitBtn;
    private WebElement checkAllDataPresence;
    private WebElement invalidemailBox;

    public TextBoxPage(WebDriver driver, WebDriverWait wait, JavascriptExecutor js, Actions actions) {
        super(driver, wait, js, actions);
    }

    public WebElement getFullName(){
        fullName = getDriver().findElement(By.id("userName"));
        return fullName;
    }
    public WebElement getEmail(){
        email = getDriver().findElement(By.id("userEmail"));
        return email;
    }
    public WebElement getCurrentAddress(){
        currentAddress = getDriver().findElement(By.id("currentAddress"));
        return currentAddress;
    }
    public WebElement getPermanentAddress(){
        permanentAddress = getDriver().findElement(By.id("permanentAddress"));
        return permanentAddress;
    }
    public WebElement getSubmitBtn(){
        submitBtn = getDriver().findElement(By.id("submit"));
        return submitBtn;
    }
    public WebElement getCheckAllDataPresence(){
        checkAllDataPresence = getDriver().findElement(By.xpath("//div[@class='border col-md-12 col-sm-12']"));
        return checkAllDataPresence;
    }

    public WebElement getINVALIDemailBox() {
        invalidemailBox = getDriver().findElement(By.xpath("//input[@class='mr-sm-2 field-error form-control']"));
        return invalidemailBox;
    }

    public TextBoxPage getFakeName() {
        getFullName().sendKeys((CharSequence) faker.name().fullName());
        return this;
    }
    public TextBoxPage getFakeEmail() {
        getEmail().sendKeys((CharSequence) faker.internet().emailAddress());
        return this;
    }
    public TextBoxPage getInvalidEmail() {
        getEmail().sendKeys((CharSequence) faker.internet().domainName());
        return this;
    }

    public TextBoxPage getFakeCurrentAddress() {
        getCurrentAddress().sendKeys((CharSequence) faker.address().fullAddress());
        return this;
    }
    public TextBoxPage getFakePermanentAddress() {
        getPermanentAddress().sendKeys((CharSequence) faker.address().secondaryAddress());
        return this;
    }

    public TextBoxPage openTextBoxPage(){
        getDriver().get("https://demoqa.com/text-box");
        return this;
    }

    public TextBoxPage scroll(int pixel){
        getJs().executeScript("window.scrollBy(0," + pixel + ")");
        return this;
    }

    public boolean visibilityOfelement() {

        if (getDriver().getPageSource().contains("Name:")){
            return false;
        }else{
            return true;
        }
    }
}
