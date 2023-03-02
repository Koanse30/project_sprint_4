import config.WebDriverConfig;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.MainPage;

public class QuestionsAndAnswersTest {

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
    public void checkFirstQuestionAnswer() {
        MainPage mainPage = new MainPage(driver);
        mainPage.clickFirstQuestion();
        String firstAnswerText = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
        Assert.assertEquals(firstAnswerText, mainPage.getFirstAnswer());
    }

    @Test
    public void checkSecondQuestionAnswer() {
        MainPage mainPage = new MainPage(driver);
        mainPage.clickSecondQuestion();
        String secondAnswerText = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
        Assert.assertEquals(secondAnswerText, mainPage.getSecondAnswer());
    }

    @Test
    public void checkThirdQuestionAnswer() {
        MainPage mainPage = new MainPage(driver);
        mainPage.clickThirdQuestion();
        String thirdAnswerText = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
        Assert.assertEquals(thirdAnswerText, mainPage.getThirdAnswer());
    }

    @Test
    public void checkFourthQuestionAnswer() {
        MainPage mainPage = new MainPage(driver);
        mainPage.clickFourthQuestion();
        String fourthAnswerText = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
        Assert.assertEquals(fourthAnswerText, mainPage.getFourthAnswer());
    }

    @Test
    public void checkFifthQuestionAnswer() {
        MainPage mainPage = new MainPage(driver);
        mainPage.clickFifthQuestion();
        String fifthAnswerText = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
        Assert.assertEquals(fifthAnswerText, mainPage.getFifthAnswer());
    }

    @Test
    public void checkSixthQuestionAnswer() {
        MainPage mainPage = new MainPage(driver);
        mainPage.clickSixthQuestion();
        String sixthAnswerText = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
        Assert.assertEquals(sixthAnswerText, mainPage.getSixthAnswer());
    }

    @Test
    public void checkSeventhQuestionAnswer() {
        MainPage mainPage = new MainPage(driver);
        mainPage.clickSeventhQuestion();
        String seventhAnswerText = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
        Assert.assertEquals(seventhAnswerText, mainPage.getSeventhAnswer());
    }

    @Test
    public void checkEighthQuestionAnswer() {
        MainPage mainPage = new MainPage(driver);
        mainPage.clickEighthQuestion();
        String eighthAnswerText = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
        Assert.assertEquals(eighthAnswerText, mainPage.getEighthAnswer());
    }
}
