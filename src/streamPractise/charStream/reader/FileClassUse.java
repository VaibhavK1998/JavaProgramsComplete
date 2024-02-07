package streamPractise.charStream.reader;

import java.io.File;
import java.io.IOException;

public class FileClassUse {
    public static void main(String[] args) throws IOException {
        fileClassUse();
    }
    public static void fileClassUse() throws IOException {
        File file=new File("File.txt");
        file.createNewFile();
       System.out.println( file.exists());
       file.delete();
    }
}
