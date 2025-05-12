package borrowers;

import java.util.*;

public class Borrower {

    private static Map<String, List<Object>> borrowers = new HashMap<>();
    private String name;
    private String lastName;
    private int age;
    private static int borrowerIdNumberCounter = 0;
    private final int borrowerIdNumber;

    public Borrower(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.borrowerIdNumber = ++borrowerIdNumberCounter;
        String fullname = name + " " + lastName;
        List<Object> borrowerList = Arrays.asList(age, borrowerIdNumber);
        borrowers.put(fullname, borrowerList);
    }

    public void setBorrower(String name, String lastName, int age, int idNumber) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public String getBorrowerName() {
        return "Name: " + name + " " + lastName + " ";
    }

    public String getBorrowerAge() {
        return "Age: " + age;
    }

    public String getBorrowerIDNumber() {
        return "ID: " + borrowerIdNumber;
    }

    public static Map<String, List<Object>> getAllBorrowers() {
        return borrowers;
    }
}
