package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

/**
 * это главная
 */
public class BasicPage {

    /*public void clickButton(String text) {
        $(By.xpath("//div[text()='" + text + "']")).click();
    } */

    public void clickButton(String text) {
        $(By.xpath("//*[@id=\"headerBottomMenu\"]/div/div/div[3]/div/div[4]/button/span")).click();
    }


    public void clickButtonSpan(String text) {
        $(By.xpath("//*[@id=\"login-form\"]/div[3]/div/div/div/div/button/span")).click();
    }

//        //        $(By.xpath("//*[text()='" + text + "']")).click(); TODO Переделать как нормальный человек
//
//
//        String xpathNext = "//*[@id=\"login-form\"]/div[3]/div/div/div/div/button/span";
//        String xpathOther = "//*[@id=\"login-form\"]/div[3]/div/div/div/div/button/span";
//        String xpathOther3 = "//*[@id=\"login-form\"]/div[3]/div/div/div/div/button/span";
//
//        if(text.equalsIgnoreCase("Войти")){
//            $(By.xpath(xpathOther3)).click();
//        }
//
//        if(text.equalsIgnoreCase("Далее")){
//            $(By.xpath(xpathNext)).click();
//        }
//
//        if(text.equalsIgnoreCase("Назад")){
//            $(By.xpath(xpathOther)).click();
//        }
//
//    }

    public void clickButtonSpanb(String text) {
        $(By.xpath("//*[@id=\"headerBottomMenu\"]/div/div/div[3]/div/div[4]/a/button/span")).click();
    }

    public void contentIsVisible(String text) {
        $(By.xpath("//*[text()='" + text + "']")).shouldBe(Condition.visible);
    }

    public Boolean checkTextExist(String text) {
        if ($(By.xpath("//*[text()='" + text + "']")).exists()) {
            return true;
        } else return false;
    }

    /**
     * этот метод делает: нажимает на одну из кнопок на одной странице в одном шаге. Вот.
     *
     * @param text
     */
    public void clickButtonbSpanb(String text) {
        $(By.xpath("//*[@id=\"contact-details\"]/div[3]/div[2]/button/span")).click();
    }


    public void clickButtonGetCode(String text) {
        $(By.xpath("//*[@id=\"individual-form\"]/div[3]/div[2]/button/span")).click();
    }

    public void clickButtonCheckCode(String arg0) {

        /**
         * До получения икс паса с кнопкой "получить код", например,
         * мы должны добраться до какой-либо кнопки например в футере
         */

        $(By.xpath("//*[@id=\"individual-form\"]/div[3]/div[3]/button/span")).click();
    }

    public void clickButtonReg(String arg0) {
        $(By.xpath("//*[@id=\"individual-form\"]/div[6]/div[2]/button/span")).click();
    }
}
