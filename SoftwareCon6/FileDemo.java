package SoftwareCon6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        File path = new File("hello.txt");
        System.out.println("We got a file: " + path);
        System.out.println("Does it exist? " + path.exists());
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(path)));
        String firstLine = reader.readLine();
        reader.close();
        System.out.println("Read a line " + firstLine);
    }
}
