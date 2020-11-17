package lesson9.files;

import java.io.File;
import java.io.IOException;

public class FileExamples {

    public static void main(String[] args) throws IOException {
        File textFile = new File("test.txt");
        System.out.println("Is file exist: " + textFile.exists());
        boolean result = textFile.createNewFile();
        System.out.println("Is file created: " + result);

        File scrDir = new File("src");
        System.out.println("Is directory: " + scrDir.isDirectory());

    }

}
