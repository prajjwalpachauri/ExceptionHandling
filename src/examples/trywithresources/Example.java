/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 15/09/20
 *  Time: 1:30 PM
 *  File Name : Example.java
 * */
package examples.trywithresources;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        // try with resources block
        String name = "John";
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Please enter your name: ");
            scanner.close();
            name = scanner.nextLine();
        } catch (Exception exception) {
            System.err.println(exception.getMessage());
        } finally {
            System.out.println("Hello, " + name);
        }
    }
}
