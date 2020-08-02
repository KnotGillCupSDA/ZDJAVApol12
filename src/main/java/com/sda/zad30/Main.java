package com.sda.zad30;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        Path resourceDirectory = Paths.get("src", "main", "resources");

        System.out.println(resourceDirectory);
        System.out.println(resourceDirectory.toAbsolutePath());
        System.out.println(resourceDirectory.toFile().exists());
        System.out.println(resourceDirectory.toFile().isDirectory());

        Path ourFile = resourceDirectory.resolve("someTextFile.txt");
        System.out.println(ourFile);
        System.out.println(ourFile.toAbsolutePath());
        System.out.println(ourFile.toFile().exists());
        System.out.println(ourFile.toFile().isDirectory());

        List<String> content = Files.readAllLines(ourFile);
        System.out.println(content);

        List<String> reversed = new ArrayList<>(content.size());

        for (int i = content.size() - 1; i >= 0; i--) {
            reversed.add(new StringBuilder(content.get(i)).reverse().toString());
        }

        String nameWithExtension = ourFile.toFile().getName();
        String withoutExtension = nameWithExtension.substring(0, nameWithExtension.lastIndexOf("."));
        String extension = nameWithExtension.substring(nameWithExtension.lastIndexOf("."));
        System.out.println(withoutExtension);
        System.out.println(extension);

        Files.write(resourceDirectory.resolve(new StringBuilder(withoutExtension).reverse().toString() + extension),
            reversed,
            StandardOpenOption.CREATE);

    }
}
