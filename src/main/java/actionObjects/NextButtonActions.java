package actionObjects;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NextButtonActions {
        WebDriver driver;
        public  NextButtonActions(WebDriver driver13){

            driver = driver13;
    }
    @Step("შემდეგ რეკლამაზე გადასვლა")
        public void clickNext() throws InterruptedException {

        By nextButtonLocator = By.xpath("//*[@id=\"__next\"]/div/div[3]/div[1]/div/div[2]/div/div[2]/img[2]");
        int numberOfClicks = 13;
        for (int i = 0; i < numberOfClicks; i++) {
            WebElement nextButton = driver.findElement(nextButtonLocator);
            nextButton.click();
        }
    }

}
