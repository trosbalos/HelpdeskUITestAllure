package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class TicketsPage extends AbstractPage {

    @FindBy(xpath = "//*[@class=\"fas fa-pencil-alt\"]")
    private WebElement editButton;

    public TicketsPage(WebDriver driver) {
        super(driver);
    }

    @Step
    public TicketsPage editButtonClick() throws IOException {
        editButton.click();
        takeScreenshot(driver);
        return this;
    }

}
