import BrowserPackage.BrowserActions;
import actionObjects.*;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import java.util.List;

import static DataObject.LogInData.*;
import static DataObject.RegistrationData.mobileNumber1;


public class TestPage extends BrowserActions {
    @Test(priority = 1)
    @Description ("მეილით და პაროლით დალოგინება")
    public void logInWithCorrectData() throws InterruptedException {
        LogInAction action = new LogInAction(driver);
        action.catchElement();
        action.catchSecondElement();
        action.emailFieldAction(correctEmail);
        action.passwordFieldAction(correctPassword);
        Thread.sleep(3000);
        action.logInButtonAction();
        Thread.sleep(2000);
        String expectedResult = "სულსწრაფად ზუმერში";
        String actualResult = driver.findElement(By.tagName("h2")).getText();
        Assert.assertEquals(actualResult, expectedResult);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualResult, expectedResult);
        Thread.sleep(3000);

    }

    @Test(priority = 2)
    @Description ("მობილურის ნომრით დალოგინება")
    public void logInWithNumber() throws InterruptedException {
        LogInAction action = new LogInAction(driver);
        Thread.sleep(2000);
        action.numberAct();
        action.loginWithNumberAction(mobileNumber);
        Thread.sleep(3000);


    }


    @Test
    @Description ("რეგისტრაცია არასწორი ნომრით")
    @Severity(SeverityLevel.TRIVIAL)
    public void registration() throws InterruptedException {
        Thread.sleep(2000);
        RegistrationAction action5 = new RegistrationAction(driver);
        action5.loginAct();
        action5.loginAct2();
        action5.regNumber(mobileNumber1);
        Thread.sleep(4000);
        action5.loginAct3();
        action5.loginAct4();
        String expectedResult = "არასწორი მონაცემი";
        String actualResult = driver.findElement(By.className("sc-106fa713-3")).getText();
        Assert.assertEquals(actualResult, expectedResult);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualResult, expectedResult);
        Thread.sleep(5000);


    }


}


