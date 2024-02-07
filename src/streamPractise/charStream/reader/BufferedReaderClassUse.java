package streamPractise.charStream.reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderClassUse {
    public static void main(String[] args) throws IOException {
        readDataUsingBufferedReaderClass();
    }

    public static void readDataUsingBufferedReaderClass() throws IOException {
        FileReader reader = new FileReader("FileOutputStreamFile.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);
        String content = bufferedReader.readLine();
        bufferedReader.close();
        System.out.println("received content : " + content);
    }
}
