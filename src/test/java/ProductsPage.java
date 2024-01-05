import BrowserPackage.BrowserActions;
import actionObjects.*;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class ProductsPage extends BrowserActions {
    @Test
    @Description("პროდუქტების სორტირება A-Z ის მიხედვით")
    public void sortingProducts() throws InterruptedException {
        SortingActions action7 = new SortingActions(driver);
        Thread.sleep(3000);
        action7.phoneAction();
        Thread.sleep(5000);
        action7.forAction();
    }

}