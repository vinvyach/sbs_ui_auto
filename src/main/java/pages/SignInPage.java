package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SignInPage {
    private SelenideElement loginInput = $(By.cssSelector("#login-form_emailOrPhone"));
    private SelenideElement passwordInput = $(By.cssSelector("#login-form_password"));

    private SelenideElement emailInput = $(By.cssSelector("#organization-email"));
    private SelenideElement lastNameInput = $(By.cssSelector("#lastName"));
    private SelenideElement phoneNumberInput = $(By.cssSelector("#phone"));
    private SelenideElement firstNameInput = $(By.cssSelector("#firstName"));

    public void inputLogin(String text) {
        this.loginInput.val(text);
    }

    public void inputPassword(String text) {
        this.passwordInput.val(text);
    }

    public void inputEmail(String text) {
        emailInput.val(text);
    }

    public void inputLastName(String text) {
        lastNameInput.val(text);
    }

    public void inputPhoneNumber(String text) {
        phoneNumberInput.val(text);
    }

    public void inputFirstName(String text) {
        firstNameInput.val(text);
    }

}
