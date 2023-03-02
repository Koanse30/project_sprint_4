import config.WebDriverConfig;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import pages.MainPage;
import pages.OrderPage;

import java.time.LocalDate;

@RunWith(Parameterized.class)
public class CreateOrderParametrizedTest {

    private WebDriver driver;

    private final String buttonPlace;
    private final String name;
    private final String surname;
    private final String address;
    private final String metroStation;
    private final String phone;
    private final String date;
    private final String rentPeriod;
    private final String colorScooter;
    private final String comment;

    public CreateOrderParametrizedTest(String buttonPlace, String name, String surname, String address, String metroStation, String phone,
                                       String date, String rentPeriod, String colorScooter, String comment) {
        this.buttonPlace = buttonPlace;
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.metroStation = metroStation;
        this.phone = phone;
        this.date = date;
        this.rentPeriod = rentPeriod;
        this.colorScooter = colorScooter;
        this.comment = comment;
    }

    @Parameterized.Parameters(name = "Заказ самоката. Тестовые данные: {0}, {1}, {2}, {3}, {4}, {5}, {6}, {7}, {8}, {9}")
    public static Object[][] getOrderData() {
        LocalDate currentDate = LocalDate.now();
        return new Object[][]{
                {"Up", "Иван", "Иванов", "Маркса 23, кв. 12", "Павелецкая", "89234567891", currentDate.plusDays(1).toString(), "сутки", "black", "Домофон работает."},
                {"Up", "Сергеев", "Сергей", "Мира 76, кв. 83", "Лубянка", "89234567892", currentDate.plusWeeks(1).toString(), "трое суток", "black", "Лифт не работает."},
                {"Down", "Алексей", "Алексеев", "Ленина 45, кв. 61", "Черкизовская", "89234567893", currentDate.plusMonths(1).toString(), "семеро суток", "grey", "Звонить."},
        };
    }

    @Before
    public void setup() {
        driver = WebDriverConfig.get();
    }

    @After
    public void teardown() {
        driver.quit();
    }


        @Test
        public void checkSetAllFieldsFormAndCreateOrder() {
            MainPage mainPage = new MainPage(driver);
            mainPage.clickButtonOrder(buttonPlace);
            OrderPage orderPage = new OrderPage(driver);
            orderPage.setName(name);
            orderPage.setSurname(surname);
            orderPage.setAddress(address);
            orderPage.setMetroStation(metroStation);
            orderPage.setPhone(phone);
            orderPage.clickButtonNext();
            orderPage.setDate(date);
            orderPage.setRentPeriod(rentPeriod);
            orderPage.setColorScooter(colorScooter);
            orderPage.setComment(comment);
            orderPage.clickButtonOrder();
            orderPage.clickButtonAgreeOrder();
            Assert.assertTrue(orderPage.getTextModalOrderSuccess());
        }
    }
