package actionObjects;

import PageObjects.NavigationObjects;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavigationActions extends NavigationObjects {
    WebDriver driver;

    public NavigationActions(WebDriver driver12) {
        driver = driver12;


    }
    @Step("ნავიგაციის ტაბზე დაჭერა")
    public void navigationBar(){ driver.findElement(navigation).click();
    }
    @Step("კატეგორიების ტაბზე დაჭერა")
    public void categoryBar(){driver.findElement(chooseCategory).click();}
}