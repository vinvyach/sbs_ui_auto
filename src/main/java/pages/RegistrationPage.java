package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/**
 * страница регистрации нового пользователя
 */
public class RegistrationPage {

    public void clickButtonSpan(String text) {
        $(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/button/span")).click();
    }


    public Boolean checkTextExist(String text) {
        if ($(By.xpath("//*[text()='" + text + "']")).exists()) {
            return true;
        } else return false;
    }

    public void insertCode(String code) {
        $(By.xpath("//*[@id=\"individual-form\"]/div[3]/div[2]/div/div/div/div/input")).setValue(code);
    }

}
