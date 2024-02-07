package streamPractise.byteStreams.inuptStreamUsage;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class UseOfSystemClass {
    /*
    The System class in Java is a final class that cannot be instantiated. It provides access to system resources such as the standard input, output, and error streams, as well as system properties and environment variables. The System class also provides a number of utility methods, such as the currentTimeMillis() method, which returns the current time in milliseconds, and the exit() method, which terminates the Java Virtual Machine (JVM).
Here are some examples of how the System class can be used in Java:
To print a message to the console, you can use the System.out.println() method. For example, the following code will print the message "Hello, world!" to the console:
System.out.println("Hello, world!");
Use code with caution.
Learn more
To read input from the console, you can use the System.in.readLine() method. For example, the following code will read a line of input from the console and store it in the variable name:
String name = System.in.readLine();
Use code with caution.
Slong currentTimeMillis = System.currentTimeMillis();
System.out.println(currentTimeMillis);
Use code with caution.
Learn more
To terminate the JVM, you can use the System.exit() method. For example, the following code will terminate the JVM:
System.exit(0);
Use code with caution.
Learn more
The System class is a powerful tool that can be used to access system resources and perform a variety of tasks. It is an essential part of the Java programming language.
     */

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("ramesh");
        System.err.println("error msg going to console");
        System.setOut(new PrintStream(new FileOutputStream("abc.txt")));
        System.out.println("ramesh");// writing this outpu in file.
        System.setErr(new PrintStream(new FileOutputStream("abc.txt")));
        System.err.println("error msg going to write in file");

    }

}
