package ru.netology.qahwweb.appordertests;


import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class AppOrderTest {
    @Test
    void shouldCreateRequestPositivePath() {
        open("http://localhost:9999");
        SelenideElement form = $("[class='form form_size_m form_theme_alfa-on-white']");
        form.$("[data-test-id=name] input").setValue("Анна Шевченко");
        form.$("[data-test-id=phone] input").setValue("+79960000000");
        form.$("[data-test-id=agreement]").click();
        form.$("[class='button__content']").click();
        $("[data-test-id=order-success]").shouldHave(exactText("Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));
    }
}
