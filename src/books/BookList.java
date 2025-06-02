package books;

import java.util.*;

public class BookList {

    public Map<String, Map<String, Object>> booksInStock;

    private static int bookIDCounter;
    int BookID;

    public BookList() {
        booksInStock = new HashMap<>();
        booksInStock.put("Lord of the Rings", new HashMap<>(Map.of(
                "Author", "J.R.R. Tolkien",
                "Published", 1954,
                "Genre", "High Fantasy, Adventure",
                "BookID", getBookIDCounter(),
                "Status", BookStatus.status.AVAILABLE
        )));

        booksInStock.put("1984", new HashMap<>(Map.of(
                "Author", "George Orwell",
                "Published", 1949,
                "Genre", "Dystopian, Political Fiction",
                "BookID", getBookIDCounter(),
                "Status", BookStatus.status.CHECKED_OUT
        )));

        booksInStock.put("To Kill a Mockingbird", new HashMap<>(Map.of(
                "Author", "Harper Lee",
                "Published", 1960,
                "Genre", "Fiction, Coming-of-age",
                "BookID", getBookIDCounter(),
                "Status", BookStatus.status.RESERVED
        )));

        booksInStock.put("The Great Gatsby", new HashMap<>(Map.of(
                "Author", "F. Scott Fitzgerald",
                "Published", 1925,
                "Genre", "Novel, Tragedy",
                "BookID", getBookIDCounter(),
                "Status", BookStatus.status.RESERVED
        )));

        booksInStock.put("Pride and Prejudice", new HashMap<>(Map.of(
                "Author", "Jane Austen",
                "Published", 1813,
                "Genre", "Romance, Satire",
                "BookID", getBookIDCounter(),
                "Status", BookStatus.status.AVAILABLE
        )));
    }

    public void addBookInList(String bookTitle, String author, String genre, int published) {
        Map<String, Object> newBookInList = new HashMap<>();
        newBookInList.put("Published", published);
        newBookInList.put("Genre", genre);
        newBookInList.put("Author", author);
        newBookInList.put("BookID", getBookIDCounter());
        newBookInList.put("Status", BookStatus.status.AVAILABLE);
        booksInStock.put(bookTitle, (newBookInList));
        System.out.println("The new book has been added to the database.");
    }

    private int getBookIDCounter() {
        this.BookID = ++bookIDCounter;
        return BookID;
    }

    public void setBooksInStock(Map<String, Map<String, Object>> booksInStock) {
        this.booksInStock = booksInStock;
    }

    public Map<String, Map<String, Object>> getBooksInStock() {
        return booksInStock;
    }

    public void printBooksInStock() {
        for (Map.Entry<String, Map<String, Object>> entry : booksInStock.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public void deleteBook(String bookName) { booksInStock.remove(bookName); }

}
