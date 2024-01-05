package actionObjects;

import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddToCardActions {
    WebDriver driver;

    public AddToCardActions(WebDriver driver9) {
        driver = driver9;
    }


    @Step("მობილურების გვერდზე გადასვლა")
    public void addToCardActions() {
        WebElement mobilePhone = driver.findElement(By.linkText("მობილურები"));
        mobilePhone.click();

    }
    @Step("პროდუქტის გახსნა")
    public void addToCardActions2(){
        WebElement addFirstPhone = driver.findElement(By.id("product-img-37283"));
        addFirstPhone.click();
    }
    @Step("კალათაში დამატება")
    public void addToCardActions3(){
        WebElement addPhoneToCart = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[3]/div[2]/div/div/div[2]/div/div[2]/div[3]/div/div[2]/h4"));
        addPhoneToCart.click();
    }
    @Step("კალათის შემოწმება")
    public void addToCardActions4(){
        WebElement checkCart = driver.findElement(By.id("cart-p"));
        checkCart.click();
    }
}
