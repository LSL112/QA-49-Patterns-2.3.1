

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import ru.netology.delivery.data.DataGenerator;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

class DeliveryTest {

    @BeforeEach
    void setup() {
        open("http://localhost:9999");
    }

    @Test
    @DisplayName("Should successful plan and replan meeting")
    void shouldSuccessfulPlanAndReplanMeeting() {
       // var validUser = DataGenerator.Registration.generateUser("RU");
       // var daysToAddForFirstMeeting = 4;
       // var firstMeetingDate = DataGenerator.generateDate(daysToAddForFirstMeeting);
       // var daysToAddForSecondMeeting = 7;
       // var secondMeetingDate = DataGenerator.generateDate(daysToAddForSecondMeeting);
        // TODO: добавить логику теста в рамках которого будет выполнено планирование и перепланирование встречи.
        // Для заполнения полей формы можно использовать пользователя validUser и строки с датами в переменных
        // firstMeetingDate и secondMeetingDate. Можно также вызывать методы generateCity(locale),
        // generateName(locale), generatePhone(locale) для генерации и получения в тесте соответственно города,
        // имени и номера телефона без создания пользователя в методе generateUser(String locale) в датагенераторе
        DataGenerator.UserInfo validUser = DataGenerator.Registration.generateUser("ru");
        int daysToAddForFirstMeeting = 4;
        String firstMeetingDate = DataGnerator.generateDate(daysToAddForFirstMeeting);
        int daysToAddForSecondMeeting = 7;
        String secondMeetingDate = DataGnerator.generateDate(daysToAddForSecondMeeting);
        $x("//span[@data-test-id= 'city']//input").setValue(validUser.getCity());
        $x("//span[@data-test-id= 'date']//input").sendKeys(Keys.chord(Keys.SHIFT,Keys.HOME),Keys.DELETE);
        $x("//span[@data-test-id= 'date']//input").setValue(firstMeetingDate));
        $x("//span[@data-test-id= 'name']//input").setValue(validUser.getName());
        $x("//span[@data-test-id= 'phone']//input").setValue(validUser.getPhone());



    }
}