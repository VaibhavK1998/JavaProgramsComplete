package FileHandeling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterClassUses {
    public static void main(String[] args) throws IOException {
        //fileCreateTest();
        //fileInformation();
        fileWriteTest();
        FileReadTest();

    }


    public static void fileWriteTest() {
        try {
            FileWriter filewriter = new FileWriter("Files/wordFile4.txt");
            filewriter.write("employee details file/n wdnfbfjbdnmfdsn n dvdjsn ");// this method used to write in file
            filewriter.flush();// manadatory otherwise it will not write in file
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void fileCreateTest() {
        File file = new File("./Files/wordFile4.txt"); // step1 crete object of file class
        try {

            file.createNewFile(); // step2 this method create new file in mention folder
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void fileInformation() throws IOException {
        File file = new File("./Files/wordFile5.txt");
        if (file.exists()) {
            System.out.println("File name" + file.getName());
            System.out.println("absolute path" + file.getAbsolutePath());
            System.out.println("File can read" + file.canRead());
            System.out.println("File can write" + file.canWrite());
            System.out.println("File is Directory" + file.isDirectory());
            System.out.println("File last modified : " + file.lastModified());
            System.out.println("File class" + file.getClass());
            System.out.println("File path" + file.getPath());
            // System.out.println("File path"+file.delete());
        } else {
            file.createNewFile();
            System.out.println("File name" + file.getName());
            System.out.println("absolute path" + file.getAbsolutePath());
            System.out.println("File can read" + file.canRead());
            System.out.println("File can write" + file.canWrite());
            System.out.println("File is Directory" + file.isDirectory());
            System.out.println("File last modified" + file.lastModified());
            System.out.println("File class" + file.getClass());
            System.out.println("File path" + file.getPath());
            // System.out.println("File path"+file.delete());

        }
    }

    public static void FileReadTest() {
        File file = new File("./Files/wordFile4.txt");
        try{
            Scanner scn=new Scanner(file);
            while(scn.hasNextLine()){
                String content= scn.nextLine();
                System.out.println(content);
            }
            scn.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

