package lesson9.homeworkLibraryCatalog;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Лисьи чары", "Пу Сунлин", 2020, 271, "Т8 Издательские Технологии");
        Book book2 = new Book("Долгая ночь", "Цзы Цзиньчень", 2022, 288, "Издательство Эксмо");
        Book book3 = new Book("Детям про все на свете", "С. Я. Маршак", 2018, 190, "Издательство АСТ");
        Book book4 = new Book("Все сказки", "К. И. Чуковский", 2016, 186, "Издательство АСТ");


        LibraryCatalog libraryCatalog = new LibraryCatalog();
        libraryCatalog.addBookToCatalog(book1);
        libraryCatalog.addBookToCatalog(book2);
        libraryCatalog.addBookToCatalog(book3);
        libraryCatalog.addBookToCatalog(book4);

        book1.displeyInfoBook(); //  выводит информацию с первой книги
        book2.displeyInfoBook(); //  выводит информацию с второй книги
        book3.displeyInfoBook(); //  выводит информацию с третьей книги
        book4.displeyInfoBook(); //  выводит информацию с четвертой книги

        Magazine magazine1 = new Magazine("Российские аптеки", 2023, 9, "ООО «ГРУППА РЕМЕДИУМ»");
        Magazine magazine2 = new Magazine("Стильные прически", 2017, 4, "EDIPRESSE-KONLIGA");
        Magazine magazine3 = new Magazine("Бурда", 2019, 1, "Бурда");

        LibraryCatalog libraryCatalog1 = new LibraryCatalog();
        libraryCatalog1.addMagazinToCatalog(magazine1);
        libraryCatalog1.addMagazinToCatalog(magazine2);
        libraryCatalog1.addMagazinToCatalog(magazine3);

        magazine1.displeyInfoMagazine(); // выводит информацию с первого журнала
        magazine2.displeyInfoMagazine(); // выводит информацию с второго журнала
        magazine3.displeyInfoMagazine(); // выводит информацию с третьего журнала


    }
}
