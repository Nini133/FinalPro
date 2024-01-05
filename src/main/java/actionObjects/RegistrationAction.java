package actionObjects;

import PageObjects.RegistrationObject;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationAction extends RegistrationObject {
    WebDriver driver;

    public RegistrationAction(WebDriver driver3) {
        driver = driver3;

    }

    @Step("მობილურის ნომრის შეყვანა")
    public void regNumber(String mobileNumber){
        driver.findElement(registrationNumberField).sendKeys(mobileNumber);
    }

    @Step("გვერდზე გადასვლა")
    public void loginAct(){
        WebElement login = driver.findElements(By.className("sc-f9c7bae0-13")).get(1);
        login.click();
    }
    @Step("შესავსები ველის პოვნა")
    public void loginAct2(){
        WebElement registration = driver.findElement(By.className("sc-76160106-5"));
        registration.click();
    }
    @Step("ჩექმარქის მონიშვნა")
    public void loginAct3(){
        WebElement checkMark = driver.findElement(By.className("sc-c27aa0ae-1"));
        checkMark.click();
    }
    @Step("რეგისტრაციის ღილაკზე დაქლიქება")
    public void loginAct4(){
        WebElement registrationButton = driver.findElement(By.xpath("//*[@id=\"portal\"]/div/div/div/div[2]/div/div[1]/button"));
        registrationButton.click();
    }


}
