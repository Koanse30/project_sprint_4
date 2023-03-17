package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class MainPage {

    private final WebDriver driver;
    private final By upButtonOrder = By.className("Button_Button__ra12g");
    private final By downButtonOrder = By.className("Button_Middle__1CSJM");
    //Выпадающий список в разделе "Вопросы о важном".
    private final By firstQuestion = By.id("accordion__heading-0");
    private final By firstAnswer = By.xpath("//*[@id=\"accordion__panel-0\"]/p");
    private final By secondQuestion = By.id("accordion__heading-1");
    private final By secondAnswer = By.xpath("//*[@id=\"accordion__panel-1\"]/p");
    private final By thirdQuestion = By.id("accordion__heading-2");
    private final By thirdAnswer = By.xpath("//*[@id=\"accordion__panel-2\"]/p");
    private final By fourthQuestion = By.id("accordion__heading-3");
    private final By fourthAnswer = By.xpath("//*[@id=\"accordion__panel-3\"]/p");
    private final By fifthQuestion = By.id("accordion__heading-4");
    private final By fifthAnswer = By.xpath("//*[@id=\"accordion__panel-4\"]/p");
    private final By sixthQuestion = By.id("accordion__heading-5");
    private final By sixthAnswer = By.xpath("//*[@id=\"accordion__panel-5\"]/p");
    private final By seventhQuestion = By.id("accordion__heading-6");
    private final By seventhAnswer = By.xpath("//*[@id=\"accordion__panel-6\"]/p");
    private final By eighthQuestion = By.id("accordion__heading-7");
    private final By eighthAnswer = By.xpath("//*[@id=\"accordion__panel-7\"]/p");

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void scrollToElementAndClick(By element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(element));
        driver.findElement(element).click();
    }

    public void clickUpButtonOrder() {
        driver.findElement(upButtonOrder).click();
    }

    public void clickDownButtonOrder() {
        scrollToElementAndClick(downButtonOrder);
    }

    public void clickButtonOrder(String buttonPlace) {
        if (buttonPlace.equals("Up")) {
            clickUpButtonOrder();
        } else if (buttonPlace.equals("Down")) {
            clickDownButtonOrder();
        }
    }

    public void clickFirstQuestion() {
        scrollToElementAndClick(firstQuestion);
    }

    public void clickSecondQuestion() {
        scrollToElementAndClick(secondQuestion);
    }

    public void clickThirdQuestion() {
        scrollToElementAndClick(thirdQuestion);
    }

    public void clickFourthQuestion() {
        scrollToElementAndClick(fourthQuestion);
    }

    public void clickFifthQuestion() {
        scrollToElementAndClick(fifthQuestion);
    }

    public void clickSixthQuestion() {
        scrollToElementAndClick(sixthQuestion);
    }

    public void clickSeventhQuestion() {
        scrollToElementAndClick(seventhQuestion);
    }

    public void clickEighthQuestion() {
        scrollToElementAndClick(eighthQuestion);
    }

    public String getFirstAnswer() {
        driver.findElement(firstAnswer).isDisplayed();
        return driver.findElement(firstAnswer).getText();
    }

    public String getSecondAnswer() {
        driver.findElement(secondAnswer).isDisplayed();
        return driver.findElement(secondAnswer).getText();
    }

    public String getThirdAnswer() {
        driver.findElement(thirdAnswer).isDisplayed();
        return driver.findElement(thirdAnswer).getText();
    }

    public String getFourthAnswer() {
        driver.findElement(fourthAnswer).isDisplayed();
        return driver.findElement(fourthAnswer).getText();
    }

    public String getFifthAnswer() {
        driver.findElement(fifthAnswer).isDisplayed();
        return driver.findElement(fifthAnswer).getText();
    }

    public String getSixthAnswer() {
        driver.findElement(sixthAnswer).isDisplayed();
        return driver.findElement(sixthAnswer).getText();
    }

    public String getSeventhAnswer() {
        driver.findElement(seventhAnswer).isDisplayed();
        return driver.findElement(seventhAnswer).getText();
    }

    public String getEighthAnswer() {
        driver.findElement(eighthAnswer).isDisplayed();
        return driver.findElement(eighthAnswer).getText();
    }
}