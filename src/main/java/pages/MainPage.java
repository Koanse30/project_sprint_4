package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class MainPage {

    WebDriver driver;

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

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

    public void clickUpButtonOrder() {
        driver.findElement(upButtonOrder).click();
    }

    public void clickDownButtonOrder() {
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(downButtonOrder));
        driver.findElement(downButtonOrder).click();
    }

    public void clickButtonOrder(String buttonPlace) {
        if(buttonPlace.equals("Up")) {
            clickUpButtonOrder();
        } else if (buttonPlace.equals("Down")) {
            clickDownButtonOrder();
        }
    }

    public void clickFirstQuestion() {
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(firstQuestion));
        driver.findElement(firstQuestion).click();
    }

    public void clickSecondQuestion() {
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(secondQuestion));
        driver.findElement(secondQuestion).click();
    }

    public void clickThirdQuestion() {
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(thirdQuestion));
        driver.findElement(thirdQuestion).click();
    }

    public void clickFourthQuestion() {
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(fourthQuestion));
        driver.findElement(fourthQuestion).click();
    }

    public void clickFifthQuestion() {
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(fifthQuestion));
        driver.findElement(fifthQuestion).click();
    }

    public void clickSixthQuestion() {
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(sixthQuestion));
        driver.findElement(sixthQuestion).click();
    }

    public void clickSeventhQuestion() {
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(seventhQuestion));
        driver.findElement(seventhQuestion).click();
    }

    public void clickEighthQuestion() {
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(eighthQuestion));
        driver.findElement(eighthQuestion).click();
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
