package lesson9.files;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIOExamples {

    public static void main(String[] args) {

        // FileReader/FileInputStream
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(new File("test.txt")));
            String line;
            // (line = reader.readLine()) != null
            while ( (line = reader.readLine()) != null ) {
                System.out.println(line);
            }

            // catch (ParseException | IOException exc) {}
        } catch (FileNotFoundException exc) {
            System.out.println("Couldn't find file on path test.txt");
        } catch (IOException exc) {
            System.out.println("Couldn't read line from file, cause: " + exc.getMessage());
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        // FileWriter/FileOutputStream
        // try-with-resources
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("out.txt", true))) {
            writer.write("Tinkoff 2349742 RUB 2345.34\n");
            //writer.write("Tinkoff 2349742 RUB 2345.34\n");
            // or
            //writer.newLine();
        } catch (IOException exc) {
            exc.printStackTrace();
        }


    }

}
