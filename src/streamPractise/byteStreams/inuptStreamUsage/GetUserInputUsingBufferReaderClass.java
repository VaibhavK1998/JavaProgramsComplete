package streamPractise.byteStreams.inuptStreamUsage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GetUserInputUsingBufferReaderClass {
    public static void main(String[] args) {
        try {
            readvalueUsingBufferReader();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void readvalueUsingBufferReader() throws IOException {
        System.out.println("Enter Value");
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        Object value = bufferedReader.readLine();
        System.out.println("Received Value : " + value);
        bufferedReader.close();// we use this line to closed bufferReader Stream
    }
}
