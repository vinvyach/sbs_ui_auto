package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

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



    public void clickButtonSpanUL(String text) {
        $(By.xpath("//*[@id=\"__next\"]/section/main/div/div/div[3]/div/div[1]/div/menu/ul/li[2]")).click();

    }


    public void clickButtonNext(String text) {
        $(By.xpath("//*[@id=\"entity-form\"]/div[5]/div[2]/button/span")).click();
    }

    public void clickButtonRegion(String text) {

        $("#entity-form > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div > div > div > div > div").click ();
        $("#entity-form > div:nth-child(73) > div > div > div > div:nth-child(2) > div > div > div:nth-child(1) > div").click ();
        $("/html/body/div[6]/div/div/div/div[2]/div/div/div[1]/div").selectOptionContainingText("Алтайский край");
    }



//    /**
//     *
//     * попытка кликнуть на "Алтайский край", поэтому clickButtnA - A - Алтайский шаг - Then Click "A" but a
//     */
//
//
//    public void clickButtonA(String text) {
//        $(By.xpath("/html/body/div[6]/div/div/div/div[2]/div/div/div[1]/div")).click();
//    }



//    public void clickButtonRegion(String arg0) {
//        SelenideElement select;
//        $("/html/body/div[6]/div/div/div/div[2]/div/div/div[1]/div").selectOptionContainingText("Алтайский край"););
//        select.val("Алтайский край");




    /**
     *
     * Шаг - Then Click "Gorod" butt
     */

    public void clickButtonCity(String arg0) {
        $(By.xpath("//*[@id=\"legalAddress-city\"]")).click();

    }

    /**
     *
     * Then Click "Совпадает с ЮА" buton ua
     */

    public void clickButtonUa(String arg0) {
        $(By.xpath("//*[@id=\"entity-form\"]/div[3]/div/div[1]/label/span/input")).click();
    }
}
