package actionObjects;

import PageObjects.shopsObjects;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ShopActions extends shopsObjects {
    WebDriver driver;


    public ShopActions(WebDriver driver7) {
        driver = driver7;

    }

    @Step("პროდუქტის გადაცემა და მოძებნა")
    public void searchButton(String product7) {
        driver.findElement(shopAddresses).sendKeys(product7);
    }
    @Step("ძებნის ღილაკზე დაქლიქება")
    public void pressEnterAfterSearch() {
        new Actions(driver).sendKeys(Keys.ENTER).perform();
    }
    @Step("მისამართის მოძებნა")
    public void addressActt(){
        WebElement addressesBut = driver.findElement(By.cssSelector("#__next > div > div.sc-f9c7bae0-0.dOlBNQ > div.sc-f9c7bae0-1.dkJgqa > div > div > div.sc-f9c7bae0-5.iZbZle > h4:nth-child(6)"));
        addressesBut.click();
    }
}

