package streamPractise.byteStreams.outputStremsUsage;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamUse {
    public static void main(String[] args) throws IOException {
        bufferOutputClassUse();
    }

    public static void bufferOutputClassUse() throws IOException {
        FileOutputStream outputStream = new FileOutputStream("FileOutputStreamFile.txt");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
        String text = "sab thik chl raha hai";
        byte[] content = text.getBytes();
        bufferedOutputStream.write(content);
        bufferedOutputStream.close();
    }
}
