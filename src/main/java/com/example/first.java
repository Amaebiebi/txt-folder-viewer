package com.example;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class first {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // String inFilePath = scanner.nextLine();

        Path filePath = Paths.get("sample.txt");
        //File file = filePath.toFile();

        String content = "";
        try {
            content = Files.readString(filePath);

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(content);
    }

}
