import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Books books = new Books();
        int menuOptions;
        boolean Login = true;
        Scanner sc = new Scanner(System.in);


        String menu = """
                -------------------------------------------------
                                Welcome to Admin's Portal
                -------------------------------------------------
                Following Functionalities are available:
                
                1- Add Borrower
                2- View Active borrowers
                3- Add Employee
                4- View all Employees
                5- Search for book title
                6- View all Books and status in Library
                7- Logout
                -------------------------------------------------
                
                """;
        



        while (Login) {

            System.out.print(menu);
            System.out.print("Choose an option: ");
            menuOptions = (sc.nextInt());
            sc.nextLine();
            if (menuOptions == 1) {

                System.out.print("Enter Name: ");
                String name = sc.nextLine();
                System.out.print("Enter lastName: ");
                String LastName = sc.nextLine();
                System.out.print("Enter Age: ");
                int Age = sc.nextInt();
                sc.nextLine(); // Consume the leftover newline

                Borrower borrower = new Borrower(name, LastName, Age);

                System.out.println(borrower.getBorrowerName());
                System.out.println(borrower.getBorrowerAge());
                System.out.println(borrower.getBorrowerIDNumber());

            } else if (menuOptions == 2) {
                if (Borrower.getAllBorrowers().isEmpty()) {
                    System.out.println("No borrowers in the database");
                } else {
                    System.out.println(Borrower.getAllBorrowers());
                }
            }

            else if (menuOptions == 3) {

                System.out.print("Enter Name: ");
                String name = sc.nextLine();
                System.out.print("Enter lastName: ");
                String LastName = sc.nextLine();
                System.out.print("Enter Age: ");
                int Age = sc.nextInt();
                sc.nextLine(); // Consume the leftover newline

                Employee employee = new Employee(name, LastName, Age);

                System.out.println(employee.getEmployeeName());
                System.out.println(employee.getEmployeeAge());
                System.out.println(employee.getEmployeeIDNumber());


            }
            else if (menuOptions == 4) {
                if (Employee.getAllEmployees().isEmpty()) {
                    System.out.println("No employees in the database");
                } else {
                    System.out.println(Employee.getAllEmployees());
                }


            }
            else if (menuOptions == 5) {

                System.out.print("Enter book title: ");
                String bookSearch = sc.nextLine();
                boolean found = false;
                for (String bookTitle : books.booksInStock.keySet()) {
                    if (bookTitle.toLowerCase().contains(bookSearch.toLowerCase())) {
                        System.out.println("Found: " + bookTitle + " → " + books.booksInStock.get(bookTitle));
                        found = true;
                    }
                }

                    if (!found) {
                        System.out.println("No books found.");
                    }

                }
            else if (menuOptions == 6) {
                for (String bookTitle : books.booksInStock.keySet()) {
                    System.out.println("Title: " + bookTitle + " " +  books.getBooksInStock().get(bookTitle));
                }
            }
            else if (menuOptions == 7) {
                Login = false;
            }
            else {
                System.out.println("Unknown menu option. Please try again.");
            }
        }
    }
}