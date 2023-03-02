import config.WebDriverConfig;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.MainPage;
import pages.OrderPage;

import java.time.LocalDate;

public class CreateOrderOnlyRequiredFieldsFormTest {

    private WebDriver driver;

    @Before
    public void setup() {
        driver = WebDriverConfig.get();
    }

    @After
    public void teardown() {
        driver.quit();
    }


    @Test
    public void checkSetOnlyRequiredFieldsFormAndCreateOrder() {
        LocalDate currentDate = LocalDate.now();
        MainPage mainPage = new MainPage(driver);
        mainPage.clickDownButtonOrder();
        OrderPage orderPage = new OrderPage(driver);
        orderPage.setOnlyRequiredFieldsFormAndCreateOrder("Иван","Алексеев","Мира 25, кв. 13",
                "Павелецкая","89234567812",currentDate.plusDays(1).toString(),"сутки");
        Assert.assertTrue(orderPage.getTextModalOrderSuccess());
    }
}
