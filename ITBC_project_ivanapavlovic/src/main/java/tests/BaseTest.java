package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
//import pages.AlertsCardPage;
import pages.*;

import java.time.Duration;

public class BaseTest {

    private WebDriver driver;
    private WebDriverWait wait;
    private Actions actions;
    private JavascriptExecutor js;
    private IndexPage indexPage;
    private AlertsCardPage alertsCardPage;
    private TextBoxPage textBoxPage;
    private RadioButtonPage radioButtonPage;
    private ButtonsPage buttonsPage;
    private LogInPage logInPage;
    private RegisterPage registerPage;

    @BeforeClass
    public void setUp (){

        System.setProperty("webdriver.chrome.driver", "C://Users//PC//Desktop//chromedriver_win32//chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        js = (JavascriptExecutor) driver;
        actions = new Actions(driver);
        indexPage = new IndexPage(driver, wait, js, actions);
        alertsCardPage = new AlertsCardPage(driver, wait, js, actions);
        textBoxPage = new TextBoxPage(driver, wait, js, actions);
        radioButtonPage = new RadioButtonPage(driver, wait, js, actions);
        buttonsPage = new ButtonsPage(driver, wait, js, actions);
        logInPage = new LogInPage(driver, wait, js, actions);
        registerPage = new RegisterPage(driver, wait, js, actions);
    }

    @BeforeMethod
    public void beforeEachTest () {
        driver.manage().window().maximize();
    }

    public WebDriver getDriver(){
        return this.driver;
    }

    public WebDriverWait getWait() {
        return wait;
    }

    public Actions getActions() {
        return actions;
    }

    public JavascriptExecutor getJs() {
        return js;
    }

    public IndexPage getIndexPage() {
        return indexPage;
    }

    public AlertsCardPage getAlertsCardPage(){
        return alertsCardPage;
    }

    public TextBoxPage getTextBoxPage() {
        return textBoxPage;
    }

    public RadioButtonPage getRadioButtonPage() {
        return radioButtonPage;
    }

    public ButtonsPage getButtonsPage() {
        return buttonsPage;
    }
    public LogInPage getLogInPage() {
        return logInPage;
    }

    public RegisterPage getRegisterPage() {
        return registerPage;
    }

    @AfterClass
    public void close() {
        driver.close();
    }
}
