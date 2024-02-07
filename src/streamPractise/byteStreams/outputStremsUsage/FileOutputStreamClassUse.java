package streamPractise.byteStreams.outputStremsUsage;

import java.io.*;

public class FileOutputStreamClassUse {
    public static void main(String[] args) throws IOException {
        outputClassUse();
    }

    public static void outputClassUse() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("FileOutputStreamFile.txt");
        String details = "all is good";
        byte detailVaule[] = details.getBytes();
        fileOutputStream.write(detailVaule);
        fileOutputStream.close();
    }
}
