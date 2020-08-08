package com.sda.zad33;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        ImageSearcher imageSearcher = new ImageSearcher();

        Path inputDirectory = Paths.get("src", "main", "resources", "zad33");
        System.out.println(imageSearcher.getImages(inputDirectory));
        System.out.println(imageSearcher.getImagesWithWalk(inputDirectory));
        System.out.println(imageSearcher.getImagesWithWalkTree(inputDirectory));

    }
}
