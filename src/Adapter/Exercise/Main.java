package Adapter.Exercise;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileIO fileProperties = new FileProperties();
        try {
            fileProperties.readFromFile("file.txt");
            fileProperties.setValues("","");
            fileProperties.writeToFile("file.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
