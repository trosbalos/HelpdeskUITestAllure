package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class LoginPage extends AbstractPage {
    @FindBy(xpath = "//*[@id=\"username\"]")
    private WebElement userNameField;
    @FindBy(id = "password")
    private WebElement passwordField;
    @FindBy(xpath = "//*[@type=\"submit\"]")
    private WebElement submitButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }


    @Step
    public LoginPage inputUsernameField(String name) throws IOException {
        userNameField.sendKeys(name);
        takeScreenshot(driver);
        return this;
    }

    @Step
    public LoginPage inputPasswordField(String password) throws IOException {
        passwordField.sendKeys(password);
        takeScreenshot(driver);
        return this;
    }

    @Step
    public LoginPage submitButtonClick() throws IOException {
        submitButton.click();
        takeScreenshot(driver);
        return this;
    }

    @Step
    public void login(String user, String password) throws IOException {
        new MainPage(driver)
                .clickLogInButton();
        new LoginPage(driver)
                .inputUsernameField(user)
                .inputPasswordField(password)
                .submitButtonClick();
    }
}
