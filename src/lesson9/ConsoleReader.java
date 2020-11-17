package lesson9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ConsoleReader {

    public static void main(String[] args) throws IOException {
        // System.in
        // System.out
        // System.err
        // Scanner scanner = new Scanner(System.in);

        // InputStream
        // OutputStream
        // Reader
        // Writer

        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число:");
        String line = consoleReader.readLine();
        int number = Integer.parseInt(line); // parseInt(line, <система счисления>)
        System.out.println("Введенное число: " + number);

        System.out.println("Введите счет: "); // %%
        String accountLine = consoleReader.readLine();
        System.out.println(accountLine);
    }

}
