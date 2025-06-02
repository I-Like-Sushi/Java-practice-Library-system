import books.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookList bookList = new BookList();

        System.out.print("Type in the book title: ");
        String newBookTitle = sc.nextLine();

        System.out.print("Type in the book author: ");
        String newBookAuthor = sc.nextLine();

        System.out.print("Type in the book genre: ");
        String newBookGenre = sc.nextLine();

        System.out.print("Type in the book year: ");
        int newBookYearPublished = sc.nextInt();

        sc.nextLine();
        System.out.print("Type in the language of the book: ");
        String languageInput = sc.nextLine();

        Book book = new Book(newBookTitle, newBookAuthor, newBookGenre, newBookYearPublished, languageInput);
        book.setIsbn();
        System.out.println(book.getIsbn());
        bookList.addBookInList(newBookTitle, newBookAuthor, newBookGenre, newBookYearPublished);
        System.out.println(bookList.getBooksInStock());





//        int adminMenuOptions;
//        int borrowMenuOptions;
//        boolean login = true;
//        boolean adminLogin;
//        Scanner sc = new Scanner(System.in);
//
//        while (login) {
//
//            System.out.println("Welcome to Book Management System");
//            System.out.println(BorrowingOptions.BorrowingMenuOptions);
//            System.out.print("Please select an option: ");
//            borrowMenuOptions = sc.nextInt();
//
//            if (borrowMenuOptions == 1) {
//
//                System.out.print("Enter Name: ");
//                String name = sc.nextLine();
//                System.out.print("Enter lastName: ");
//                String LastName = sc.nextLine();
//                System.out.print("Enter Age: ");
//                int Age = sc.nextInt();
//                sc.nextLine();
//
//                Borrower borrower = new Borrower(name, LastName, Age);
//
//                System.out.println(borrower.getBorrowerName());
//                System.out.println(borrower.getBorrowerAge());
//                System.out.println(borrower.getBorrowerIDNumber());
//
//            }
//            else if (borrowMenuOptions == 2) {
//
//                System.out.print("Enter book ID you want to borrow: ");
//                int bookID = sc.nextInt();
//                sc.nextLine();
//                boolean found = false;
//
//                for (String bookTitle : books.getBooksInStock().keySet()) {
//                    Map<String, Object> details = books.getBooksInStock().get(bookTitle);
//                    if (details.containsKey("BookID") && details.get("BookID").equals(bookID)) {
//                        System.out.println("Found book: " + bookTitle + " with details: " + details);
//                        found = true;
//                        if (details.containsKey("Status")) {
//                            ;
//                        }
//                        break;
//                    }
//                }
//
//                if(!found) {
//                    System.out.println("No book found with the given ID.");
//                }
//
//
//
//
//            }
//            else if (borrowMenuOptions == 3) {}
//            else if (borrowMenuOptions == 4) {}
//
//            else if (borrowMenuOptions == 5) { login = false; }
//
//            else if (borrowMenuOptions == 9) {
//                adminLogin = true;
//                while (adminLogin) {
//                    System.out.print(Admin.adminMainMenu);
//                    System.out.print("Choose an option: ");
//                    adminMenuOptions = (sc.nextInt());
//                    sc.nextLine();
//                    if (adminMenuOptions == 1) {
//
//                        System.out.print("Enter Name: ");
//                        String name = sc.nextLine();
//                        System.out.print("Enter lastName: ");
//                        String LastName = sc.nextLine();
//                        System.out.print("Enter Age: ");
//                        int Age = sc.nextInt();
//                        sc.nextLine();
//
//                        Borrower borrower = new Borrower(name, LastName, Age);
//
//                        System.out.println(borrower.getBorrowerName());
//                        System.out.println(borrower.getBorrowerAge());
//                        System.out.println(borrower.getBorrowerIDNumber());
//
//                    }
//                    else if (adminMenuOptions == 2) {
//                        if (Borrower.getAllBorrowers().isEmpty()) {
//                            System.out.println("No borrowers in the database");
//                        } else {
//                            System.out.println(Borrower.getAllBorrowers());
//                        }
//                    }
//                    else if (adminMenuOptions == 3) {
//
//                        System.out.print("Enter Name: ");
//                        String name = sc.nextLine();
//                        System.out.print("Enter lastName: ");
//                        String LastName = sc.nextLine();
//                        System.out.print("Enter Age: ");
//                        int Age = sc.nextInt();
//                        sc.nextLine();
//
//                        Employee employee = new Employee(name, LastName, Age);
//                        System.out.println(employee.getEmployeeName());
//                        System.out.println(employee.getEmployeeAge());
//                        System.out.println(employee.getEmployeeIDNumber());
//                    }
//                    else if (adminMenuOptions == 4) {
//                        if (Employee.getAllEmployees().isEmpty()) {
//                            System.out.println("No employees in the database");
//                        } else {
//                            System.out.println(Employee.getAllEmployees());
//                        }
//                    }
//                    else if (adminMenuOptions == 5) {
//
//                        System.out.print("Enter book title: ");
//                        String bookSearch = sc.nextLine();
//                        boolean found = false;
//                        for (String bookTitle : books.booksInStock.keySet()) {
//                            if (bookTitle.toLowerCase().contains(bookSearch.toLowerCase())) {
//                                System.out.println("Found: " + bookTitle + " → " + books.booksInStock.get(bookTitle));
//                                found = true;
//                            }
//                        }
//
//                        if (!found) {
//                            System.out.println("No books found.");
//                        }
//
//                    }
//                    else if (adminMenuOptions == 6) {
//                        for (String bookTitle : books.booksInStock.keySet()) {
//                            System.out.println("Title: " + bookTitle + " " + books.getBooksInStock().get(bookTitle));
//                        }
//                    }
//                    else if (adminMenuOptions == 7) { adminLogin = false; }
//                    else if (adminMenuOptions == 8) { adminLogin = false; login = false; }
//                    else { System.out.println("Unknown menu option. Please try again."); }
//                }
//            }
//            else { System.out.println("Unknown menu option. Please try again."); }
//        }
    }
}