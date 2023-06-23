package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IndexPage extends BasePage{

    private WebElement alertsCard;
    private WebElement elementsCard;
    private WebElement formsCard;
    private WebElement widgetsCard;
    private WebElement interactionsCard;
    private WebElement bookStoreCard;

    public IndexPage(WebDriver driver, WebDriverWait wait, JavascriptExecutor js, Actions actions) {
        super(driver, wait, js, actions);
    }

    public WebElement getAlertsCard() {
        alertsCard = getDriver().findElement(By.xpath("//h5[contains(text(),'Alerts, Frame & Windows')]"));
        return alertsCard;
    }

    public WebElement getElementsCard(){
        elementsCard = getDriver().findElement(By.xpath("//h5[contains(text(),'Elements')]"));
        return elementsCard;
    }

    public WebElement getFormsCard() {
        formsCard = getDriver().findElement(By.xpath("//h5[contains(text(), 'Forms')]"));
        return formsCard;
    }

    public WebElement getWidgetsCard() {
        widgetsCard = getDriver().findElement(By.xpath("//h5[contains(text(), 'Widgets')]"));
        return widgetsCard;
    }

    public WebElement getInteractionsCard() {
        interactionsCard = getDriver().findElement(By.xpath("//h5[contains(text(), 'Interactions')]"));
        return interactionsCard;
    }

    public WebElement getBookStoreCard() {
        bookStoreCard = getDriver().findElement(By.xpath("//h5[contains(text(), 'Book Store Application')]"));
        return bookStoreCard;
    }

    public IndexPage clickBtn(WebElement element){
        getActions().click(element).perform();
        return this;
    }

    public IndexPage scroll(int pixel){
        getJs().executeScript("window.scrollBy(0," + pixel + ")");
        return this;
    }

    public IndexPage openIndexpage (){
        getDriver().get("https://demoqa.com");
        return this;
    }
}
