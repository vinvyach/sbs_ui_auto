package steps;

import config.EnvConfig;
import config.UserConfig;
import io.cucumber.java.en.Then;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import pages.BasicPage;
import pages.RegistrationPage;
import pages.entity.Code;
import utils.Random;

import java.util.HashMap;
import java.util.Map;

import static com.codeborne.selenide.Selenide.open;

public class BasicPageDef {
    BasicPage basicPage = new BasicPage();
    RegistrationPage registrationPage = new RegistrationPage();
    private static final RestTemplate restTemplate = new RestTemplate();


    @Then("Click {string} button")
    public void clickButton(String arg0) {
        basicPage.clickButton(arg0);

    }

    @Then("Click {string} button span")
    public void clickButtonSpan(String arg0) {
        basicPage.clickButtonSpan(arg0);

    }

    @Then("Content with {string} visible")
    public void contentWithVisible(String arg0)
            throws InterruptedException {
        Thread.sleep(3000);
        basicPage.contentIsVisible(arg0);
    }

    @Then("lk {string} button span")
    public void lkButtonSpanb(String arg0) throws InterruptedException {
        Thread.sleep(10000);
        basicPage.clickButtonSpanb(arg0);
    }


    @Then("Open {string} page")
    public void openPage(String arg0) {
        open(EnvConfig.URI_LOGIN + arg0);

        if (registrationPage.checkTextExist("OK")) {
            registrationPage.clickButtonSpan("OK");
        }

    }

    @Then("Click {string} buttonb spanb")
    public void clickButtonbSpanb(String arg0) {
        basicPage.clickButtonbSpanb(arg0);
    }

    @Then("Click {string} button getCode")
    public void clickButtonGetCode(String arg0) {
        basicPage.clickButtonGetCode(arg0);

        if (basicPage.checkTextExist("OK")) {
            basicPage.clickButtonSpan("OK");
        }
    }

    @Then("Insert code")
    public void click() {
        ResponseEntity<Code> send = send();
        String code = send.getBody().getData();

        registrationPage.insertCode(code);
    }

    public ResponseEntity<Code> send() {
//        String phoneNumber = UserConfig.USER_PHONE_NUMBER;
        String phoneNumber = Random.getPhone();
        String resourceUrl = UserConfig.GET_CODE_URL;

        ResponseEntity<Code> response
                = restTemplate.getForEntity(resourceUrl + phoneNumber, Code.class);
        return response;
    }


    @Then("Del user")
    public void createPost() {
        // request url
        String url = "http://192.168.67.31/api/autotest/delete-client";

        // request body parameters
        Map<String, String> map = new HashMap<>();
        map.put("phone", Random.getPhone());

        // send POST request
        ResponseEntity<Void> response = restTemplate.postForEntity(url, map, Void.class);

    }

    @Then("Click {string} button checkCode")
    public void click(String arg0) {
        basicPage.clickButtonCheckCode(arg0);
    }

    @Then("Click {string} button reg")
    public void clickButtonReg(String arg0) throws InterruptedException {
        Thread.sleep(3000);
        basicPage.clickButtonReg(arg0);

        if (registrationPage.checkTextExist("OK")) {
            registrationPage.clickButtonSpan("OK");
        }
    }
}
