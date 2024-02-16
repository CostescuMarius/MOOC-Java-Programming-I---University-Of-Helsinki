/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author coste
 */
public class Book {
    private String title;
    private int pagesNo;
    private int publicationYear;

    public Book(String title, int pagesNo, int publicationYear) {
        this.title = title;
        this.pagesNo = pagesNo;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return this.title + ", " + this.pagesNo + " pages, " + this.publicationYear;
    }
}
