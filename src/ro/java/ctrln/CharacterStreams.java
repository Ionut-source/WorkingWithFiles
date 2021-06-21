package ro.java.ctrln;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreams {

    public static void main(String[] args) {

        try (FileReader fileReader = new FileReader("data.txt");
            FileWriter fileWriter = new FileWriter("output" + System.currentTimeMillis() + ".txt")) {

                int characterRead = fileReader.read();

                while(characterRead != -1) {
                    fileWriter.write(characterRead);
                    characterRead = fileReader.read();
                }

        } catch (IOException e) {
            System.out.println("A aparut o excetie IOException!");
            e.printStackTrace();
        }
    }
}
