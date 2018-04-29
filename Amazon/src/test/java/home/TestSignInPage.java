package home;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestSignInPage extends CommonAPI {
    @Test
    public void test1() {
        SignInPage signInPage = PageFactory.initElements(driver, SignInPage.class);
        signInPage.signInButton();
        signInPage.signInEmail();
        signInPage.signInContinueButton();
        signInPage.signInNeedHelpLink();
        }
}