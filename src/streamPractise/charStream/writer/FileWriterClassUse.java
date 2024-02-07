package streamPractise.charStream.writer;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterClassUse {
    public static void main(String[] args) throws IOException {
        fileWriterClassUse();
    }
    public static void fileWriterClassUse() throws IOException {
        FileWriter fileWriter=new FileWriter("FileWriterClassFile.txt");
        fileWriter.write("this is the file writer class");
        fileWriter.flush();

    }
}
