import BrowserPackage.BrowserActions;
import actionObjects.*;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import static DataObject.SeachData.*;


public class MainPage extends BrowserActions {
    @Test
    @Description("Search ღილაკის გამოყენება")
    public void SearchButton() throws InterruptedException {
        SearchAction action2 = new SearchAction(driver);
        Thread.sleep(5000);
        action2.searchButton(product1);
//        action2.searchButton(product2);
        Thread.sleep(3000);
        action2.pressEnter();
        Thread.sleep(3000);


    }

    @Test
    @Description("რეკლამების Next ღილაკით მიმოცვლა")
    public void ClickAdsSeveralTimes() throws InterruptedException {
        NextButtonActions clickAds = new NextButtonActions(driver);
        Thread.sleep(3000);
        clickAds.clickNext();
        Thread.sleep(3000);
    }


}

