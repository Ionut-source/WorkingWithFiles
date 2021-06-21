package ro.java.ctrln;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadFile {

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("data1.txt");
        byte[] contentArray = Files.readAllBytes(Paths.get("data1.txt"));

        String content = new String(contentArray);

        System.out.println(content);
    }
}
