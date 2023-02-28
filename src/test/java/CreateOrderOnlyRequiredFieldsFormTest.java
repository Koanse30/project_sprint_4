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
        orderPage.setName("Иван");
        orderPage.setSurname("Алексеев");
        orderPage.setAddress("Мира 25, кв. 13");
        orderPage.setMetroStation("Павелецкая");
        orderPage.setPhone("89234567812");
        orderPage.clickButtonNext();
        orderPage.setDate(currentDate.plusDays(1).toString());
        orderPage.setRentPeriod("сутки");
        orderPage.clickButtonOrder();
        orderPage.clickButtonAgreeOrder();
        Assert.assertTrue(orderPage.getTextModalOrderSuccess());
    }
}
