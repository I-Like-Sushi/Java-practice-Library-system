import java.util.*;

public class Books {

    Map<String, Map<String, Object>> booksInStock;
    int bookIDCounter;
    final int BookID = ++bookIDCounter;

    public Books() {
        booksInStock = new HashMap<>();
        booksInStock.put("Lord of the Rings", new HashMap<>(Map.of(
                "Author", "J.R.R. Tolkien",
                "Published", 1954,
                "Genre", "High Fantasy, Adventure"
        )));

        booksInStock.put("1984", new HashMap<>(Map.of(
                "Author", "George Orwell",
                "Published", 1949,
                "Genre", "Dystopian, Political Fiction"
        )));

        booksInStock.put("To Kill a Mockingbird", new HashMap<>(Map.of(
                "Author", "Harper Lee",
                "Published", 1960,
                "Genre", "Fiction, Coming-of-age"
        )));

        booksInStock.put("The Great Gatsby", new HashMap<>(Map.of(
                "Author", "F. Scott Fitzgerald",
                "Published", 1925,
                "Genre", "Novel, Tragedy"
        )));

        booksInStock.put("Pride and Prejudice", new HashMap<>(Map.of(
                "Author", "Jane Austen",
                "Published", 1813,
                "Genre", "Romance, Satire"
        )));
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

    public void deleteBook(String bookName) {
        booksInStock.remove(bookName);

    }
}
