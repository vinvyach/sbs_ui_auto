package steps;

import config.UserConfig;
import io.cucumber.java.en.Then;
import org.apache.commons.lang3.RandomStringUtils;
import pages.SignInPage;
import utils.Random;

import static app_context.RunContext.*;

public class SignInPageDef {
    SignInPage signInPage = new SignInPage();


    @Then("Input login")
    public void inputLogin() {
        signInPage.inputLogin(UserConfig.USER_LOGIN);
    }


    @Then("Input password")
    public void inputPassword() {
        signInPage.inputPassword(UserConfig.USER_PASSWORD);
    }


    @Then("Input email")
    public void inputEmail() {
        String email = UserConfig.USER_EMAIL;
        signInPage.inputEmail(email);
        put("email", email);

    }


    @Then("Input Last Name")
    public void inputLastName() {
        String lastName = UserConfig.USER_LAST_NAME;
        signInPage.inputLastName(lastName);
        put("lastName", lastName);
    }

    @Then("Input First Name")
    public void inputFirstName() {
        String firstName = UserConfig.USER_FIRST_NAME;
        signInPage.inputFirstName(firstName);
        put("firstName", firstName);
    }

    @Then("Input Phone Number")
    public void inputPhoneNumber() {
        String phoneNumber = Random.newPhone();
        signInPage.inputPhoneNumber(phoneNumber);
        put("PhoneNumber", phoneNumber);
    }

    @Then("Input companyName")
    public void inputCompanyName() throws InterruptedException {
        String companyName = UserConfig.COMPANY_NAME;
        /*Thread.sleep(3000);*/
        signInPage.inputCompanyName(companyName);
        put("companyName", companyName);
        /*Thread.sleep(3000);*/
    }

    @Then("Input companyINN")
    public void inputCompanyINN() {
        String companyINN = UserConfig.COMPANY_INN;
        signInPage.inputCompanyINN(companyINN);
        put("companyINN", companyINN);
    }


    @Then("Input Gorod")
    public void inputGorod() throws InterruptedException {
        String companyCity = UserConfig.COMPANY_CITY;
        Thread.sleep(3000);
        signInPage.inputCompanyCity(companyCity);
        put("companyCity", companyCity);
    }

    @Then("Input Ulica")
    public void inputUlica() throws InterruptedException {
        String companyUlica = UserConfig.COMPANY_ULICA;
        Thread.sleep(3000);
        signInPage.inputCompanyUlica(companyUlica);
        put("companyUlica", companyUlica);
    }

    @Then("Input Dom")
    public void inputDom() throws InterruptedException {
        String companyDom = UserConfig.COMPANY_DOM;
        Thread.sleep(3000);
        signInPage.inputCompanyDom(companyDom);
        put("companyDom", companyDom);
    }
}
