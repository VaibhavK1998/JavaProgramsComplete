package streamPractise.byteStreams.inuptStreamUsage;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamClassUse {
    public static void main(String[] args) throws IOException {
        fileInputStreamClassMethod();
    }

    public static void fileInputStreamClassMethod() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("FileOutputStreamFile.txt");
        int i = 0;
        while ((i = fileInputStream.read()) != -1) {
            System.out.print((char) i);
        }
        fileInputStream.close();
    }
}
