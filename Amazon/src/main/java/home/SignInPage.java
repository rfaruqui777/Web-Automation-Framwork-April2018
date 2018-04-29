package home;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage {
    @FindBy(xpath = ".//span[text()='Hello. Sign in']")
    public WebElement signInWebElement;

    public WebElement getSignInWebElement() {
        return signInWebElement;
    }

    public void setSignInWebElement(WebElement signInWebElement) {
        this.signInWebElement = signInWebElement;
    }

    public void signInButton() {
        signInWebElement.click();
    }

    @FindBy(id = "ap_email")
    public WebElement emailWebElement;

    public WebElement getEmailWebElement() {
        return emailWebElement;
    }

    public void setEmailWebElement(WebElement emailWebElement) {
        this.emailWebElement = emailWebElement;
    }

    public void signInEmail() {
        emailWebElement.sendKeys("pnt123@gmail.com");
    }

    @FindBy(id = "continue")
    public WebElement signInContinueWebElement;

    public WebElement getSignInContinueWebElement() {
        return signInContinueWebElement;
    }

    public void setSignInContinueWebElement(WebElement signInContinueWebElement) {
        this.signInContinueWebElement = signInContinueWebElement;
    }

    public void signInContinueButton() {
        signInContinueWebElement.click();
    }

    @FindBy(xpath = ".//span[@class='a-expander-prompt']")
    public WebElement signInNeedHelpWebElement;

    public WebElement getSignInWebNeedHelpWebElement() {
        return signInNeedHelpWebElement;
    }

    public void setSignInWebNeedHelpWebElement(WebElement signInWebNeedHelpWebElement) {
        this.signInNeedHelpWebElement = signInWebNeedHelpWebElement;
    }

    public void signInNeedHelpLink() {
        signInNeedHelpWebElement.click();
    }

    @FindBy(id = "createAccountSubmit")
    public WebElement createAccSubmitWebElement;

    public WebElement getCreateAccSubmitWebElement() {
        return createAccSubmitWebElement;
    }

    public void setCreateAccSubmitWebElement(WebElement createAccSubmitWebElement) {
        this.createAccSubmitWebElement = createAccSubmitWebElement;
    }
}