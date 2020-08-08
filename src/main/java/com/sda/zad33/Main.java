package com.sda.zad33;

import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        ImageSearcher imageSearcher = new ImageSearcher();

        System.out.println(
            imageSearcher.getImages(
                Paths.get("src", "main", "resources", "zad33")));

    }
}
