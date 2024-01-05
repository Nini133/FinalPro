package actionObjects;

import PageObjects.LogInObjects;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInAction extends LogInObjects {
    WebDriver driver;
    public  LogInAction(WebDriver driver1){
        driver = driver1;
    }

    @Step("იმეილის ჩაწერა")
    public void emailFieldAction(String email){
        driver.findElement(emailField).sendKeys(email);
    }
    @Step("პაროლის ჩაწერა")
    public void passwordFieldAction(String password){
        driver.findElement(passwordField).sendKeys(password);
    }
    @Step("შესვლის ღილაკზე დაჭერა")
    public void logInButtonAction(){
        driver.findElement(logInButton).click();
    }
    @Step("ნომრით დალოგინება")
    public void loginWithNumberAction(String number){
        driver.findElement(loginWithNumber).sendKeys(number);
    }
    @Step("პროდუქტის მოძებნა და დაჭერა")

    public void catchElement(){
        WebElement login = driver.findElements(By.className("sc-f9c7bae0-13")).get(1);
        login.click();
    }
    @Step("მეორე პროდუქტის მოძებნა")
    public void catchSecondElement(){
        WebElement imageLink = driver.findElements(By.className("sc-389461ae-2")).get(1);
        imageLink.click();
    }
    @Step("ნომრის ველის პოვნა")

    public void numberAct(){
        WebElement login = driver.findElements(By.className("sc-f9c7bae0-13")).get(1);
        login.click();
    }

}
