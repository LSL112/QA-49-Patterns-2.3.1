package ru.netology.delivery.test;

import com.github.javafaker.Faker;
import lombok.Value;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Random;

public class DataGenerator {
    private DataGenerator() {}

    public static String generateDate(int shift) {
        return LocalDate.now().plusDays(shift).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }

    public static String generateCity(String locale) {
        // TODO: добавить логику для объявления переменной city и задания её значения, генерацию можно выполнить
        // с помощью Faker, либо используя массив валидных городов и класс Random
        var cities = new String[] {"Анадырь", "Барнаул", "Волгоград", "Грозный", "Екатеринбург", "Йошкар-Ола", "Краснодар", "Липецк", "Майкоп", "Нальчик", "Орёл", "Пенза", "Ростов-на-Дону", "Саратов", "Тула", "Уфа", "Чита", "Элиста", "Хабаровск", "Якутск"};
        return cities[new Random().nextInt(cities.length)];
        //return city;
    }

    public static String generateName(String locale) {
        // TODO: добавить логику для объявления переменной name и задания её значения, для генерации можно
        // использовать Faker
        var faker = new Faker(new Locale(locale));
        return faker.name().lastName() + " " + faker.name().firstName();
        //return name;
    }

    public static String generatePhone(String locale) {
        // TODO: добавить логику для объявления переменной phone и задания её значения, для генерации можно
        // использовать Faker
        var faker = new Faker(new Locale(locale));
        return faker.phoneNumber().phoneNumber();
        //return phone;
    }

    public static class Registration {
        private Registration() {
        }

        public static UserInfo generateUser(String locale) {
            // TODO: добавить логику для создания пользователя user с использованием методов generateCity(locale),
            // generateName(locale), generatePhone(locale)
            return new UserInfo(generateCity(locale), generateName(locale), generatePhone(locale));
            //return user;
        }
    }

    @Value
    public static class UserInfo {
        String city;
        String name;
        String phone;
    }
}
