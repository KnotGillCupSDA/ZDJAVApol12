package com.sda.zad33;

import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class ImageSearcher {

    public List<File> getImages(Path inputDirectory) {
        List<File> images = new ArrayList<>();
        File inputFile = inputDirectory.toFile();
        if (inputFile.isDirectory()) {
            for (File file : inputFile.listFiles((dir, name) -> {
                String lowerCase = name.toLowerCase();
                return lowerCase.endsWith(".png") || lowerCase.endsWith("jpg");
            })) {
                images.add(file);
            }
        }

        return images;
    }
}
