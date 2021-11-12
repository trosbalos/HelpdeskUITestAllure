package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends AbstractPage {

    @FindBy(xpath = "//*[@id=\"userDropdown\"]")
    private WebElement logInButton;
    @FindBy(xpath = "//span[text()='New Ticket']")
    private WebElement newTicketSpan;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    @Step
    public MainPage clickLogInButton() {
        logInButton.click();
        return this;
    }

    @Step
    public MainPage clickNewTicket() {
        newTicketSpan.click();
        return this;
    }

}
