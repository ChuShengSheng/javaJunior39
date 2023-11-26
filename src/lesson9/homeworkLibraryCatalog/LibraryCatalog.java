package lesson9.homeworkLibraryCatalog;

import java.util.ArrayList;
import java.util.Objects;

public class LibraryCatalog {

    // поля класса
    private ArrayList<Book> CatalogBooks = new ArrayList<>();
    private ArrayList<Magazine> CatalogMagazines = new ArrayList<>();

    public void addBookToCatalog(Book book) {
        CatalogBooks.add(book);
    }
    public void addMagazinToCatalog(Magazine magazine) {
        CatalogMagazines.add(magazine);
    }


    // конструкторы
    public LibraryCatalog() {
    }

    public LibraryCatalog(ArrayList<Book> catalogBooks, ArrayList<Magazine> catalogMagazines) {
        CatalogBooks = catalogBooks;
        CatalogMagazines = catalogMagazines;
    }

    //геттеры и сеттеры
    public ArrayList<Book> getCatalogBooks() {

        return CatalogBooks;
    }

    public void setCatalogBooks(ArrayList<Book> catalogBooks) {

        CatalogBooks = catalogBooks;
    }

    public ArrayList<Magazine> getCatalogMagazines() {

        return CatalogMagazines;
    }

    public void setCatalogMagazines(ArrayList<Magazine> catalogMagazines) {

        CatalogMagazines = catalogMagazines;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LibraryCatalog that = (LibraryCatalog) o;

        if (!Objects.equals(CatalogBooks, that.CatalogBooks)) return false;
        return Objects.equals(CatalogMagazines, that.CatalogMagazines);
    }

    @Override
    public int hashCode() {
        int result = CatalogBooks != null ? CatalogBooks.hashCode() : 0;
        result = 31 * result + (CatalogMagazines != null ? CatalogMagazines.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "LibraryCatalog{" +
                "CatalogBooks=" + CatalogBooks +
                ", CatalogMagazines=" + CatalogMagazines +
                '}';
    }
}


