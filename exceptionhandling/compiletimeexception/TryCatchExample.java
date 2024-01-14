package exceptionhandling.compiletimeexception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryCatchExample {

    /** Without try catch block compile will throw as Unhandled exception: java.io.FileNotFoundException
     * As this is compiled time exception/ checked exception , this needs to be handled by user by surrounding code with try catch block.
     * Now we have Surrouded suspected liine with try catch block . hence there is no failure.
     * In case file has been deleted mistakenly / file is not present at specified path , exception will be thrown from catch block.
     *
     * Finally, block runs no matter what. hence most of  the clean up activity is done under finally block.
     *
     * By this way  even though there is an exception occurred, it has been handled by our own terms.
     */
        public static void main(String[] args) {
            try {
                FileInputStream fis = new FileInputStream("exceptionhandling/greetings.txt"); // open a connect from greetings.txt
                Scanner scanner = new Scanner(fis); // Read data from file
                System.out.println( scanner.nextLine()); // print line 1 from greeting.txt
                scanner.close();
            }catch( FileNotFoundException e) {
                System.out.print("File not found: " + e.getMessage());
            }
            finally {
                System.out.println("process Complete");
            }
    }
}
