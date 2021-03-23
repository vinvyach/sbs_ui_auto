package steps;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.Before;
import org.junit.BeforeClass;
import pages.BasicPage;
import pages.RegistrationPage;

import static com.codeborne.selenide.Selenide.*;

public class Hooks {
    BasicPage basicPage = new BasicPage();
    RegistrationPage registrationPage = new RegistrationPage();



    /**
     * resize браузера здесь, если раскоментировать то бразуер улетит в стратосферу, нет
     * на самом деле он улетит на второй экран, если он у вас конечно есть!
     */

    @Before
    public void resizeBrowser() {
        Configuration.browser = "chrome";
//        Configuration.browserPosition = "1921x0";
        Configuration.browserSize = "1920x1080";

    }


    @Before
    public void closeMainPagePopUp(){
       open("https://marketplace-test.sberbank-service.ru/");
        closeCookiesPopup();
    }

    @Before("@Registration")
    public void closeRegistrationPopUp(){
        open("https://marketplace-test.sberbank-service.ru/registration");
        closeCookiesPopup();
    }

    public void closeCookiesPopup(){
        if (basicPage.checkTextExist("IT Услуга использует файлы cookies")){
            basicPage.clickButtonSpan("OK");
        }

        if (registrationPage.checkTextExist("IT Услуга использует файлы cookies")){
            registrationPage.clickButtonSpan("OK");
        }

    }



}
