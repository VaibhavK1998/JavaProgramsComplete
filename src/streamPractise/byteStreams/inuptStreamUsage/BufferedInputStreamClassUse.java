package streamPractise.byteStreams.inuptStreamUsage;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamClassUse {
    public static void main(String[] args) throws IOException {
        buffredInputClassUse();
    }

    public static void buffredInputClassUse() throws IOException {
        FileInputStream inputStream = new FileInputStream("FileOutputStreamFile.txt");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        int i = 0;
        while ((i = bufferedInputStream.read()) != -1) {
            System.out.print((char) i);
        }
        bufferedInputStream.close();
    }
}
