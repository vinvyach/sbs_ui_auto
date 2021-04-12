package pages;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.commands.SelectOptionByValue;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SignInPage {
    private SelenideElement loginInput = $(By.cssSelector("#login-form_emailOrPhone"));

    private SelenideElement passwordInput = $(By.cssSelector("#login-form_password"));

    private SelenideElement emailInput = $(By.cssSelector("#organization-email"));

    private SelenideElement lastNameInput = $(By.cssSelector("#lastName"));

    private SelenideElement phoneNumberInput = $(By.cssSelector("#phone"));

    private SelenideElement firstNameInput = $(By.cssSelector("#firstName"));

    private SelenideElement companyNameInput = $(By.cssSelector("#companyName"));
    ;
    private SelenideElement companyINNInput = $(By.cssSelector("#inn"));
    ;
    private SelenideElement companyCityInput = $(By.cssSelector("#legalAddress-city"));
    ;
    private SelenideElement companyUlicaInput = $(By.cssSelector("#legalAddress-street"));
    ;
    private SelenideElement companyDomInput = $(By.cssSelector("#legalAddress-house"));
    ;
    private SelenideElement bankNameInput = $(By.cssSelector("#name"));

    private SelenideElement bankChInput = $(By.cssSelector("#bankAccount"));
    ;
    private SelenideElement bankBikInput = $(By.cssSelector("#rcbic"));
    ;
    private SelenideElement bankCchInput = $(By.cssSelector("#correspondentAccount"));
    ;

//    private SelenideElement companyRegion = $(By.cssSelector("#legalAddress-region")).selectOptionByValue("Алтайский край"));

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

    public void inputCompanyName(String text) {
        companyNameInput.val(text);
    }

    public void inputCompanyINN(String text) {
        companyINNInput.val(text);
    }

    public void inputCompanyCity(String text) {
        companyCityInput.val(text);
    }

    public void inputCompanyUlica(String text) {
        companyUlicaInput.val(text);
    }

    public void inputCompanyDom(String text) {
        companyDomInput.val(text);
    }

    public void inputBankName(String text) {
        bankNameInput.val(text);
    }

    public void inputBankCh(String text) {
        bankChInput.val(text);
    }

    public void inputBankBik(String text) {
        bankBikInput.val(text);
    }

    public void inputBankCch(String text) {
        bankCchInput.val(text);
    }
}
