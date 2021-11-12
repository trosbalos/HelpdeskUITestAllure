package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
    public TicketSbubmit queueDropDownClick() {
        this.queueDropDown.click();
        return this;
    }

    @Step
    public TicketSbubmit djangoSelectClick() {
        this.djangoSelect.click();
        return this;
    }

    @Step
    public TicketSbubmit titleFieldInput(String title) {
        this.titleField.sendKeys(title);
        return this;
    }

    @Step
    public String titleFieldGetAttribute() {
        return this.titleField.getAttribute("value");
    }

    @Step
    public TicketSbubmit ticketDescriptionInput(String description) {
        this.ticketDescription.sendKeys(description);
        return this;
    }

    @Step
    public String ticketDescriptionGetAttribute() {
        return this.ticketDescriptionAfterCreate.getAttribute("value");
    }

    @Step
    public TicketSbubmit ticketPriorityClick() {
        this.ticketPriority.click();
        return this;
    }

    @Step
    public TicketSbubmit criticalPriorityClick() {
        this.criticalPriority.click();
        return this;
    }

    @Step
    public TicketSbubmit dueOnDropDownClick() {
        this.dueOnDropDown.click();
        return this;
    }

    @Step
    public TicketSbubmit dateTwoOClick() {
        this.dateTwoO.click();
        return this;
    }

    @Step
    public TicketSbubmit emailFieldInput(String email) {
        this.emailField.sendKeys(email);
        return this;
    }

    @Step
    public String emailFieldGetAttribute() {
        return this.emailField.getAttribute("value");
    }

    @Step
    public TicketSbubmit submitButtonClick() {
        this.submitButton.click();
        return this;
    }
}