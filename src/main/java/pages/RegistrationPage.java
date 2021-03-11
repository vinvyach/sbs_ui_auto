package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class RegistrationPage {

    public void clickButtonSpan(String text) {
        $(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/button/span")).click();
    }


    public Boolean checkTextExist(String text) {
        if ($(By.xpath("//*[text()='" + text + "']")).exists()) {
            return true;
        } else return false;
    }


}
