package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LogInObjects {
    protected By emailField = By.xpath("//*[@id=\"portal\"]/div/div/div/div[2]/div/div[2]/div[1]/input");
    protected By passwordField = By.name("password");
    protected By logInButton = By.className("sc-389461ae-8");
    public By loginWithNumber = By.xpath("//*[@id=\"portal\"]/div/div/div/div[2]/div/div[2]/div/div[2]/input");




}
