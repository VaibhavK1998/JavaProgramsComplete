package streamPractise.charStream.writer;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterClassUse {
    public static void main(String[] args) throws FileNotFoundException {
        printWriterClassUse();
    }
    public static void printWriterClassUse() throws FileNotFoundException {
        PrintWriter writer=new PrintWriter("FilePrintWriter.txt");
        writer.write("this is the new content");
        writer.flush();
    }
}
