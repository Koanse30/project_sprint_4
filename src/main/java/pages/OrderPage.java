package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrderPage {

    private final WebDriver driver;
    //Поля для заполнения формы заказа (1 страница).
    private final By nameField = By.xpath("//input[@placeholder=\"* Имя\"]");
    private final By surnameField = By.xpath("//input[@placeholder=\"* Фамилия\"]");
    private final By addressField = By.xpath("//input[@placeholder=\"* Адрес: куда привезти заказ\"]");
    private final By metroStationField = By.xpath("//input[@placeholder=\"* Станция метро\"]");
    private final By phoneField = By.xpath("//input[@placeholder=\"* Телефон: на него позвонит курьер\"]");
    private final By buttonNext = By.xpath("//button[text()=\"Далее\"]");
    //Поля для заполнения формы заказа (2 страница).
    private final By dateField = By.xpath("//input[@placeholder=\"* Когда привезти самокат\"]");
    private final By rentPeriodField = By.className("Dropdown-arrow");
    private final By blackColorCheckbox = By.id("black");
    private final By greyColorCheckbox = By.id("grey");
    private final By commentField = By.xpath("//input[@placeholder=\"Комментарий для курьера\"]");
    private final By buttonOrder = By.xpath("//*[@class=\"Button_Button__ra12g Button_Middle__1CSJM\"][text()=\"Заказать\"]");
    private final By buttonAgreeOrder = By.xpath("//button[text()=\"Да\"]");
    private final By modalHeaderOrderSuccess = By.xpath("//*[@class=\"Order_ModalHeader__3FDaJ\"][text()=\"Заказ оформлен\"]");

    public OrderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setName(String name) {
        driver.findElement(nameField).sendKeys(name);
    }

    public void setSurname(String surname) {
        driver.findElement(surnameField).sendKeys(surname);
    }

    public void setAddress(String address) {
        driver.findElement(addressField).sendKeys(address);
    }

    public void setMetroStation(String metroStation) {
        driver.findElement(metroStationField).click();
        driver.findElement(metroStationField).sendKeys(metroStation);
        new WebDriverWait(driver, 3)
                .until(ExpectedConditions.elementToBeClickable(By.className("select-search__row")));
        driver.findElement(By.className("select-search__row")).click();
    }

    public void setPhone(String phone) {
        driver.findElement(phoneField).sendKeys(phone);
    }

    public void clickButtonNext() {
        driver.findElement(buttonNext).click();
    }

    public void setDate(String date) {
        driver.findElement(dateField).sendKeys(date);
    }

    public void setRentPeriod(String rentPeriod) {
        driver.findElement(rentPeriodField).click();
        String element = "//*[@class=\"Dropdown-option\"][text()=\"" + rentPeriod + "\"]";
        driver.findElement(By.xpath(element)).click();
    }

    public void setColorScooter(String color) {
        if (color.equals("black")) {
            driver.findElement(blackColorCheckbox).click();
        } else if (color.equals("grey")) {
            driver.findElement(greyColorCheckbox).click();
        }
    }

    public void setComment(String comment) {
        driver.findElement(commentField).sendKeys(comment);
    }

    public void clickButtonOrder() {
        driver.findElement(buttonOrder).click();
    }

    public void clickButtonAgreeOrder() {
        new WebDriverWait(driver, 3).until(ExpectedConditions.elementToBeClickable(buttonAgreeOrder));
        driver.findElement(buttonAgreeOrder).click();
    }

    public boolean getTextModalOrderSuccess() {
        return driver.findElement(modalHeaderOrderSuccess).isDisplayed();
    }

    public void setOnlyRequiredFieldsFormAndCreateOrder(String name, String surname, String address,
                                                        String metroStation, String phone, String date, String rentPeriod) {
        setName(name);
        setSurname(surname);
        setAddress(address);
        setMetroStation(metroStation);
        setPhone(phone);
        clickButtonNext();
        setDate(date);
        setRentPeriod(rentPeriod);
        clickButtonOrder();
        clickButtonAgreeOrder();
    }
}
