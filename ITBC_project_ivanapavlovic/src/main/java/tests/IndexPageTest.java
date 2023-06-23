package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class IndexPageTest extends BaseTest{

    @Test
    public void openAlertsPage(){
        getIndexPage().openIndexpage()
                .scroll(250)
                .clickBtn(getIndexPage().getAlertsCard());

        Assert.assertTrue(getDriver().getCurrentUrl().contains("/alertsWindows"));
    }

    @Test
    public void openElementsPage(){
        getIndexPage().openIndexpage()
                .scroll(250)
                .clickBtn(getIndexPage().getElementsCard());

        Assert.assertTrue(getDriver().getCurrentUrl().contains("/elements"));
    }

    @Test
    public void openFormsPage(){

        getIndexPage().openIndexpage()
                .scroll(250)
                .clickBtn(getIndexPage().getFormsCard());

        Assert.assertTrue(getDriver().getCurrentUrl().contains("/forms"));
    }

    @Test
    public void openWidgetsPage(){

        getIndexPage().openIndexpage()
                .scroll(250)
                .clickBtn(getIndexPage().getWidgetsCard());

        Assert.assertTrue(getDriver().getCurrentUrl().contains("/widgets"));
    }

    @Test
    public void openInteractionsPage(){

        getIndexPage().openIndexpage()
                .scroll(250)
                .clickBtn(getIndexPage().getInteractionsCard());

        Assert.assertTrue(getDriver().getCurrentUrl().contains("/interaction"));
    }

    @Test
    public void openBookStorePage(){

        getIndexPage().openIndexpage()
                .scroll(700)
                .clickBtn(getIndexPage().getBookStoreCard());

        Assert.assertTrue(getDriver().getCurrentUrl().matches("https://demoqa.com/books"));
    }
}
