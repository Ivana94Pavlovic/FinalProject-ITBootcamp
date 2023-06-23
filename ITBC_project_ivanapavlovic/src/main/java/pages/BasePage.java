package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    private WebDriver driver;
    private WebDriverWait wait;
    private JavascriptExecutor js;
    private Actions actions;

    public BasePage (WebDriver driver, WebDriverWait wait, JavascriptExecutor js, Actions actions){
        this.driver = driver;
        this.wait = wait;
        this.js = js;
        this.actions = actions;
    }

    public JavascriptExecutor getJs() {
        return js;
    }

    public Actions getActions() {
        return actions;
    }

    public WebDriver getDriver(){
        return driver;
    }

    public WebDriverWait getWait (){
        return wait;
    }
}
