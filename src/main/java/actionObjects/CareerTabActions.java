package actionObjects;

import PageObjects.CareerTabObjects;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class CareerTabActions extends CareerTabObjects {
    WebDriver driver;
    public CareerTabActions (WebDriver driver20) {
        driver = driver20;

    }
    @Step("კარიერის გვერდზე დაქლიქება")
    public void careerBar() {driver.findElement(CareerTab).click();
    }
    @Step("გვერდზე ლინკის თაბზე დაქლიქება")
    public void cliCkLink(){driver.findElement(careerLink).click();}
}
