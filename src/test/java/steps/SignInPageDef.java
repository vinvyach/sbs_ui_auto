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
        String companyInn = Random.newInn();
        signInPage.inputCompanyINN(companyInn);
        put("companyInn", companyInn);
    }


    @Then("Input city: {string}")
    public void inputGorod(String companyCity) throws InterruptedException {
//        Thread.sleep(3000);
        signInPage.inputCompanyCity(companyCity);
        put("companyCity", companyCity);
    }

    @Then("Input ulica: {string}")
    public void inputUlica(String companyUlica) throws InterruptedException {
//        Thread.sleep(3000);
        signInPage.inputCompanyUlica(companyUlica);
        put("companyUlica", companyUlica);
    }

    @Then("Input Dom: {string}")
    public void inputDom(String companyDom) throws InterruptedException {
//        Thread.sleep(3000);
        signInPage.inputCompanyDom(companyDom);
        put("companyDom", companyDom);
    }

    @Then("Input Bank Name: {string}")
    public void inputBankName(String bankName) {
        signInPage.inputBankName(bankName);
        put("bankName", bankName);
    }

    @Then("Input RCH")
    public void inputRCH() {
        String bankRch = Random.newRCh();
        signInPage.inputBankCh(bankRch);
        put("bankRch", bankRch);
    }

    @Then("Input BIK")
    public void inputBIK() {
        String bankBik = UserConfig.BANK_BIK;
        signInPage.inputBankBik(bankBik);
        put("bankBik", bankBik);
    }

    @Then("Innput CCH")
    public void innputCCH() {
        String bankCch = UserConfig.BANK_CCH;
        signInPage.inputBankCch(bankCch);
        put("bankCch", bankCch);
    }
}
