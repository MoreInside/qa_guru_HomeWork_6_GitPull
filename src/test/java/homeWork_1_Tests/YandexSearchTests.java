package homeWork_1_Tests;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selectors.byName;

public class YandexSearchTests {
    String searchText = "Kung Fu Panda";
    
    @Test
    void yandexSearchTest() {
        open("https://yandex.ru");

        $(byName("text")).setValue(searchText).pressEnter();

        $("html").shouldHave(text(searchText));
    }
}
