package streamPractise.charStream.reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderClassUse {
    public static void main(String[] args) throws IOException {
        fileReaderClassUse();
    }

    public static void fileReaderClassUse() throws IOException {
        FileReader fileReader = new FileReader("FileWriterClassFile.txt");
        int i;
        while ((i = fileReader.read()) != -1)
            System.out.print((char) i);
        fileReader.close();
    }
}
