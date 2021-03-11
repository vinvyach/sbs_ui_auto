package steps;

import config.EnvConfig;
import io.cucumber.java.en.Then;
import pages.BasicPage;
import pages.RegistrationPage;

import static com.codeborne.selenide.Selenide.open;

public class BasicPageDef {
    BasicPage basicPage = new BasicPage();
    RegistrationPage registrationPage = new RegistrationPage();


    @Then("Click {string} button")
    public void clickButton(String arg0) {
        basicPage.clickButton(arg0);

    }

    @Then("Click {string} button span")
    public void clickButtonSpan(String arg0) {
        basicPage.clickButtonSpan(arg0);

    }

    @Then("Content with {string} visible")
    public void contentWithVisible(String arg0) {
        basicPage.contentIsVisible(arg0);
    }

    @Then("lk {string} button span")
    public void lkButtonSpanb(String arg0) {
        basicPage.clickButtonSpanb(arg0);
    }


    @Then("Open {string} page")
    public void openPage(String arg0) {
        open(EnvConfig.URI_LOGIN + arg0);

        if (registrationPage.checkTextExist("IT Услуга использует файлы cookies")){
            registrationPage.clickButtonSpan("OK");
        }

    }

    @Then("Click {string} buttonb spanb")
    public void clickButtonbSpanb(String arg0) {
        basicPage.clickButtonbSpanb(arg0);
    }
}
