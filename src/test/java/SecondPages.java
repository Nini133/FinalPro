import BrowserPackage.BrowserActions;
import actionObjects.*;
import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import static DataObject.shopsData.*;

public class SecondPages extends BrowserActions {
    @Test
    @Description("ნავიგაციის ტაბის გამოყენება")
    public void navigationBar() throws InterruptedException {
        NavigationActions action8 = new NavigationActions(driver);
        action8.navigationBar();
        Thread.sleep(3000);
        action8.categoryBar();
        Thread.sleep(2000);
        String expectedResult = "Virtaul Reality Headset";
        String actualResult = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[3]/div/div/div[2]/div[1]/div/div[2]/div[4]/section/div/div/div/div[1]/div/h4")).getText();
        Thread.sleep(3000);
        Assert.assertEquals(actualResult, expectedResult);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualResult, expectedResult);
        Thread.sleep(5000);


}
    @Test
    @Description("კარიერის გვერდი")
    public void careerTab() throws InterruptedException {
        CareerTabActions career = new CareerTabActions(driver);
        Thread.sleep(3000);
        career.careerBar();
        Thread.sleep(5000);
        career.cliCkLink();
        Thread.sleep(5000);
        String expectedResult = "ხშირად დასმული კითხვები: ";
        String actualResult = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[3]/div/div/div/div[2]/p[38]/span/span/span")).getText();
        Assert.assertEquals(actualResult, expectedResult);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualResult, expectedResult);
        Thread.sleep(5000);



    }
    @Test
    @Description("არასწორი მისამართის შეყვანა")
    public void searchForAddress() throws InterruptedException {
        ShopActions action7 = new ShopActions(driver);
        Thread.sleep(5000);
        action7.addressActt();
        Thread.sleep(3000);
        action7.searchButton(wrongAddress);
        Thread.sleep(5000);
        action7.pressEnterAfterSearch();
        Thread.sleep(2000);

    }
}
