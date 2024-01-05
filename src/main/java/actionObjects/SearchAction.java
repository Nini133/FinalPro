package actionObjects;

import PageObjects.searchObjects;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class SearchAction extends searchObjects {
    WebDriver driver;

    public SearchAction(WebDriver driver2) {
        driver = driver2;

    }
    @Step("ძიების ველის პოვნა და ინფორმაციის გადაცემა")
    public void searchButton(String product1){
        driver.findElement(searchBut).sendKeys(product1);
        
    }
    @Step("ენთერზე დაქლიქება კლავიატურიდან")

    public void pressEnter() {
        new Actions(driver).sendKeys(Keys.ENTER).perform();

    }
}
