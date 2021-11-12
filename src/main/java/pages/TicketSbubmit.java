package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;

public class TicketSbubmit extends AbstractPage {
    @FindBy(xpath = "//*[@id=\"id_title\"]")
    public WebElement titleField;
    @FindBy(xpath = "//*[@id=\"id_queue\"]")
    private WebElement queueDropDown;
    @FindBy(xpath = "//*[text()=\"Django Helpdesk\"]")
    private WebElement djangoSelect;
    @FindBy(xpath = "//*[@id=\"id_body\"]")
    private WebElement ticketDescription;
    @FindBy(xpath = "//*[@id=\"id_description\"]")
    private WebElement ticketDescriptionAfterCreate;
    @FindBy(xpath = "//*[@id=\"id_priority\"]")
    private WebElement ticketPriority;
    @FindBy(xpath = "//*[text()=\"1. Critical\"]")
    private WebElement criticalPriority;
    @FindBy(xpath = "//*[@id=\"id_due_date\"]")
    private WebElement dueOnDropDown;
    @FindBy(xpath = "//*[@href=\"#\" and text()=\"20\"]")
    private WebElement dateTwoO;
    @FindBy(xpath = "//*[@id=\"id_submitter_email\"]")
    private WebElement emailField;
    @FindBy(xpath = "//*[@type=\"submit\"]")
    private WebElement submitButton;

    public TicketSbubmit(WebDriver driver) {
        super(driver);
    }

    @Step
    public TicketSbubmit queueDropDownClick() throws IOException {
        this.queueDropDown.click();
        takeScreenshot(driver);
        return this;
    }

    @Step
    public TicketSbubmit djangoSelectClick() throws IOException {
        this.djangoSelect.click();
        takeScreenshot(driver);
        return this;
    }

    @Step
    public TicketSbubmit titleFieldInput(String title) throws IOException {
        this.titleField.sendKeys(title);
        takeScreenshot(driver);
        return this;
    }

    @Step
    public String titleFieldGetAttribute() throws IOException {
        takeScreenshot(driver);
        return this.titleField.getAttribute("value");
    }

    @Step
    public TicketSbubmit ticketDescriptionInput(String description) throws IOException {
        this.ticketDescription.sendKeys(description);
        takeScreenshot(driver);
        return this;
    }

    @Step
    public String ticketDescriptionGetAttribute() throws IOException {
        takeScreenshot(driver);
        return this.ticketDescriptionAfterCreate.getAttribute("value");
    }

    @Step
    public TicketSbubmit ticketPriorityClick() throws IOException {
        this.ticketPriority.click();
        takeScreenshot(driver);
        return this;
    }

    @Step
    public TicketSbubmit criticalPriorityClick() throws IOException {
        this.criticalPriority.click();
        takeScreenshot(driver);
        return this;
    }

    @Step
    public TicketSbubmit dueOnDropDownClick() throws IOException {
        this.dueOnDropDown.click();
        takeScreenshot(driver);
        return this;
    }

    @Step
    public TicketSbubmit dateTwoOClick() throws IOException {
        this.dateTwoO.click();
        takeScreenshot(driver);
        return this;
    }

    @Step
    public TicketSbubmit emailFieldInput(String email) throws IOException {
        this.emailField.sendKeys(email);
        takeScreenshot(driver);
        return this;
    }

    @Step
    public String emailFieldGetAttribute() throws IOException {
        takeScreenshot(driver);
        return this.emailField.getAttribute("value");
    }

    @Step
    public TicketSbubmit submitButtonClick() throws IOException {
        this.submitButton.click();
        takeScreenshot(driver);
        return this;
    }
}