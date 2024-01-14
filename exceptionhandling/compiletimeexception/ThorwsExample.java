package exceptionhandling.compiletimeexception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ThorwsExample {
    /**
     * If a method is capable of causing an exception that it doesn't handle , it must specify this behaviour so that callers of
     * the method can gurad themselves against that exception. you do this by including throws clause in the method declaration.
     *
     * Here in this example readFile() is causing an FileNotFound Exception that it doesn't handle. Therefore, readFile() is including
     * throws in method declaration indicating whoever calling this function should handle it by themselves.
     *
     */
    public static void main(String[] args) {

        try{
            readFile("exceptionhandling/greetings.txt");
        }
        catch (FileNotFoundException e) { // Handling Exception thrown by readFile()
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Process Complete");
        }
    }

    public static void readFile(String fileName) throws FileNotFoundException{
        FileInputStream fis = new FileInputStream(fileName);
        Scanner scanner = new Scanner(fis);
        System.out.println(scanner.nextLine());
        scanner.close();
    }
}
