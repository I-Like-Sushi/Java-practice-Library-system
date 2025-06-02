package books;

import java.util.*;

public class Book {

    BookList bookList = new BookList();

    Random rand = new Random();

    private String bookLanguage;
    private String title;
    private String author;
    private String genre;
    private int bookYearPublished;
    private String isbn;

    public Book(String title, String author, String genre, int bookYearPublished, String bookLanguage) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.bookYearPublished = bookYearPublished;
        this.bookLanguage = bookLanguage;
    }

    public int setBookLanguageIsbn(String bookLanguage) {
        int isbnLanguage;
        switch (bookLanguage) {
            case "English" -> isbnLanguage = rand.nextInt(2);
            case "French" -> isbnLanguage = 2;
            case "German" -> isbnLanguage = 3;
            case "Japanese" -> isbnLanguage = 4;
            case "Russian" -> isbnLanguage = 5;
            case "Chinese" -> isbnLanguage = 6;
            default -> isbnLanguage = 999999;
        }
        return isbnLanguage;
    }

    public void setIsbn () {
        isbn = "ISBN " + 978 + "-" + setBookLanguageIsbn(bookLanguage) + "-" + 118 + "-" + String.format("%03d", rand.nextInt(1000)) + "-" + rand.nextInt(10);
    }

    public void setTitle (String title) { this.title = title; }
    public void setAuthor (String author) { this.author = author; }
    public void setGenre (String genre) { this.genre = genre; }
    public void setYearPublished (int yearPublished) { this.bookYearPublished = yearPublished; }


    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getGenre() { return genre; }
    public int getBookYearPublished() { return bookYearPublished; }
    public String getBookLanguage() { return bookLanguage; }
    public String getIsbn() { return isbn; }
}
