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

//    @Before("@MainPagePopUp")
//    public void closeMainPagePopUp(){
//       open("https://marketplace-test.sberbank-service.ru/");
//        closeCookiesPopup();
//    }
//
//    @Before("@Registration")
//    public void closeRegistrationPopUp(){
//        open("https://marketplace-test.sberbank-service.ru/registration");
//        closeCookiesPopup();
//    }

//    public void closeCookiesPopup(){
//        if (basicPage.checkTextExist("IT Услуга использует файлы cookies")){
//            basicPage.clickButtonSpan("OK");
//        }
//
//        if (registrationPage.checkTextExist("IT Услуга использует файлы cookies")){
//            registrationPage.clickButtonSpan("OK");
//        }
//
//    }


    @Before
    public void resizeBrowser() {
        Configuration.browser = "chrome";
//        Configuration.browserPosition = "1921x0";
        Configuration.browserSize = "1920x1080";

    }

}
