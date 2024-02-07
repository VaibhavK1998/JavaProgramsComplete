package streamPractise.byteStreams.inuptStreamUsage;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamClassUse {
    public static void main(String[] args) throws IOException {
        dataInputStream();
    }

    public static void dataInputStream() throws IOException {
        DataInputStream inputStream = new DataInputStream(new FileInputStream("FileOutputStreamFile.txt"));
        String recivedData =inputStream.readUTF();
        System.out.println("data recived from file :" + recivedData);
    }
}
