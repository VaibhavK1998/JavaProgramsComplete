package streamPractise.charStream.writer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterClassUse {
    public static void main(String[] args) throws IOException {
        bufferedWriterClassUse();
    }

    public static void bufferedWriterClassUse() throws IOException {
        FileWriter writer = new FileWriter("buffredWriterFile.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        String content = "this is buffred writer content";
        bufferedWriter.write(content);
        bufferedWriter.flush();
    }
}
