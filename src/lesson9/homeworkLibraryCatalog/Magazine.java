package lesson9.homeworkLibraryCatalog;

import java.util.Objects;

public class Magazine {

    // поля класса
    private String nameOfMagazine;
    private int yearOfPublication;
    private int countTheNumberInTheYear;
    private String publishingHouse;

    // конструкторы
    public Magazine() {
    }

    public Magazine(String nameOfMagazine, int yearOfPublication, int countTheNumberInTheYear, String publishingHouse) {
        this.nameOfMagazine = nameOfMagazine;
        this.yearOfPublication = yearOfPublication;
        this.countTheNumberInTheYear = countTheNumberInTheYear;
        this.publishingHouse = publishingHouse;
    }

    // геттеры и сеттеры
    public String getNameOfMagazine() {

        return nameOfMagazine;
    }

    public void setNameOfMagazine(String nameOfMagazine) {

        this.nameOfMagazine = nameOfMagazine;
    }

    public int getYearOfPublication() {

        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {

        this.yearOfPublication = yearOfPublication;
    }

    public int getCountTheNumberInTheYear() {

        return countTheNumberInTheYear;
    }

    public void setCountTheNumberInTheYear(int countTheNumberInTheYear) {
        this.countTheNumberInTheYear = countTheNumberInTheYear;
    }

    public String getPublishingHouse() {

        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {

        this.publishingHouse = publishingHouse;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Magazine magazine = (Magazine) o;

        if (yearOfPublication != magazine.yearOfPublication) return false;
        if (countTheNumberInTheYear != magazine.countTheNumberInTheYear) return false;
        if (!Objects.equals(nameOfMagazine, magazine.nameOfMagazine))
            return false;
        return Objects.equals(publishingHouse, magazine.publishingHouse);
    }

    @Override
    public int hashCode() {
        int result = nameOfMagazine != null ? nameOfMagazine.hashCode() : 0;
        result = 31 * result + yearOfPublication;
        result = 31 * result + countTheNumberInTheYear;
        result = 31 * result + (publishingHouse != null ? publishingHouse.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "nameOfMagazine='" + nameOfMagazine + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                ", countTheNumberInTheYear=" + countTheNumberInTheYear +
                ", publishingHouse='" + publishingHouse + '\'' +
                '}';
    }

    // метод вывода информации о журналах
    public void displeyInfoMagazine(){
        System.out.println("Название журнала: " + nameOfMagazine);
        System.out.println("Год издания: " + yearOfPublication);
        System.out.println("Номер в году: " + countTheNumberInTheYear);
        System.out.println("Издательство: " + publishingHouse);
        System.out.println();
    }
}
