package InterviewPrograms;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataFromTextFile {
    public static void main(String[] args) throws IOException {
        readDataFromTextFileUsingFileReader();
    }

    public static void readDataFromTextFileUsingFileReader() throws IOException {
        //   "C:\Users\HP\Desktop\FileHandleingPractiseFiles\Document 3.docx"

        FileReader fr = new FileReader("C:\\Users\\HP\\Desktop\\FileHandleingPractiseFiles\\Document 3.docx");
        BufferedReader br = new BufferedReader(fr);
        String str;
        while ((str=br.readLine())!= null) {
            System.out.println(str);
        }
        br.close();
    }
}
