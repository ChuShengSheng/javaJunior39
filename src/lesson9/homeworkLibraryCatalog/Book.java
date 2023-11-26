package lesson9.homeworkLibraryCatalog;

import java.util.Objects;

public class Book {

    // поля класса
    private String nameOfBook;
    private String writer;
    private int yearOfPublication;
    private int countPages;
    private String publishingHouse;

    // конструкторы

    public Book() {
    }

    public Book(String nameOfBook, String writer, int yearOfPublication, int countPages, String publishingHouse) {
        this.nameOfBook = nameOfBook;
        this.writer = writer;
        this.yearOfPublication = yearOfPublication;
        this.countPages = countPages;
        this.publishingHouse = publishingHouse;
    }

    // геттеры и сеттеры
    public String getNameOfBook() {

        return nameOfBook;
    }

    public void setNameOfBook(String nameOfBook) {

        this.nameOfBook = nameOfBook;
    }

    public String getWriter() {

        return writer;
    }

    public void setWriter(String writer) {

        this.writer = writer;
    }

    public int getYearOfPublication() {

        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public int getCountPages() {

        return countPages;
    }

    public void setCountPages(int countPages) {

        this.countPages = countPages;
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

        Book book = (Book) o;

        if (yearOfPublication != book.yearOfPublication) return false;
        if (countPages != book.countPages) return false;
        if (!Objects.equals(nameOfBook, book.nameOfBook)) return false;
        if (!Objects.equals(writer, book.writer)) return false;
        return Objects.equals(publishingHouse, book.publishingHouse);
    }

    @Override
    public int hashCode() {
        int result = nameOfBook != null ? nameOfBook.hashCode() : 0;
        result = 31 * result + (writer != null ? writer.hashCode() : 0);
        result = 31 * result + yearOfPublication;
        result = 31 * result + countPages;
        result = 31 * result + (publishingHouse != null ? publishingHouse.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameOfBook='" + nameOfBook + '\'' +
                ", writer='" + writer + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                ", countPages=" + countPages +
                ", publishingHouse='" + publishingHouse + '\'' +
                '}';
    }

    // метод вывода информации о книгах
    public void displeyInfoBook(){
        System.out.println("Название книги: " + nameOfBook);
        System.out.println("Писатель: " + writer);
        System.out.println("Год издания: " + yearOfPublication);
        System.out.println("Количество страниц: " + countPages);
        System.out.println("Издательство: " + publishingHouse);
        System.out.println();
    }


}
