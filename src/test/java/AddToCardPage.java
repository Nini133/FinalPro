import BrowserPackage.BrowserActions;
import actionObjects.*;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AddToCardPage extends BrowserActions {
    @Test
    @Description("ნივთის კალათაში დამატება")
    public void addToCart() throws InterruptedException {
            AddToCardActions action3 = new AddToCardActions(driver);
            Thread.sleep(2000);
            action3.addToCardActions();
            Thread.sleep(5000);
            action3.addToCardActions2();
            Thread.sleep(5000);
            action3.addToCardActions3();
            action3.addToCardActions4();
            Thread.sleep(5000);
            String expectedResult = "შენს კალათაში 1 ნივთია";
            String actualResult = driver.findElement(By.className("sc-ee6d7bd2-5")).getText();
            Assert.assertEquals(actualResult, expectedResult);
            SoftAssert softAssert = new SoftAssert();
            softAssert.assertEquals(actualResult, expectedResult);


        }
    }
