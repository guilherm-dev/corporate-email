package emailapp;

import java.util.Scanner;

public class EmailApp{
public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the first name");
    String firstName = scanner.nextLine();

    System.out.println("Enter the last name");
    String lastName = scanner.nextLine();

    Email eml = new Email(firstName, lastName);
    System.out.println(eml.showInfo());



}
}