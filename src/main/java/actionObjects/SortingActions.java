package actionObjects;

import PageObjects.LogInObjects;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SortingActions {
    WebDriver driver;
    public  SortingActions(WebDriver driver11){
        driver = driver11;
    }
    @Step("პროდუქტზე დაქლიქება")
    public void phoneAction(){
        WebElement mobilePhone = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[3]/div[1]/div/div[1]/div/div/div/div[5]/a/div[1]"));
        mobilePhone.click();
    }

    @Step("გვერდის დასორტვა")

    public void forAction() throws InterruptedException {
        By dropdownLocator = By.xpath("//*[@id=\"__next\"]/div/div[3]/div/div/div[1]/div[1]/div[2]/div/div/div[1]");
        WebElement dropdown = driver.findElement(dropdownLocator);
        dropdown.click();
        By dropdownOptionsLocator = By.xpath("//*[@id=\"__next\"]/div/div[3]/div/div/div[1]/div[1]/div[2]/div/div/div[2]/div/h4[3]");
        List<WebElement> dropdownOptions = driver.findElements(dropdownOptionsLocator);
        for (int i = 0; i < dropdownOptions.size(); i++) {
            WebElement option = dropdownOptions.get(i);
            option.click();
            Thread.sleep(5000);
    }

}
}