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
    }
}
