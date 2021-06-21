package ro.java.ctrln;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WriteFile {

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("data.txt");

        byte[] contentArray = Files.readAllBytes(path);
        System.out.println(new String(contentArray));

        Files.write(Paths.get("output" + System.currentTimeMillis() + ".txt"), "Text pe care il scriem in fisier".getBytes());
    }
}
